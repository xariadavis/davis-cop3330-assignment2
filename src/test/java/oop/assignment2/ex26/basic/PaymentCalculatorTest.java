/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex26.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    PaymentCalculator calculator = new PaymentCalculator();

    @Test
    @DisplayName("Sample Output Values")
    void calculateMonthsUntilPaidOff_return_values_in_sample_output() {
        double actual = calculator.calculateMonthsUntilPaidOff(12, 5000, 100);
        double expected = 70;
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("Round up")
    void calculateMonthsUntilPaidOff_return_values_rounded_up() {
        double actual = calculator.calculateMonthsUntilPaidOff(20, 7500, 1000);
        double expected = 9;
        assertEquals(actual, expected);
    }
}