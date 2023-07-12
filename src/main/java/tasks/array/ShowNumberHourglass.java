package tasks.array;

// Вывести на консоль песочные часы из чисел
public class ShowNumberHourglass {
    public static void main(String[] args) {
        int rows = 7;
        int cols = 16;
        printNumberHourglass(rows, cols);
    }

    public static void printNumberHourglass(int rows, int cols) {
        for (int row = 0; row < rows; row++) {
            int value = row < (rows / 2) ? row + 1 : rows - row;
            int shift = row < (rows / 2) ? row * 2 : (rows - row - 1) * 2;

            for (int col = 0; col < shift; col++) {
                System.out.print("  ");
            }
            for (int col = 0; col < cols - 2 * shift; col++) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
