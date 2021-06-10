package githubtest2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeServices {

    private List<Employee> employees = new ArrayList<>();

    public void save(Employee employee) {
        employees.add(employee);
    }

    public Employee findOldestEmployee() {
        return employees.stream().sorted(Comparator.comparing(Employee::getYearOfBirth).reversed()).collect(Collectors.toList()).get(0);
    }

    public List<Employee> findBySalaryLargerThan(int salary) {
        return employees.stream().filter(e -> e.getSalary() > salary).collect(Collectors.toList());
    }

    public List<Employee> getEmployees() {
        return new ArrayList<>(employees);
    }
}
