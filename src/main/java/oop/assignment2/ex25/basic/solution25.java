/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex25.basic;

import java.util.Scanner;

public class solution25 {
    private static String password;
    private static final Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        solution25 myApp = new solution25();
        isValid validator = new isValid();

        myApp.readUserInput();
        int pass = validator.passwordValidator(password);
        System.out.println(myApp.generateOutput(password, pass));
    }

    private void readUserInput(){
        System.out.print("Create a password: ");
        password = myObj.next();
    }

    public String generateOutput(String password, int passwordStrength){
        String output = "";
        if(passwordStrength == 1){
            output = String.format("The password '%s' is a very weak password.", password);
        }
        if(passwordStrength == 2){
            output = String.format("The password '%s' is a weak password.", password);
        }
        if(passwordStrength == 3){
            output = String.format("The password '%s' is a strong password.", password);
        }
        if(passwordStrength == 4){
            output = String.format("The password '%s' is a very strong password.", password);
        }
        if(passwordStrength == 0){
            output = String.format("The password '%s' is invalid. Please try again.", password);
        }
        return output;
    }
}
