import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo3Corrected;
import org.junit.jupiter.api.Test;

public class TestExo3 {

    @Test
    public void testBinarySearch() {
        int[] array = {13, 67, 86, 116, 246, 498, 763, 800, 999, 1047, 1678};


        // Test case where the element is in the first half of the array
        assertEquals(0, Exo3Corrected.binarySearch(array, 13));
        // Test case where the element is in the middle of the array
        assertEquals(5, Exo3Corrected.binarySearch(array, 498));
        // Test case where element is in last half of array
        assertEquals(10, Exo3Corrected.binarySearch(array, 1678));

        // Test case where the element is not present
        assertEquals(-1, Exo3Corrected.binarySearch(array, 369));
        assertEquals(-1, Exo3Corrected.binarySearch(array, 15));

        // Test with empty array
        assertEquals(-1, Exo3Corrected.binarySearch(new int[0], 1));

        // Test with null array (should throw exception)
        assertThrows(NullPointerException.class, () -> {
            Exo3Corrected.binarySearch(null, 6);
        });

    }
}