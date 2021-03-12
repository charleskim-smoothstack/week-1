package com.charleskim.assignments.charactercount;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class CharacterCount {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            Character characterToCount = null;
            while (characterToCount == null) {
                System.out.println("Enter a character you want to count:");
                String inputString = scanner.next();
                if (inputString.length() == 1) {
                    characterToCount = inputString.charAt(0);
                }
            }
            String contents;
            Path path = Paths.get("resources/character-count.txt");
            Integer characterCount = 0;
            try {
                contents = Files.readString(path);
                char[] characters = contents.toCharArray();
                for (char c : characters) {
                    if (c == characterToCount) {
                        characterCount++;
                    }
                }
                System.out.println(characterCount);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
