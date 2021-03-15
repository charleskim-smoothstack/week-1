package com.charleskim.weekend.functional;

import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;

public class FunctionalTest {
    @Test
    public void testGetRightDigitsSingleDigits() {
        List<Integer> integers = List.of(0, 1, 2);
        assertEquals(integers, Functional.getRightDigits(integers));
    }

    @Test
    public void testGetRightDigitsDoubleDigits() {
        List<Integer> integers = List.of(12, 23, 34);
        assertEquals(List.of(2, 3, 4), Functional.getRightDigits(integers));
    }

    @Test
    public void testGetRightDigitsTripleDigits() {
        List<Integer> integers = List.of(123, 234, 345);
        assertEquals(List.of(3, 4, 5), Functional.getRightDigits(integers));
    }

    @Test
    public void testDoubleListPositiveNumbers() {
        List<Integer> integers = List.of(1, 2, 3);
        assertEquals(List.of(2, 4, 6), Functional.getDoubledIntegers(integers));
    }

    @Test
    public void testDoubleListNegativeNumbers() {
        List<Integer> integers = List.of(-1, -2, -3);
        assertEquals(List.of(-2, -4, -6),
            Functional.getDoubledIntegers(integers));
    }

    @Test
    public void testGetXRemovedStringsStringsWithOneXOnly() {
        List<String> strings = List.of("x", "x", "x");
        assertEquals(List.of("", "", ""),
            Functional.getXRemovedStrings(strings));
    }

    @Test
    public void testGetXRemovedStringsStringsWithMultipleXsOnly() {
        List<String> strings = List.of("xx", "xxx", "xxxx");
        assertEquals(List.of("", "", ""),
            Functional.getXRemovedStrings(strings));
    }

    @Test
    public void testGetXRemovedStringsStringsWithOneX() {
        List<String> strings = List.of("ax", "bx", "cx");
        assertEquals(List.of("a", "b", "c"),
            Functional.getXRemovedStrings(strings));
    }

    @Test
    public void testGetXRemovedStringsStringsWithMultipleXs() {
        List<String> strings = List.of("axx", "bxx", "cxx");
        assertEquals(List.of("a", "b", "c"),
            Functional.getXRemovedStrings(strings));
    }
}
