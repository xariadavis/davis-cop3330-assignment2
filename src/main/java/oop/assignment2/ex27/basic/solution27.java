/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex27.basic;

import java.util.Scanner;

public class solution27 {

    private static final Scanner myObj = new Scanner(System.in);
    static String firstName;
    static String lastName;
    static String employeeID;
    static String zipCode;

    public static void main(String[] args) {
        solution27 myApp = new solution27();
        inputValidation valid = new inputValidation();

        myApp.readUserInput();
        valid.validateInput(firstName, lastName, zipCode, employeeID);

    }

    public void readUserInput(){
        System.out.print("Enter the first name: ");
        firstName = myObj.nextLine();

        System.out.print("Enter the last name: ");
        lastName = myObj.nextLine();

        System.out.print("Enter the ZIP code: ");
        zipCode = myObj.nextLine();

        System.out.print("Enter an employee ID: ");
        employeeID = myObj.nextLine();
    }

}


