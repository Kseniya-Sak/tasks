package tasks.array;

// Найти пары чисел
public class FindPairsCount {

    public static int getPairsCount(int[] array) {
        int countPairs = 0;
        for (int i = 0; i < array.length - 1; i++) {
            if (isNumberNotProcessed(array, i)) {
                countPairs += calculateCountPairsCurrentNumber(array, i);
            }
        }
        return countPairs;
    }

    private static int calculateCountPairsCurrentNumber(int[] array, int index) {
        int count = 1;
        for (int i = index + 1; i < array.length; i++) {
            if (array[index] == array[i]) {
                count++;
            }
        }
        return count / 2;
    }

    private static boolean isNumberNotProcessed(int[] array, int index) {
        for (int check = 0; check < index; check++) {
            if (array[index] == array[check]) {
                return false;
            }
        }
        return true;
    }
}
