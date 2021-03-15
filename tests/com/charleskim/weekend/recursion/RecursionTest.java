package com.charleskim.weekend.recursion;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class RecursionTest {
    @Test
    public void testCanGroupSumArrayWithOneNumberEqualsTarget() {
        int[] integers = { 1 };
        assertTrue(Recursion.canGroupSum(0, integers, 1));
    }

    @Test
    public void testCanGroupSumArrayWithTwoNumbersEqualsTarget() {
        int[] integers = { 1 , 2 };
        assertTrue(Recursion.canGroupSum(0, integers, 3));
    }

    @Test
    public void testCanGroupSumArrayWithThreeNumbersEqualsTarget() {
        int[] integers = { 1 , 2 , 5 };
        assertTrue(Recursion.canGroupSum(0, integers, 6));
    }

    @Test
    public void testCanGroupSumArrayWithSameTwoNumbersEqualsTarget() {
        int[] integers = { 1 , 2 , 2, 3 };
        assertTrue(Recursion.canGroupSum(0, integers, 4));
    }

    @Test
    public void testCanGroupSumArrayWithSameTwoNumbersDoesNotEqualTarget() {
        int[] integers = { 2, 8, 4, 4 };
        assertFalse(Recursion.canGroupSum(0, integers, 14));
    }
}
