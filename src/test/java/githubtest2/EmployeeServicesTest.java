package githubtest2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeServicesTest {

    private EmployeeServices services = new EmployeeServices();
// üres sorba írok próba
    @Test
    void testSaveEmployeeThenList() {
        /* nem üres sorba írok próba */ services.save(new Employee("John Doe", 1970, 200_000));
        List<Employee> employees = services.getEmployees();

        assertEquals(1, employees.size());
        assertEquals("John Doe", employees.get(0).getName());
    }

    @Test
    void testFindOldestEmployee() {
        services.save(new Employee("John Doe", 1970, 200_000));
        services.save(new Employee("Jane Doe", 1980, 250_000));
        services.save(new Employee("Jack Doe", 1990, 180_000));

        assertEquals("John Doe", services.findOldestEmployee().getName());
    }

    @Test
    void testFindBySalaryLargerThan() {
        services.save(new Employee("John Doe", 1970, 200_000));
        services.save(new Employee("Jane Doe", 1980, 250_000));
        services.save(new Employee("Jack Doe", 1990, 180_000));

        List<Employee> result = services.findBySalaryLargerThan(200_000);

        assertEquals(1, result.size());
        assertEquals("Jane Doe", result.stream().map(Employee::getName).toList().get(0));
    }
}