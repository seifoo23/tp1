import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo4;
import org.junit.jupiter.api.Test;

public class TestExo4 {

    @Test
    public void testSolve() {
        // Standard test case with two distinct real roots
        double[] result1 = Exo4.solve(-1, 3, 4);
        assertNotNull(result1);
        assertEquals(2, result1.length);
        assertEquals(-1.0, result1[0]);
        assertEquals(4.0, result1[1]);

        // Test case with a single real root
        double[] result2 = Exo4.solve(2, -12, 18);
        assertNotNull(result2);
        assertEquals(1, result2.length);
        assertEquals(3.0, result2[0]);

        // Test case with no real root
        double[] result3 = Exo4.solve(1, 2, 5);
        assertNull(result3);

        // Test case with a equal to zero (should throw an exception)
        assertThrows(IllegalArgumentException.class, () -> {
            Exo4.solve(0, 4, 3);
        });

        // Test case with delta equal to zero (only one real root)
        double[] result4 = Exo4.solve(3, -12, 12);
        assertNotNull(result4);
        assertEquals(1, result4.length);
        assertEquals(2.0, result4[0]);

    }
}