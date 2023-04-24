import org.junit.jupiter.api.Test;
import org.testing.Company;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

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
}
