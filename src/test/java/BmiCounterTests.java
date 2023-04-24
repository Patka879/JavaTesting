import org.junit.jupiter.api.Test;
import org.testing.BmiCounter;
import org.testing.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

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
}
