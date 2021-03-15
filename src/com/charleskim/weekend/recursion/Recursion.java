package com.charleskim.weekend.recursion;

public class Recursion {
    /**
     * Checks whether a group of integers can be chosen such that the group sums
     * to the target. If there are numbers in the array that are adjacent and
     * identical, they must either all be chosen or all not chosen.
     * @param startIndex The index that 
     * @param integers An array of integers to check.
     * @param targetSum The target sum to which to add the group of integers.
     * @return Whether a group of integers can be chosen.
     */
    public static boolean canGroupSum(int startIndex, int[] integers, int targetSum) {
        if (startIndex == integers.length) {
            return targetSum == 0;
        } else {
            int newIndex = startIndex;
            int clumpSum = 0;
            while (newIndex < integers.length && integers[startIndex] == integers[newIndex]) {
                clumpSum += integers[newIndex];
                newIndex++;
            }
            return canGroupSum(newIndex, integers, targetSum - clumpSum)
                || canGroupSum(newIndex, integers, targetSum);
        }
    }
}
