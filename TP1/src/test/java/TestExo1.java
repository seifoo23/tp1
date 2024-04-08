import org.example.Exo1Corrected;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TestExo1 {

    @Test
    public void testIsPalindrome() {
        // Limit case test with an empty string
        assertTrue(Exo1Corrected.isPalindrome(""));

        // Limit case test with a null string
        assertThrows(NullPointerException.class, () -> {
            Exo1Corrected.isPalindrome(null);
        });

        // Standard test case with a palindrome
        assertTrue(Exo1Corrected.isPalindrome("civic"));
        assertTrue(Exo1Corrected.isPalindrome("Never a foot too far even"));

        // Standard case test with a string that is not a palindrome
        assertFalse(Exo1Corrected.isPalindrome("rererere"));
        assertFalse(Exo1Corrected.isPalindrome("c'est du bla bla"));

        // Limit case test with a single letter
        assertTrue(Exo1Corrected.isPalindrome("t"));

    }
}

