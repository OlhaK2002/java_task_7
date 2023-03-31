import java.util.ArrayList;

public class Registry {
    private static Registry instance;
    ArrayList workers;

    private Registry() {
        this.workers = new ArrayList<Employee>();
    }

    public static Registry getRegistry() {
        if (instance == null) {
            instance = new Registry();
        }
        return instance;
    }

    public void printList() {
        System.out.println(workers);
    }

    public void addWorker(Employee employee_data) throws EmployeeInRegistryException {
        for (int i = 0; i < this.workers.size(); i++) {
            Employee worker_data = (Employee) this.workers.get(i);
            if (employee_data.name == worker_data.name || employee_data.department_name == worker_data.department_name) {
                throw new EmployeeInRegistryException("Employee need to be unique");
            }
        }
        this.workers.add(employee_data);
    }
}
