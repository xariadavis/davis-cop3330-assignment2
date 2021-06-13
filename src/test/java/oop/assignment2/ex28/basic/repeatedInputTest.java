/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex28.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class repeatedInputTest {
    Addition testTotal = new Addition();

    @Test
    @DisplayName("Sample Output Values")
    void returnTotal_sample_output() {
        int[] numbersEntered = {1,2,3,4,5};
        int actual = testTotal.returnTotal(numbersEntered);
        int expected = 15;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Correct values for identical ints")
    void returnTotal_returns_correct_value_for_identical_ints() {
        int[] numbersEntered = {10,10,10,10,10};
        int actual = testTotal.returnTotal(numbersEntered);
        int expected = 50;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Adding with negative int")
    void returnTotal_returns_correct_value_for_one_negative_int() {
        int[] numbersEntered = {-10,9,8,7,6};
        int actual = testTotal.returnTotal(numbersEntered);
        int expected = 20;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Adding with all negative ints")
    void returnTotal_returns_correct_value_for_all_negative_ints() {
        int[] numbersEntered = {-10,-14,-5,-17,-11};
        int actual = testTotal.returnTotal(numbersEntered);
        int expected = -57;
        assertEquals(actual, expected);
    }

}