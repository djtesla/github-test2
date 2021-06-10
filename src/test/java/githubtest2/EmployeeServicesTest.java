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
        /* nem üres sorba átírok próba */ new EmployeeServices.save(new Employee("John Doe", 1970, 200_000));
        List<Employee> employees = services.getEmployees();

        assertEquals(1, employees.size());
        assertEquals("John Doe", employees.get(0).getName());
    }

    @Test
    void testFindOldestEmployee() {

    }

    @Test
    void testFindBySalaryLargerThan() {

    }
}