/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex28.basic;

import java.util.Scanner;

public class solution28 {
    private static final Scanner myObj = new Scanner(System.in);
    private final int[] numbersEntered = new int[6];

    public static void main(String[] args) {
    solution28 myApp = new solution28();
    Addition add = new Addition();

    int[] numbersEntered = myApp.userInput();
    int total = add.returnTotal(numbersEntered);

    myApp.generateOutput(total);

    }

    private int[] userInput(){
        for(int i = 0; i < 5; i++){
            System.out.print("Enter a number: ");
            numbersEntered[i] = myObj.nextInt();
        }
        return numbersEntered;
    }

    private void generateOutput(int total){
        String output = String.format("The total is %d.", total);
        System.out.println(output);
    }

}
