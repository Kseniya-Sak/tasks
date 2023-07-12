package tasks.recursion;

// Реализовать итеративную и рекурсивную функции вычисления суммы цифр числа
public class DigitSum {

    public static int recursiveDigitSum(int number) {
        if (number < 10) {
            return number;
        }
        return number % 10 + recursiveDigitSum(number / 10);
    }

    public static int iterativeDigitSum(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }
}
