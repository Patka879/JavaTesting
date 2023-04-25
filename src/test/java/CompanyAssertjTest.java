import org.junit.jupiter.api.Test;
import org.testing.Company;

import static org.assertj.core.api.Assertions.*;


public class CompanyAssertjTest {
    @Test
    public void getEmployees() {
        Company company = new Company();
        String[] result = company.getEmployee();
        assertThat(result.length).isEqualTo(0);
        assertThat(result).isEmpty();
    }

    @Test
    public void addEmployee() {
        Company company = new Company();
        boolean result = company.addEmployee("Jakub");
        assertThat(result).isTrue();
    }
//
    @Test
    public void shouldReturnAddedEmployee() {
        Company company = new Company(3);
        company.addEmployee("Jakub");
        String[] result = company.getEmployee();
        assertThat(result[0]).isEqualTo("Jakub");
        assertThat(result.length).isEqualTo(1);
    }
//
    @Test
    public void shouldThrowExceptionIfTooManyEmployeesAreAdded() {
        Company company = new Company(2);
        company.addEmployee("Patrycja");
        company.addEmployee("Jakub");
        assertThatThrownBy(() -> company.addEmployee("Jakub"))
                .hasMessage("The company is full!")
                .isExactlyInstanceOf(IllegalArgumentException.class);
    }

    @Test
    public void shouldRemoveEmployeeFromTheList() {
        Company company = new Company();
        company.addEmployee("Kuba");
        boolean result = company.removeEmployee("Kuba");
        assertThat(result).isTrue();
        assertThat(company.getEmployee().length).isEqualTo(0);
    }

    @Test
    public void shouldRemoveEmployeeFromTheListAndReturnEmployees() {
        Company company = new Company(2);
        company.addEmployee("Kuba");
        company.addEmployee("Adam");
        boolean result = company.removeEmployee("Kuba");
        assertThat(result).isTrue();
        assertThat(company.getEmployee()[0]).isEqualTo("Adam");
    }

    @Test
    public void shouldNotRemoveEmployeeThatDoesNotExist() {
        Company company = new Company(2);
        company.addEmployee("Kuba");
        company.addEmployee("Adam");
        boolean result = company.removeEmployee("Kamila");
        assertThat(result).isFalse();
        assertThat(company.getEmployee().length).isEqualTo(2);
    }
}
