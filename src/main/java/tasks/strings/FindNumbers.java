package tasks.strings;

import java.util.ArrayList;
import java.util.List;

// Найти все числа в строке
public class FindNumbers {
    public static void main(String[] args) {
        System.out.println(getNumbersOfString("-6"));
    }
    public static List<Integer> getNumbersOfString(String str) {
        List<Integer> integerList = new ArrayList<>();
        StringBuilder number = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '-' && i < str.length() - 1) {
                char nextCh = str.charAt(i + 1);
                if (checkChIsDigit(nextCh)) {
                    if (number.length() == 0) {
                        number.append(ch);
                        number.append(nextCh);
                        i++;
                    } else if (number.equals("-")) {
                        number.append(nextCh);
                        i++;
                    } else {
                        addNumberToList(number, integerList);
                        number.append(ch);
                        number.append(nextCh);
                        i++;
                    }
                }
            } else if (checkChIsDigit(ch)) {
                number.append(ch);
            } else {
                addNumberToList(number, integerList);
            }
        }
        addNumberToList(number, integerList);
        return integerList;
    }

    private static boolean checkChIsDigit(char ch) {
        return "0123456789".indexOf(ch) > -1;
    }
    private static void addNumberToList(StringBuilder number, List<Integer> integerList) {
        if (number.length() > 0) {
            integerList.add(Integer.valueOf(number.toString()));
            number.setLength(0);
        }
    }
}
