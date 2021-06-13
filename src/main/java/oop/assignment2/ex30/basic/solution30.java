/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex30.basic;

public class solution30 {
    public static void main(String[] args) {
        multiplicationTable();
    }

    public static void multiplicationTable() {
        for(int i = 1 ; i <= 12; i++) {
            for(int j = 1; j <= 12; j++) {
                int spacing = i * j;
                System.out.format("%6d", spacing);
            }
            System.out.println();
        }
    }

}
