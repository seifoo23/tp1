import static org.junit.jupiter.api.Assertions.*;

import org.example.Exo6;
import org.junit.jupiter.api.Test;

public class TestExo6 {

    @Test
    public void testFizzBuzz() {
        // Standard case test
        // Test case where n is divisible by 3 but not by 5
        assertEquals("Fizz", Exo6.fizzBuzz(9));
        // Test case where n is divisible by 5 but not by 3
        assertEquals("Buzz", Exo6.fizzBuzz(35));
        // Test case where en is neither divisible by 3 nor by 5
        assertEquals("4", Exo6.fizzBuzz(4));
        // Test case where n is divisible by 15
        assertEquals("FizzBuzz", Exo6.fizzBuzz(60));

        // Lower limit case test
        assertThrows(IllegalArgumentException.class, () -> {
            Exo6.fizzBuzz(0);
        });


    }
}