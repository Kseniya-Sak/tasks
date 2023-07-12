package tasks.recursion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class DigitSumTest {

    @Test
    void recursiveDigitSum() {
        assertAll(
                () -> assertEquals(0, DigitSum.recursiveDigitSum(0)),
                () -> assertEquals(9, DigitSum.recursiveDigitSum(9)),
                () -> assertEquals(1, DigitSum.recursiveDigitSum(10000)),
                () -> assertEquals(19, DigitSum.recursiveDigitSum(2458))
        );
    }

    @Test
    void iterativeDigitSum() {
        assertAll(
                () -> assertEquals(0, DigitSum.iterativeDigitSum(0)),
                () -> assertEquals(9, DigitSum.iterativeDigitSum(9)),
                () -> assertEquals(1, DigitSum.iterativeDigitSum(10000)),
                () -> assertEquals(19, DigitSum.iterativeDigitSum(2458))
        );
    }
}