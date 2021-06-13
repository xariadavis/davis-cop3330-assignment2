/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex26.basic;

public class PaymentCalculator {
    public double calculateMonthsUntilPaidOff(double APR, double balance, double monthlyPayment){
        double j = (double)APR/100;
        double i = (double)j/365;
        double b = balance;
        double p = monthlyPayment;
        double numMonths = Math.ceil( (double)-1/30 * Math.log(1 + b/p * (1 - Math.pow((1 + i), 30))) / (Math.log(1+i)));

        return numMonths;
    }
}
