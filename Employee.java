class Employee {
    private int employeeId;
    private String name;
    public double salary;

    public Employee(int employeeId, String name, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.salary = salary;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("\n Employee ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary+"\n");
    }
}

class Test {
    public static void main(String[] args) {
        Employee employee = new Employee(1, "John Doe", 50000);
        employee.displayEmployeeDetails();
        System.out.println("\n");

        DevOpsEngineer devOpsEngineer = new DevOpsEngineer(2, "Jane Doe", 60000, 5000);
        devOpsEngineer.displayEmployeeDetails();
    }
}

