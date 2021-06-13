/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex38.basic;

class NumberArray {
    private int[] arrayOfNums;

    public NumberArray(int[] inputNumbers) {
        arrayOfNums = inputNumbers;
    }

    public String toString() {
        StringBuilder myString = new StringBuilder();
        for (int i = 0; i < arrayOfNums.length; i++) {
            myString.append(arrayOfNums[i]);
            if (i != arrayOfNums.length - 1) {
                myString.append(" ");
            }
        }
        return myString.toString();
    }
}
