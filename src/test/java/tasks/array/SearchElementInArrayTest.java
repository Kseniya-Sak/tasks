package tasks.array;

import org.junit.jupiter.api.Test;

import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class SearchElementInArrayTest {

    @Test
    void searchMinElement() {
        assertEquals(0, SearchElementInArray.searchMinElement(new int[]{8, 6, 1, 7, 2, 0}));
    }

    @Test
    void binarySearch() {
        int[] array = IntStream.range(0, 10).toArray();

        assertAll(
                () -> assertEquals(-1, SearchElementInArray.binarySearch(array, -1)),
                () -> assertEquals(0, SearchElementInArray.binarySearch(array, 0)),
                () -> assertEquals(5, SearchElementInArray.binarySearch(array, 5)),
                () -> assertEquals(9, SearchElementInArray.binarySearch(array, 9)),
                () -> assertEquals(-1, SearchElementInArray.binarySearch(array, 10))
        );
    }
}