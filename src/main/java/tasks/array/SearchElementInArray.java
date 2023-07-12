package tasks.array;

// 1) Реализовать алгоритм нахождения минимального элемента одномерного массива
// 2) Реализовать алгоритм бинарного поиска элемента в одномерном массиве
public class SearchElementInArray {

    public static int searchMinElement(int[] array) {
        int min = array.length != 0 && array != null ? array[0] : Integer.MAX_VALUE;
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    // поиск элемента в массиве
    // если элемента нет, метод возвращает -1
    public static int binarySearch(int[] array, int num) {
        int result  = -1;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int middleIndex = (low + high) / 2;
            int middleValue = array[middleIndex];
            if (middleValue < num) {
                low = middleIndex + 1;
            } else if (middleValue > num) {
                high = middleIndex - 1;
            } else {
                result = middleIndex;
                break;
            }
        }
        return result;
    }
}
