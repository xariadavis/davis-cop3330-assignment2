/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex36.basic;

import java.util.ArrayList;

public class mathematicalOps {

    public double average(ArrayList<Integer> values) {
        Integer avg = 0;
        if(!values.isEmpty()) {
            for (Integer i : values) {
                avg += i;
            }
            return avg.doubleValue() / values.size();
        }
        return avg;
    }

    public int min(ArrayList<Integer> values) {
        int min = values.get(0);
        int n = values.size();

        for (int i = 1; i < n; i++) {
            if (values.get(i) < min) {
                min = values.get(i);
            }
        }
        return min;
    }

    public int max(ArrayList<Integer> values) {
        int max = values.get(0);
        int n = values.size();

        for (int i = 1; i < n; i++) {
            if (values.get(i) > max) {
                max = values.get(i);
            }
        }
        return max;
    }

    public double std(ArrayList<Integer> values) {
        double mean = average(values);
        int n = values.size();
        double standardDev = 0.0;
        double squaredDiff;
        double stdVal;

        for (Integer value : values) {
            standardDev = standardDev + Math.pow((value - mean), 2);
        }

        squaredDiff = standardDev / n;
        stdVal = Math.sqrt(squaredDiff);
        return stdVal;
    }
}
