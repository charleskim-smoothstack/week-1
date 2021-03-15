package com.charleskim.weekend.functional;

import java.util.List;
import java.util.stream.Collectors;

public class Functional {
    /**
     * @param integers A list of nonnegative integers.
     * @return A list of the rightmost digits.
     */
    public static List<Integer> getRightDigits(List<Integer> integers) {
        List<Integer> newList = integers.stream()
            .map((Integer integer) -> integer % 10)
            .collect(Collectors.toList());
        return newList;
    }

    /**
     * @param integers A list of integers to multiply by 2.
     * @return A list of doubled integers.
     */
    public static List<Integer> getDoubledIntegers(List<Integer> integers) {
        return integers.stream().map((Integer integer) -> integer * 2)
            .collect(Collectors.toList());
    }

    /**
     * @param strings A list of strings to which to remove 'x'.
     * @return A list of strings with 'x' removed.
     */
    public static List<String> getXRemovedStrings(List<String> strings) {
        List<String> newList = strings.stream()
            .map((String string) -> string.replace("x", ""))
            .collect(Collectors.toList());
        return newList;
    }
}
