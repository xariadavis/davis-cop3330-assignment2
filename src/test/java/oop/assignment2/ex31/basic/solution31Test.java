/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex31.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution31Test {
    solution31 test = new solution31();

    @Test
    @DisplayName("Age 22; rHR: 65; Intensity: 55 (MIN)")
    void targetHeartRate_55() {
        int actual = test.targetHeartRate(22, 65, 55);
        int expected = 138;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Age 22; rHR: 65; Intensity: 95 (MAX)")
    void targetHeartRate_95() {
        int actual = test.targetHeartRate(22, 65, 95);
        int expected = 191;
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Age 22; rHR: 65; Intensity: 0 (MIN)")
    void targetHeartRate() {
        int actual = test.targetHeartRate(22, 65, 0);
        int expected = 65;
        assertEquals(expected, actual);
    }
}