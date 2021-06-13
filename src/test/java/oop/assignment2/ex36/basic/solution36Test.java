/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex36.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class solution36Test {
    mathematicalOps testMath = new mathematicalOps();

    private ArrayList<Integer> sampleNumbers(){

        ArrayList<Integer> values = new ArrayList<>();
        values.add(100);
        values.add(200);
        values.add(1000);
        values.add(300);

        return values;
    }

    private ArrayList<Integer> negNumbers(){

        ArrayList<Integer> values = new ArrayList<>();
        values.add(-1540);
        values.add(-4346);
        values.add(-467);
        values.add(-5745);

        return values;
    }

    @Test
    @DisplayName("Test average from sample")
    void TestAverageFromSample() {

        double actual = testMath.average(sampleNumbers());
        double expected = 400.00;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test average with neg values")
    void TestAverageWithNegs() {

        double actual = testMath.average(negNumbers());
        double expected = -3024.50;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test min from sample")
    void TestMinFromSample() {

        double actual = testMath.min(sampleNumbers());
        double expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test min from sample")
    void TestMinWithNegs() {

        double actual = testMath.min(negNumbers());
        double expected = -5745;

        assertEquals(expected, actual);
    }

    @Test
    void TestMaxFromSample() {

        double actual = testMath.max(sampleNumbers());
        double expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    void TestMaxWithNegs() {

        double actual = testMath.max(negNumbers());
        double expected = -467;

        assertEquals(expected, actual);
    }

    @Test
    void TestStdFromSample() {

        double temp = testMath.std(sampleNumbers());
        double actual = Math.round(temp * 100.0) / 100.0;
        double expected = 353.55;

        assertEquals(expected, actual);
    }

    @Test
    void TestStdWithNegs() {

        double temp = testMath.std(negNumbers());
        double actual = Math.round(temp * 100.0) / 100.0;
        double expected = 2114.95;

        assertEquals(expected, actual);
    }
}