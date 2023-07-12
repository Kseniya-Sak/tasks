package tasks.array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindPairsCountTest {

    @Test
    void getPairsCount() {
        assertAll(
                () -> assertEquals(0, FindPairsCount.getPairsCount(new int[]{})),
                () -> assertEquals(0, FindPairsCount.getPairsCount(new int[]{1, 3, 6})),
                () -> assertEquals(5, FindPairsCount.getPairsCount(new int[]{2, 2, 3, 4, 5, 6, 4, 3, 3, 4, 5, 3}))
        );
    }

}