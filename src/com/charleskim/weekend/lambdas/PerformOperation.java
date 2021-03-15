package com.charleskim.weekend.lambdas;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.function.Predicate;

public class PerformOperation {
    /**
     * @return A predicate that checks if an integer is odd.
     */
    public static Predicate<Integer> isOdd() {
        return (Integer integer) -> {
            return integer % 2 != 0;
        };
    }

    /**
     * @return A predicate that checks if an integer is prime.
     */
    public static Predicate<Integer> isPrime() {
        return (Integer integer) -> {
            if (integer == 0 || integer == 1) {
                return false;
            }
            for (int i = 2; i < integer; i++) {
                if (integer % i == 0) {
                    return false;
                }
            }
            return true;
        };
    };

    /**
     * @return A predicate that checks if an integer is a palindrome.
     */
    public static Predicate<Integer> isPalindrome() {
        return (Integer integer) -> {
            String string = integer.toString();
            int frontIndex = 0;
            int backIndex = string.length() - 1; 
            while (frontIndex < backIndex) {
                if (string.charAt(frontIndex) != string.charAt(backIndex)) {
                    return false;
                }
                frontIndex++;
                backIndex--;
            }
            return true;
        };
    };

    public static void main(String[] args) {
        String filename = "resources/perform-operations.txt";
        try (Scanner scanner = new Scanner(new FileReader(filename))) {
            Integer testCasesCount = scanner.nextInt();
            for (int i = 0; i < testCasesCount; i++) {
                switch (scanner.nextInt()) {
                    case 1: {
                        boolean result = PerformOperation.isOdd()
                            .test(scanner.nextInt());
                        System.out.printf("%s%n", result ? "ODD" : "EVEN");
                        break;
                    }
                    case 2: {
                        boolean result = PerformOperation.isPrime()
                            .test(scanner.nextInt());
                        System.out.printf("%s%n",
                            result ? "PRIME" : "COMPOSITE");
                        break;
                    }
                    case 3: {
                        boolean result = PerformOperation.isPalindrome()
                            .test(scanner.nextInt());
                        System.out.printf("%s%n",
                            result ? "PALINDROME" : "NOT PALINDROME");
                        break;
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
