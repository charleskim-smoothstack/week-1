package com.charleskim.weekend.lambdas;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PerformOperationTest {
    @Test
    public void testIsOddOddNumber() {
        assertTrue(PerformOperation.isOdd().test(1));
    }

    @Test
    public void testIsOddEvenNumber() {
        assertFalse(PerformOperation.isOdd().test(2));
    }

    @Test
    public void testIsPrimePrimeNumber() {
        assertTrue(PerformOperation.isPrime().test(2));
    }

    @Test
    public void testIsPrimeNotPrimeNumber() {
        assertFalse(PerformOperation.isPrime().test(4));
    }

    @Test
    public void testIsPrimeZero() {
        assertFalse(PerformOperation.isPrime().test(0));
    }

    @Test
    public void testIsPrimeOne() {
        assertFalse(PerformOperation.isPrime().test(1));
    }

    @Test
    public void testIsPalindromePalindromeEvenLength() {
        assertTrue(PerformOperation.isPalindrome().test(11));
    }

    @Test
    public void testIsPalindromePalindromeOddLength() {
        assertTrue(PerformOperation.isPalindrome().test(121));
    }

    @Test
    public void testIsPalindromeNotPalindrome() {
        assertFalse(PerformOperation.isPalindrome().test(12));
    }

    @Test
    public void testIsPalindromeLengthOne() {
        assertTrue(PerformOperation.isPalindrome().test(1));
    }
}
