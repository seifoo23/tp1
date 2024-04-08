import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo5Corrected;
import org.junit.jupiter.api.Test;

public class TestExo5 {

    @Test
    public void testToRoman() {
        // Standard case test
        assertEquals("VI", Exo5Corrected.toRoman(6));
        assertEquals("XII", Exo5Corrected.toRoman(12));
        assertEquals("XLII", Exo5Corrected.toRoman(42));
        assertEquals("XCVI", Exo5Corrected.toRoman(96));
        assertEquals("CMLXXVI", Exo5Corrected.toRoman(976));

        // Lower limit case test
        assertThrows(IllegalArgumentException.class, () -> {
            Exo5Corrected.toRoman(0);
        });

        // Test cas limite supérieur
        assertThrows(IllegalArgumentException.class, () -> {
            Exo5Corrected.toRoman(4000);
        });

        // Test case where n is equal to 1
        assertEquals("I", Exo5Corrected.toRoman(1));

        // Test case where n is equal to 3999
        assertEquals("MMMCMXCIX", Exo5Corrected.toRoman(3999));
    }
}