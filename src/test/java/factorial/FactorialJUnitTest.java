
package factorial;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class FactorialJUnitTest {

    @Test
    public void testCalculateFactorial() {

        assertEquals(1, Factorial.calculateFactorial(0)); // 0! = 1
        assertEquals(1, Factorial.calculateFactorial(1)); // 1! = 1
        assertEquals(2, Factorial.calculateFactorial(2)); // 2! = 2
        assertEquals(6, Factorial.calculateFactorial(3)); // 3! = 6
        assertEquals(24, Factorial.calculateFactorial(4)); // 4! = 24
        assertEquals(120, Factorial.calculateFactorial(5)); // 5! = 120
    }

    @Test
    void testCalculateFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial(-1);
        });
    }
}

