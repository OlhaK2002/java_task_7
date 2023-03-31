public class Employee {
    public int id, next_id = 1;
    public String name, department_name;
    public double salary;
    public Integer manager_id;

    Employee(String name_value, String department_name_value, double salary_value, Integer manager_id) {
        this.id = this.next_id++;
        this.name = name_value;
        this.department_name = department_name_value;
        this.salary = salary_value;
        this.manager_id = manager_id;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartmentName() {
        return department_name;
    }

    public double getSalary() {
        return salary;
    }

    public int getManagerId() {
        return manager_id;
    }

    public String toString () {
        return this.name + " " + this.department_name;
//        return getId() + ". " + getName() + " " + getSurname() + " - " + getSalary() + "; manager - " + getManagerName() + "; top manager - " + getTopManager().getName() + " " + getTopManager().getSurname();
    }

}

