package com.example.factorial;

import factorial.Factorial;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class FactorialTestNGTest {

    @Test
    public void testCalculateFactorial() {
        assertEquals(Factorial.calculateFactorial(0), 1); // 0! = 1
        assertEquals(Factorial.calculateFactorial(1), 1); // 1! = 1
        assertEquals(Factorial.calculateFactorial(2), 2); // 2! = 2
        assertEquals(Factorial.calculateFactorial(3), 6); // 3! = 6
        assertEquals(Factorial.calculateFactorial(4), 24); // 4! = 24
        assertEquals(Factorial.calculateFactorial(5), 120); // 5! = 120
    }

    @Test
    public void testCalculateFactorialNegative() {
        assertThrows(IllegalArgumentException.class, () -> {
            Factorial.calculateFactorial(-1);
        });
    }
}
