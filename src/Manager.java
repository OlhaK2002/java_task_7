class Manager extends Employee {
    public double bonus;

    Manager(String name_value, String department_name_value, double salary_value, Integer manager_value, double b) throws EmployeeInRegistryException {

        super(name_value, department_name_value, salary_value, manager_value);
        this.bonus = b;
    }

    public double getBonus() {
        return this.bonus;
    }
}
