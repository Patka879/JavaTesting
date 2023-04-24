import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.testing.BmiCounter;
import org.testing.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BmiCounterTests {
    @Test
    public void checkIfBmiIsCorrectlyCounted() {
        BmiCounter bmiCounter = new BmiCounter();
        Double result = bmiCounter.count(56, 1.66);
        assertEquals(20.32, result, 0.01);
    }

    @Test
    public void checkIfBmiIsCorrectlyCounted1() {
        BmiCounter bmiCounter = new BmiCounter();
        Double result = bmiCounter.count(1.66, 56);
        assertEquals(0.00, result, 0.01);
    }

    @Test
    @DisplayName("Should throw exception for height 0")
    public void checkIfValueIsLowerThanZero() {
        BmiCounter bmiCounter = new BmiCounter();
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> bmiCounter.count(10, 0));
        assertEquals("Values can not be lower or equal 0", exception.getMessage());
    }
}
