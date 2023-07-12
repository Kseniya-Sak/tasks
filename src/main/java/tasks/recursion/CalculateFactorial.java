package tasks.recursion;

public class CalculateFactorial {

    public static long calculateFactorial(int i) {
        if (i == 1 || i == 0) {
            return 1;
        }
        return i * calculateFactorial(i - 1);
    }
}
