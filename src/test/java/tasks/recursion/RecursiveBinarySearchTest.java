package tasks.recursion;

import org.junit.jupiter.api.Test;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class RecursiveBinarySearchTest {

    @Test
    void search() {
        int[] array = IntStream.range(0, 10).toArray();

        assertAll(
                () -> assertEquals(-1, RecursiveBinarySearch.search( -1, array, 0, array.length - 1)),
                () -> assertEquals(0, RecursiveBinarySearch.search( 0, array, 0, array.length - 1)),
                () -> assertEquals(5, RecursiveBinarySearch.search( 5, array, 0, array.length - 1)),
                () -> assertEquals(9, RecursiveBinarySearch.search( 9, array, 0, array.length - 1)),
                () -> assertEquals(-1, RecursiveBinarySearch.search( 10, array, 0, array.length - 1))
        );
    }
}