package com.charleskim.dayfive.lambdas;

import java.util.Arrays;

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
        // Question #1
        Arrays.sort(strings,
            (string1, string2) -> string1.length() - string2.length());
        System.out.printf("Shortest to longest: %s%n",
            Arrays.toString(strings));
        // Question #2
        Arrays.sort(strings,
            (string1, string2) -> string2.length() - string1.length());
        System.out.printf("Longest to shortest: %s%n",
            Arrays.toString(strings));
        // Question #3
        Arrays.sort(strings,
            (string1, string2) -> string1.charAt(0) - string2.charAt(0));
        System.out.printf("Alphabetical: %s%n", Arrays.toString(strings));
        // Question #4
        Arrays.sort(strings, (String string1, String string2) -> {
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
        // Question #5
        Arrays.sort(strings, Lambdas::compareUsingE);
        System.out.printf("Containing 'e' first #2: %s%n",
            Arrays.toString(strings));
    }
}
