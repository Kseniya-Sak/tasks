package tasks.recursion;

import java.util.stream.IntStream;

// Реализовать итеративную и рекурсивную функции отображения массива на консоль
public class PrintArray {
    public static void main(String[] args) {
        int[] array = IntStream.range(0, 10).toArray();

        iterativePrintArray(array);
        System.out.println();
        recursivePrintArray(array, 0);
    }

    public static void iterativePrintArray(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void recursivePrintArray(int[] array, int index) {
        if (index < array.length) {
            System.out.print(array[index] + " ");
            recursivePrintArray(array, ++index);
        }
    }
}
