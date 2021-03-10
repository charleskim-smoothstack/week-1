package com.charleskim.assignments.maxnumber;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class MaxNumberFind {
    public static void main(String[] args) {
        Integer[][] array2D = new Integer[5][2];
        String filename = "./array.txt";
        Integer[] position = new Integer[2];
        Integer maxNumber = Integer.MIN_VALUE;
        try (Scanner s = new Scanner(new FileReader(filename))) {
            while (s.hasNext()) {
                for (int i = 0; i < array2D.length; ++i) {
                    for (int j = 0; j < array2D[i].length; ++j) {
                        Integer number = s.nextInt();
                        array2D[i][j] = number;
                        if (number > maxNumber) {
                            maxNumber = number;
                            position[0] = i;
                            position[1] = j;
                        }
                    }
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        System.out.printf("The max number is %s. Its position is (%s, %s).", maxNumber, position[0], position[1]);
    }
}
