/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex38.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class solution38 {
    private static final Scanner myObj = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter a list of numbers, separated by spaces: ");
        String[] strOfInts = myObj.nextLine().split(" ");

        int[] myNums = new int[strOfInts.length];
        for (int i = 0; i < strOfInts.length; i++) {
            myNums[i] = Integer.parseInt(strOfInts[i]);
        }

        int[] evenNums = filterEvenNumbers(myNums);
        NumberArray onlyEvens = new NumberArray(evenNums);

        System.out.println("The even numbers are " + onlyEvens + ".");

        myObj.close();
    }


    public static int[] filterEvenNumbers(int[] myNums) {
        ArrayList<Integer> evenNumsArrayList = new ArrayList<Integer>();

        for (int i = 0; i < myNums.length; i++) {
            if (myNums[i] % 2 == 0) {
                evenNumsArrayList.add(myNums[i]);
            }
        }

        int[] evenNumsArray = new int[evenNumsArrayList.size()];

        for (int i = 0; i < evenNumsArray.length; i++) {
            evenNumsArray[i] = evenNumsArrayList.get(i).intValue();
        }

        return evenNumsArray;
    }
}

