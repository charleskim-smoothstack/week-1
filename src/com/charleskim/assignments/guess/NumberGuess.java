package com.charleskim.assignments.guess;

import java.util.Scanner;

public class NumberGuess {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number from 1 to 100: ");
        int chancesCount = 5;
        int randomNumber = (int)(Math.random() * 100 + 1);
        for (int guessIndex = 0; guessIndex < chancesCount; ++guessIndex) {
            int guess = scanner.nextInt();
            if (guess >= randomNumber - 10 && guess <= randomNumber + 10) {
                System.out.printf("Good job! The number was %s.", randomNumber);
                break;
            } else {
                if (guessIndex < chancesCount - 1) {
                    System.out.print("Try again: ");
                } else {
                    System.out.printf("Sorry. The number was %s.", randomNumber);
                }
            }
        }
        scanner.close();
    }
}
