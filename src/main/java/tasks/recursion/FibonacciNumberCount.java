package tasks.recursion;

// Реализовать итеративную и рекурсивную версии программы для нахождения числа Фибоначчи по индексу
// 0=1 1=1 2=2 3=3 4=5 5=8
public class FibonacciNumberCount {
    public static int iterative(int index) {
        if (index == 0 || index == 1) {
            return 1;
        }

        int prev0 = 1;
        int prev1 = 1;
        int next = prev0 + prev1;
        for (int i = 2; i < index; i++) {
            prev0 = prev1;
            prev1 = next;
            next = prev0 + prev1;
        }
        return next;
    }

    public static int recursive(int index) {
        if (index == 0 || index == 1) {
            return 1;
        }
        return recursive(index - 1) + recursive(index - 2);
    }

}
