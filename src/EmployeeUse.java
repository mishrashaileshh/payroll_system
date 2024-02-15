package Employee_PayRoll_System.src;

public class EmployeeUse {
    public static void main(String[] args){
        PayrollSystem payrollSystem = new  PayrollSystem();

        FullTimeEmployee emp1 = new FullTimeEmployee("Vikas", 70000);

        FullTimeEmployee emp2 = new FullTimeEmployee("Raj", 50000);

        PartTimeEmployee emp3 = new PartTimeEmployee("Manish", 40, 100);

        // Add
        payrollSystem.addEmployee(emp1);
        payrollSystem.addEmployee(emp2);
        payrollSystem.addEmployee(emp3);

        // Display
        System.out.println("Initial Employees Detail: ");
        payrollSystem.displayEmployees();

        // Remove
        System.out.println("-----------");
        payrollSystem.removeEmployee(3);

        // Display
        System.out.println("Remaining Employees Detail: ");
        payrollSystem.displayEmployees();

    }
}
