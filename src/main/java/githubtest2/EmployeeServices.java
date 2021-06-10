package githubtest2;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServices {

    private List<Employee> employees = new ArrayList<>();

    public void save(Employee employee) {
        employees.add(employee);
    }

}
