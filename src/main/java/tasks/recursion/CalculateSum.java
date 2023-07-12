package tasks.recursion;

public class CalculateSum {
    public static int sum(int i) {
        if (i == 0) {
            return 0;
        }
        return i + sum(i - 1);
    }
}
