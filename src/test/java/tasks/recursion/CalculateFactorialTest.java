package tasks.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateFactorialTest {

    @Test
    void calculateFactorial() {
        assertAll(
                () -> assertEquals(1, CalculateFactorial.calculateFactorial(0)),
                () -> assertEquals(1, CalculateFactorial.calculateFactorial(1)),
                () -> assertEquals(120, CalculateFactorial.calculateFactorial(5))
        );
    }
}