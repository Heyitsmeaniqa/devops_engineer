class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(int employeeId, String name, double salary, double bonus) {
        super(employeeId, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public double calculateTotalSalary() {
        return salary + bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();

        System.out.println("Bonus: " + bonus);
        System.out.println("Total Salary: " + calculateTotalSalary());
    }
}

 