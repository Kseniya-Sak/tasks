package tasks.array;

import org.junit.jupiter.api.Test;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertTrue;

class SortArrayTest {
    private int[] array = {0, 1, 2, 6, 7, 8};
    private int[] testArray = {8, 6, 1, 7, 2, 0};

    @Test
    void bubbleSort() {
        SortArray.bubbleSort(testArray);

        assertTrue(Arrays.equals(array, testArray));

    }

    @Test
    void insertionSort() {
        SortArray.insertionSort(testArray);

        assertTrue(Arrays.equals(array, testArray));
    }
}