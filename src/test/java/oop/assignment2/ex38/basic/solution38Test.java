/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex38.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution38Test {
    solution38 test = new solution38();

    @Test
    @DisplayName("Values from sample output")
    void filterEvenNumbers_ValuesFromSampleOutput() {

        int[] myNums = {1, 2, 3, 4, 5, 6, 7, 8};

        int[] actual = test.filterEvenNumbers(myNums);
        int[] expected = {2, 4, 6, 8};

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Negative values")
    void filterEvenNumbers_NegativeValues() {

        int[] myNums = {-156, -5, -989, -557, -124, -324};

        int[] actual = test.filterEvenNumbers(myNums);
        int[] expected = {-156, -124, -324};

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Rand 4 digit values")
    void filterEvenNumbers_random4DigitValues() {

        int[] myNums = {1000, -9542, 3333, 4128, 1001, 6745, 4114};

        int[] actual = test.filterEvenNumbers(myNums);
        int[] expected = {1000, -9542, 4128, 4114};

        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Returns all values")
    void filterEvenNumbers_ReturnsAllValues() {

        int[] myNums = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        int[] actual = test.filterEvenNumbers(myNums);
        int[] expected = {100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};

        assertArrayEquals(expected, actual);
    }

}