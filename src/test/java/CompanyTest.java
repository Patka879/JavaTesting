import org.junit.jupiter.api.Test;
import org.testing.Company;

import static org.junit.jupiter.api.Assertions.*;

public class CompanyTest {
    @Test
    public void getEmployees() {
        Company company = new Company();
        String[] result = company.getEmployee();
        assertEquals(0, result.length);
    }

    @Test
    public void addEmployee() {
        Company company = new Company();
        boolean result = company.addEmployee("Jakub");
        assertTrue(result);
    }

    @Test
    public void shouldReturnAddedEmployee() {
        Company company = new Company(3);
        company.addEmployee("Jakub");
        String[] result = company.getEmployee();
        assertEquals("Jakub",result[0]);
        assertEquals(1, result.length);
    }

    @Test
    public void shouldThrowExceptionIfTooManyEmployeesAreAdded() {
        Company company = new Company(2);
        company.addEmployee("Patrycja");
        company.addEmployee("Jakub");

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> company.addEmployee("Jakub"));
        assertEquals("The company is full!" , exception.getMessage());
    }

    @Test
    public void shouldRemoveEmployeeFromTheList() {
        Company company = new Company();
        company.addEmployee("Kuba");
        boolean result = company.removeEmployee("Kuba");
        assertEquals(true, result);
        assertEquals(0, company.getEmployee().length);
    }

    @Test
    public void shouldRemoveEmployeeFromTheListAndReturnEmployees() {
        Company company = new Company(2);
        company.addEmployee("Kuba");
        company.addEmployee("Adam");
        boolean result = company.removeEmployee("Kuba");
        assertEquals(true, result);
        assertEquals("Adam", company.getEmployee()[0]);
    }

    @Test
    public void shouldNotRemoveEmployeeThatDoesNotExist() {
        Company company = new Company(2);
        company.addEmployee("Kuba");
        company.addEmployee("Adam");
        boolean result = company.removeEmployee("Kamila");
        assertEquals(false, result);
        assertEquals(2, company.getEmployee().length);
    }
}
