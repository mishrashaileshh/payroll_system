package Employee_PayRoll_System.src;

import java.util.ArrayList;

// Abstract Employee Class
abstract class Employee{
    private String name;
    private int id;
    private static int numEmp;

    // Constructor
    public Employee(String name){
        this.name = name;
        numEmp++;
        this.id = numEmp;
    }

    // Getter Name Method
    public String getName(){
        return this.name;
    }

    // Getter Id Method
    public int getId(){
        return this.id;
    }

    // Getter Num_Emp Method
    public static int getNumEmp(){
        return numEmp;
    }

    // Abstract Method
    public abstract double calculateSalary();

    // Polymorphism- Override
    @Override
    public String toString(){
        return "Employee [name="+name+", id="+id+", salary="+calculateSalary()+"]";
    }
}

// Inherits Employee - Full Time Employee Class 
class FullTimeEmployee extends Employee{
    private double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, double monthlySalary){
        super(name); //accessing parent class constructor using super().
        this.monthlySalary = monthlySalary;
    }

    // Overring Calculate Salary
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}

// Inherits Employee - Part Time Employee Class
class PartTimeEmployee extends Employee{
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate){
        super(name);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }
} 

class PayrollSystem{
    private ArrayList<Employee> employeeList;

    public PayrollSystem(){
        employeeList = new ArrayList<>();
    }

    // Add Employee
    public void addEmployee(Employee employee){
        employeeList.add(employee);
    }

    // Remove Employee
    public void removeEmployee(int id){
        Employee employeeToRemove = null;

        // Using forEach() loop over employeeList which finds the particular id of employee and remove that employee.
        for(Employee emp : employeeList){
            // getId() method from Employee Class.
            if (emp.getId() == id) {
                employeeToRemove = emp;
                break;                
            }
        }

        // Removing the founded employee using remove() method of ArrayList
        if(employeeToRemove != null){
            employeeList.remove(employeeToRemove);
        }
    }

    // Display Employees
    public void displayEmployees(){
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
    }

}
