package com.charleskim.assignments.patterns;

import java.util.ArrayList;
import java.util.Collections;

public class Patterns {
    private enum Style {
        LEFT_ALIGNED,
        RIGHT_ALIGNED,
        FLIPPED
    }
    
    private static int lineCount = 5;
    private static int starsLineCount = lineCount - 1;
    private static ArrayList<String> lines = new ArrayList<String>();
    
    /**
     * Prints a pattern of stars and dots.
     * @param style The style of the pattern.
     */
    private static void print(Style style) {
        lines.clear();
        int dotsCount = 0;
        switch (style) {
            case LEFT_ALIGNED: {
                addLeftAlignedLinesToList();
                addDotsLineToList(6);
                break;
            }
            case RIGHT_ALIGNED: {
                addRightAlignedLinesToList();
                addDotsLineToList(5);
                break;
            }
            case FLIPPED: {
                addLeftAlignedLinesToList();
                addDotsLineToList(5);
                Collections.reverse(lines);
                break;
            }
        }
        
        for (String s : lines) {
            System.out.println(s);
        }
    }
    
    private static void addLeftAlignedLinesToList() {
        for (int starsCount = 0; starsCount < starsLineCount; ++starsCount) {
            String line = "";
            for (int i = 0; i <= starsCount; ++i) {
                line += "*";
            }
            lines.add(line);
        }
    }
    
    /**
     * 
     * @param dotsCount
     */
    private static void addDotsLineToList(int dotsCount) {
        String dotsLine = "";
        for (int i = 0; i < dotsCount; ++i) {
            dotsLine += ".";
        }
        lines.add(dotsLine);
    }
    
    private static void addRightAlignedLinesToList() {
        for (int starsCount = 0; starsCount < starsLineCount; ++starsCount) {
            String line = "";
            boolean aligned = false;
            for (int i = 0; i <= starsCount; ++i) {
                int maxStarsCount = 4;
                int spaceCount = maxStarsCount - starsCount;
                if (!aligned) {
                    for (int j = 0; j < spaceCount; ++j) {
                        line += " ";
                    }
                    aligned = true;
                }
                aligned = true;
                line += "*";
            }
            lines.add(line);
        }
    }
    
    public static void main(String[] args) {
        Patterns.print(Style.LEFT_ALIGNED);
        Patterns.print(Style.RIGHT_ALIGNED);
        Patterns.print(Style.FLIPPED);
    }
}
