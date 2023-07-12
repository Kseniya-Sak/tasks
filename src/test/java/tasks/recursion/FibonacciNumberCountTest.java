package tasks.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FibonacciNumberCountTest {

    @Test
    void iterative() {
        assertAll(
                () -> assertEquals(1, FibonacciNumberCount.iterative(0)),
                () -> assertEquals(2, FibonacciNumberCount.iterative(2)),
                () -> assertEquals(8, FibonacciNumberCount.iterative(5)),
                () -> assertEquals(10946, FibonacciNumberCount.iterative(20))
        );
    }

    @Test
    void recursive() {
        assertAll(
                () -> assertEquals(1, FibonacciNumberCount.recursive(0)),
                () -> assertEquals(2, FibonacciNumberCount.recursive(2)),
                () -> assertEquals(8, FibonacciNumberCount.recursive(5)),
                () -> assertEquals(10946, FibonacciNumberCount.recursive(20))
        );
    }
}