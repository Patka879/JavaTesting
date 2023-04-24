import org.junit.jupiter.api.Test;
import org.testing.StringManipulation;

import static org.junit.jupiter.api.Assertions.*;

public class PalindromeTest {
    @Test
    public void checkIfThisIsPalindrome() {
        StringManipulation stringManipulation = new StringManipulation();
        boolean result = stringManipulation.isPalindrome("anna");
        assertTrue(result);
    }
    @Test
    public void checkIfThisIsNotPalindrome() {
        StringManipulation stringManipulation = new StringManipulation();
        boolean result = stringManipulation.isPalindrome("papaja");
        assertFalse(result);
    }
    @Test
    public void checkIfReturnsCorrectReversedWord() {
        StringManipulation stringManipulation = new StringManipulation();
        String result = stringManipulation.reversed("signature");
        assertEquals("erutangis", result);
    }
    @Test
    public void checkIfReturnsCorrectReversedWord2() {
        StringManipulation stringManipulation = new StringManipulation();
        String result = stringManipulation.reversed("potop");
        assertEquals("potop", result);
    }
}
