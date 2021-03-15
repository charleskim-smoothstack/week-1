package com.charleskim.dayfive.lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambdas {
    public static int compareUsingE(String string1, String string2) {
        int result = 0;
        if (string1.toLowerCase().indexOf('e') != -1) {
            result = -1;
        } else if (string2.toLowerCase().indexOf('e') != -1) {
            result = 1;
        }
        return result;
    }

    public static void main(String[] args) {
        String[] strings = { "Bob", "John", "Emily", "Elizabeth" };
        // Question 1.1
        Arrays.sort(strings,
            (string1, string2) -> string1.length() - string2.length());
        System.out.printf("Shortest to longest: %s%n",
            Arrays.toString(strings));
        // Question 1.2
        Arrays.sort(strings,
            (string1, string2) -> string2.length() - string1.length());
        System.out.printf("Longest to shortest: %s%n",
            Arrays.toString(strings));
        // Question 1.3
        Arrays.sort(strings,
            (string1, string2) -> string1.charAt(0) - string2.charAt(0));
        System.out.printf("Alphabetical: %s%n", Arrays.toString(strings));
        // Question 1.4
        Arrays.sort(strings, (string1, string2) -> {
            int result = 0;
            if (string1.toLowerCase().indexOf('e') != -1) {
                result = -1;
            } else if (string2.toLowerCase().indexOf('e') != -1) {
                result = 1;
            }
            return result;
        });
        System.out.printf("Containing 'e' first: %s%n",
            Arrays.toString(strings));
        // Question 1.5
        Arrays.sort(strings, Lambdas::compareUsingE);
        System.out.printf("Containing 'e' first #2: %s%n",
            Arrays.toString(strings));
        // Question 2
        List<Integer> integers = List.of(1, 3, 2, 4, 5, 6);
        StringBuilder stringBuilder = new StringBuilder();
        integers.stream().forEach(integer -> {
            if (integer % 2 == 0) {
                stringBuilder.append("e" + integer);
            } else {
                stringBuilder.append("o" + integer);
            }
            stringBuilder.append(',');
        });
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        System.out.printf("String of integers: %s%n", stringBuilder);
        // Question 3
        List<String> list =
            List.of("ape", "Ape", "apple", "aid", "Aid", "armor", "ant");
        List <String> newList = list.stream().filter(string -> {
                if (string.charAt(0) == 'a' && string.length() == 3) {
                    return true;
                }
                return false;
            }).collect(Collectors.toList());
        System.out.printf("List of strings: %s%n", newList);
    }
}
