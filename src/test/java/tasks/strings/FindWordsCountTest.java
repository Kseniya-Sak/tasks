package tasks.strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindWordsCountTest {

    @Test
    void getWordsCount() {
        assertAll(
                () -> assertEquals(0, FindWordsCount.getWordsCount("")),
                () -> assertEquals(1, FindWordsCount.getWordsCount("Hello")),
                () -> assertEquals(2, FindWordsCount.getWordsCount("Hello World!")),
                () -> assertEquals(2, FindWordsCount.getWordsCount("Hello -!!!!--- guys!"))
        );
    }

    @Test
    void getWordsCountWithRegex() {
        assertAll(
                () -> assertEquals(0, FindWordsCount.getWordsCountWithRegex("")),
                () -> assertEquals(1, FindWordsCount.getWordsCountWithRegex("Hello")),
                () -> assertEquals(2, FindWordsCount.getWordsCountWithRegex("Hello World!")),
                () -> assertEquals(2, FindWordsCount.getWordsCountWithRegex("Hello -!!!!--- guys!"))
        );
    }
}