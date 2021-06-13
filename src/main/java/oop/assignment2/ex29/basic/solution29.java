/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex29.basic;

import java.util.Scanner;

public class solution29 {
    private static final Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        solution29 myApp = new solution29();
        myApp.generateOutput();

    }
    
    public double yearsCalc(double ror) {
        return Math.ceil(72/ror);
    }

    private double userNumbers() {
        String readLine;
        int val;

        do {
            while(true) {
                try {
                    System.out.print("What is the rate of return? ");
                    readLine = myObj.nextLine();
                    val = Integer.parseInt(readLine);
                    break;
                } catch (NumberFormatException e) {}
                System.out.println("Sorry. That's not a valid input.");
            }
            if (val == 0) System.out.println("Sorry. That's not a valid input.");
        } while (val == 0);

        return val;
    }

    private void generateOutput(){
        double roR = userNumbers();
        double years = yearsCalc(roR);

        System.out.format("It will take %.0f years to double your initial investment.\n", years);
    }
}
