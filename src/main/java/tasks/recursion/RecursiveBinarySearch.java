package tasks.recursion;

// Реализовать рекурсивную версии алгоритма бинарного поиска элемента в одномерном массиве
public class RecursiveBinarySearch {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }

        for (int i = -2; i < array.length + 5; i++) {
            System.out.println("Index of " + i + ": " + search(i, array, 0, array.length - 1));
        }
    }

    public static int search(int number, int[] array, int low, int high) {
        int middleIndex = (low + high) / 2;
        int middleValue = array[middleIndex];

        if (middleValue == number) {
            return middleIndex;
        } else if (low == high) {
            return -1;
        } else if (middleValue > number) {
            return search(number, array, low, middleIndex - 1);
        } else {
            return search(number, array, middleIndex + 1, high);
        }
    }
}
