package com.charleskim.assignments.add;

import java.util.NoSuchElementException;
import java.util.Scanner;

public class InputAdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 3 integers to add: ");
        Integer sum = 0;
        Integer integersCount = 3;
        try {
            for (int i = 0; i < integersCount; ++i) {
                Integer guessedNumber = scanner.nextInt();
                sum += guessedNumber;
            }
            System.out.printf("The sum of your integers is %s.", sum);
        } catch (NoSuchElementException e) {
            System.out.println("You must enter an integer.");
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
