import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testing.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorTests {
    @Test
    public void checkIfSumIsCorrectTest() {
        //given:
        Calculator calculator = new Calculator();
        //when:
        int result = calculator.add(1, 4);
        //then:
        assertEquals(5 ,result);
    }

    @Test
    public void checkIfSubtractionIsCorrectTest() {
        Calculator calculator = new Calculator();
        int result = calculator.subtract(10, 1);
        assertEquals(9, result);
    }
    @Test
    public void checkIfMultiplyIsCorrectTest() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(6, 4);
        assertEquals(24, result);
    }
    @Test
    public void checkIfDivisionIsCorrectTest() {
        Calculator calculator = new Calculator();
        double result = calculator.divide(15, 3);
        assertEquals(5, result);
    }
    @Test
    @DisplayName("Should throw exception")
    public void checkIfDivisionByZeroIsPossible() {
        Calculator calculator = new Calculator();
        assertThrows(IllegalArgumentException.class, () -> calculator.divide(10, 0));
    }
    /**
     * DIFFERENT SYNTAX:
     */
    @Test
    @DisplayName("Should throw exception version 2")
    public void checkIfDivisionByZeroIsPossible1() {
        Calculator calculator = new Calculator();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> calculator.divide(10, 0));
        assertEquals("Not possible to divide by zero", exception.getMessage());
    }
}
