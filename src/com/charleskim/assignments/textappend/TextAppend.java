package com.charleskim.assignments.textappend;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class TextAppend {
    public static void main(String[] args) throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter the path of the source file");
            String sourceFilePath = scanner.next();
            File sourceFile = new File(sourceFilePath);
            if (!sourceFile.exists()) {
                System.out.println("The source file does not exist.");
                System.exit(0);
            }
            System.out.println("Enter the path of the target file");
            String targetFilePath = scanner.next();
            File targetFile = new File(targetFilePath);
            if (!targetFile.exists()) {
                System.out.println("The target file does not exist.");
                System.exit(0);
            }
            try (FileReader in = new FileReader(sourceFile);
                    FileWriter out = new FileWriter(targetFile, true)) {
                int characterValue;
                while ((characterValue = in.read()) != -1) {
                    out.write(characterValue);
                }
            } catch (Exception e) {
                e.printStackTrace();

            }
        } catch (NoSuchElementException | IllegalStateException e) {
            e.printStackTrace();
        }
    }
}
