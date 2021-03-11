package com.charleskim.assignments.filenames;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileNames {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("No directory path was specified.");
            return;
        }
        String directoryPath = args[0];
        try (Stream<Path> stream = Files.walk(Paths.get(directoryPath))) {
            System.out.println(stream.collect(Collectors.toList()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
