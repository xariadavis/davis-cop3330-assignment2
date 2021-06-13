/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex26.basic;

import java.util.Scanner;

public class solution26 {
    private static final Scanner myObj = new Scanner(System.in);
    private static double balance, APR, monthlyPayment;

    public static void main(String[] args) {
    solution26 myApp = new solution26();
    PaymentCalculator calc = new PaymentCalculator();

    myApp.readUserInput();
    double numMonths = calc.calculateMonthsUntilPaidOff(APR, balance, monthlyPayment);
    myApp.generateOutput(numMonths);

    }

    private void readUserInput(){
        System.out.print("What is your balance? ");
        balance = myObj.nextDouble();

        System.out.print("What is the APR on the card (as a percent)? ");
        APR = myObj.nextDouble();

        System.out.print("What is the monthly payment you can make? ");
        monthlyPayment = myObj.nextDouble();
    }

    private void generateOutput(double numMonths){
        String output = String.format("It will take %.0f months to pay off this card.", numMonths);
        System.out.println(output);
    }
}
