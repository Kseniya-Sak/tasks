package tasks.strings;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class FindNumbersTest {

    @Test
    void getNumbersOfString() {
        assertAll(
                () -> assertEquals(new ArrayList<>(), FindNumbers.getNumbersOfString("")),
                () -> assertEquals(new ArrayList<>(), FindNumbers.getNumbersOfString("Hello")),
                () -> assertEquals(List.of(0), FindNumbers.getNumbersOfString("0")),
                () -> assertEquals(List.of(42, 1), FindNumbers.getNumbersOfString("42 hello1")),
                () -> assertEquals(List.of(0, 100, 1), FindNumbers.getNumbersOfString("English numbers 0 and100 Grade/level: A1")),
                () -> assertEquals(List.of(-1), FindNumbers.getNumbersOfString("-1")),
                () -> assertEquals(List.of(42, -1), FindNumbers.getNumbersOfString("42 -hello--1")),
                () -> assertEquals(List.of(1, -100, 1), FindNumbers.getNumbersOfString("numbers 1-100 A1-"))

        );
    }
}