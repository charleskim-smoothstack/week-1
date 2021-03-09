package com.charleskim.assignments.patterns;

import java.util.ArrayList;
import java.util.Collections;

public class Patterns {
    private enum Style {
        LEFT_ALIGNED,
        RIGHT_ALIGNED,
        FLIPPED
    }
    
    /**
     * Prints a pattern of stars and dots.
     * @param style The style of the pattern.
     * @param dotsCount The number of dots to be added as the last line.
     */
    private static void print(Style style) {
        int lineCount = 5;
        int starsLineCount = lineCount - 1;
        int dotsCount = 0;
        ArrayList<String> lines = new ArrayList<String>();
        switch (style) {
            case LEFT_ALIGNED: {
                for (int starsCount = 0; starsCount < starsLineCount; ++starsCount) {
                    String line = "";
                    for (int i = 0; i <= starsCount; ++i) {
                        line += "*";
                    }
                    lines.add(line);
                }
                dotsCount = 6;
                String dotsLine = "";
                for (int i = 0; i < dotsCount; ++i) {
                    dotsLine += ".";
                }
                lines.add(dotsLine);
                break;
            }
            case RIGHT_ALIGNED: {
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
                dotsCount = 5;
                String dotsLine1 = "";
                for (int i = 0; i < dotsCount; ++i) {
                    dotsLine1 += ".";
                }
                lines.add(dotsLine1);
                break;
            }
            case FLIPPED: {
                for (int starsCount = 0; starsCount < starsLineCount; ++starsCount) {
                    String line = "";
                    for (int i = 0; i <= starsCount; ++i) {
                        line += "*";
                    }
                    lines.add(line);
                }
                dotsCount = 5;
                String dotsLine = "";
                for (int i = 0; i < dotsCount; ++i) {
                    dotsLine += ".";
                }
                lines.add(dotsLine);
                Collections.reverse(lines);
                break;
            }
        }
        
        for (String s : lines) {
            System.out.println(s);
        }
    }
    
    public static void main(String[] args) {
        Patterns.print(Style.LEFT_ALIGNED);
        Patterns.print(Style.RIGHT_ALIGNED);
        Patterns.print(Style.FLIPPED);
    }
}
