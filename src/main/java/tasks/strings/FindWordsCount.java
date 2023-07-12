package tasks.strings;

// Найти количество слов в тексте
public class FindWordsCount {
    public static int getWordsCount(String text) {
        int index = 0;
        int count = 0;

        while (index < text.length()) {
            char ch = text.charAt(index++);
            if (" ,.!?-".indexOf(ch) != -1) {
                count++;
                while (index < text.length() && " ,.!-".indexOf(text.charAt(index)) != -1) {
                    index++;
                }
            }
        }
        if (text.length() > 0 && count == 0) {
            return 1;
        }

        return count;
    }

    public static int getWordsCountWithRegex(String text) {
        if (text.length() == 0) {
            return 0;
        }
        return text.split("[^a-zA-Z]+").length;
    }
}

