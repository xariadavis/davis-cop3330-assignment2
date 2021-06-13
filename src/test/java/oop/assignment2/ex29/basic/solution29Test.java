/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex29.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class solution29Test {
    solution29 test = new solution29();

    @Test
    @DisplayName("Sample output values")
    void yearsCalc_Sample() {
        double actual = test.yearsCalc(4);
        double expected = 18.00;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Sample output values")
    void yearsCalc_round() {
        double actual = test.yearsCalc(60);
        double expected = 2.00;
        assertEquals(expected, actual);
    }


}