import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo2Corrected;
import org.junit.jupiter.api.Test;

public class TestExo2 {
    @Test
    public void testIsAnagram() {
        // Test with empty string
        assertTrue(Exo2Corrected.isAnagram("", ""));

        // Standard case test
        assertTrue(Exo2Corrected.isAnagram("study", "dusty"));

        // Test with strings different in length
        assertFalse(Exo2Corrected.isAnagram("on peut bien vérifier", "que ces deux chaines ne sont pas des anagrammes"));

        // Testing with strings containing spaces
        assertTrue(Exo2Corrected.isAnagram("eleven plus two", "twelve plus one"));

        // Testing with strings containing special characters
        assertTrue(Exo2Corrected.isAnagram("la crise économique", "le scénario comique"));

        // Testing with null strings (should throw an exception)
        assertThrows(NullPointerException.class, () -> {
            Exo2Corrected.isAnagram(null, "chaine");
        });
        assertThrows(NullPointerException.class, () -> {
            Exo2Corrected.isAnagram("chaine", null);
        });
        // Test with both strings null (should throw exception)
        assertThrows(NullPointerException.class, () -> {
            Exo2Corrected.isAnagram(null, null);
        });

    }
}