import java.util.*;

public class EmployeeProcessor {

    /**
     * This method processes the elements of the employees set that are...
     * (here you would describe what processing is done)
     *
     * @param employees The set of employees to process.
     * @return A list of processed employees.
     */
    public List<Employee> processEmployees(Set<Employee> employees) {
        List<Employee> processedEmployees = new ArrayList<>();

        for (Employee emp : employees) {
            // Process each employee (example: filter, transform, etc.)
            if (emp.isActive()) {
                processedEmployees.add(emp);
            }
        }

        return processedEmployees;
    }

    public static void main(String[] args) {
        // Example usage:
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee("John", true));
        employees.add(new Employee("Alice", false));
        employees.add(new Employee("Bob", true));

        EmployeeProcessor processor = new EmployeeProcessor();
        List<Employee> result = processor.processEmployees(employees);

        System.out.println("Processed employees:");
        for (Employee emp : result) {
            System.out.println(emp.getName());
        }
    }
}

class Employee {
    private String name;
    private boolean active;

    public Employee(String name, boolean active) {
        this.name = name;
        this.active = active;
    }

    public String getName() {
        return name;
    }

    public boolean isActive() {
        return active;
    }
}
