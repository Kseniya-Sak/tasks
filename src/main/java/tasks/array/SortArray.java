package tasks.array;

import java.util.Arrays;

// 1) Реализовать алгоритм пузырьковой сортировки одномерного массива
// 2) Реализовать алгоритм сортировки вставками одномерного массива
public class SortArray {
    public static void main(String[] args) {
        int[] array = {8, 6, 1, 7, 2, 0};

        bubbleSort(array);
        System.out.println("1" + Arrays.toString(array));

        int[] array2 = {3, 6, 1, 7, 2, 0};


        System.out.println(Arrays.toString(array2));

    }

    public static void bubbleSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean isSorted = true;
            for (int j = array.length - 1; j > i; j--) {
                if (array[j] < array[j - 1]) {{
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                    isSorted = false;
                }}
            }
            if (isSorted) {
                break;
            }
        }
    }

    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0; j--) {
                if (array[j] < array[j - 1]) {
                    int temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }
            }
        }
    }
}
