package tasks.array;

import java.util.InputMismatchException;
import java.util.Scanner;

// Отобразить пирамиду чисел
public class ShowNumberPyramid {
    public static void main(String[] args) {
        int number = -1;

        do {
            System.out.println("Enter a number from 0 to 9");

            try {
                number = new Scanner(System.in).nextInt();
            } catch (InputMismatchException ignore) {
                System.out.println("It's not a number");
            }
        } while (number < 0 || number > 9);

        printPyramid(number);
    }

    public static void printPyramid(int number) {
        for (int rows = 0; rows <= number; rows++) {
            for (int cols = 0; cols < number - rows; cols++) {
                System.out.print("   ");
            }
            for (int cols = 0; cols < rows * 2 + 1; cols++) {
                System.out.print(" " + rows + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}

