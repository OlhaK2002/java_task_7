import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class Demo {
    public static void main(String[] args) throws EmployeeInRegistryException {
        Registry register_example1 = Registry.getRegistry();
        Employee employee = new Employee("Pol Makartni", "test", 1, null);
        register_example1.addWorker(employee);
        register_example1.printList();
        Registry register_example2 = Registry.getRegistry();
        Employee employee_2 = new Manager("Stiles Stilinski", "test1", 2, null, 3);
        register_example2.addWorker(employee_2);
        register_example2.printList();
        Employee employee_3 = new Employee("Olha Kozlovska", "test3", 3, 2);
        register_example2.addWorker(employee_3);
        register_example2.printList();
        Employee employee_4 = new Employee("Pol Makartni", "test", 3, 2);
        register_example2.addWorker(employee_4);
        register_example2.printList();
        Employee employee_5 = new Employee("Olha Stilinski", "test3", 3, 2);
        register_example2.addWorker(employee_5);
        register_example2.printList();
    }
}
