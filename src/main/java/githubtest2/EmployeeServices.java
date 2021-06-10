package githubtest2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class EmployeeServices {

    private List<Employee> employees = new ArrayList<>();

    public void save(Employee employee) {
        employees.add(employee);
    }

    public Employee findOldestEmployee() {
        return employees.stream().sorted(Comparator.comparing(Employee::getYearOfBirth).reversed());
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}
