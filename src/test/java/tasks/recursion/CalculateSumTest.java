package tasks.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculateSumTest {

    @Test
    void sum() {
        assertAll(
                () -> assertEquals(0, CalculateSum.sum(0)),
                () -> assertEquals(1, CalculateSum.sum(1)),
                () -> assertEquals(15, CalculateSum.sum(5))
        );
    }
}