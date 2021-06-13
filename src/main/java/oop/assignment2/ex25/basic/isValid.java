/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex25.basic;

public class isValid {

    public static int passwordValidator(String password){
        int passwordStrength = 0;
        int passwordLength = password.length();

        Boolean hasLetters = false;
        Boolean hasNumbers = false;
        Boolean hasSpecialCharacters = false;

        for (int i = 0; i < passwordLength; i++) {
            if (password.substring(i, i+1).matches("[0-9]")) hasNumbers = true;
            if (password.substring(i, i+1).matches("[A-Za-z]")) hasLetters = true;
            if (password.substring(i, i+1).matches("[^a-zA-Z0-9]")) hasSpecialCharacters = true;
        }

        // very weak == contains only numbers and is fewer that 8 characters
        if(passwordLength < 8 && hasNumbers && !hasLetters && !hasSpecialCharacters) {
            passwordStrength = 1;
        }

        // weak == contains only letters and is fewer than 8 characters
        else if(passwordLength < 8 && hasLetters && !hasNumbers && !hasSpecialCharacters) {
            passwordStrength = 2;
        }

        // strong == contains letters and at least one number and is at least 8 characters
        else if(passwordLength >= 8 && hasLetters && hasNumbers && !hasSpecialCharacters){
            passwordStrength = 3;
        }

        // very strong == contains letters, numbers, and special characters and is at least eight characters
        else if(passwordLength >= 8 && hasLetters && hasNumbers && hasSpecialCharacters) {
            passwordStrength = 4;
        }


        return passwordStrength;
    }



}
