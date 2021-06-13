/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex37.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution37Test {
    solution37 test = new solution37();

    @Test
    @DisplayName("Correct length")
    void generatePassword_correctLength() {
        String actual;
        String password = test.generatePassword(8, 2, 2);

        if(password.length() <= 8){
            actual = "I am at least 8 letters";
        } else{
            actual = "I'm broken";
        }

        String expected = "I am at least 8 letters";

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Correct number of numbers")
    void generatePassword_correctNumberIntegers(){
        String actual = null;
        String password = test.generatePassword(8, 2, 2);

        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                count++;
                if (count == 2) {
                    actual = "I have 2 numbers";
                } else{
                    actual = "I am broken";
                }
            }
        }

        String expected = "I have 2 numbers";

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Correct number of special characters")
    void generatePassword_correctNumberOfSpecialCharacters(){
        String password = test.generatePassword(8, 2, 2);
        String actual = null;

        int count = 0;
        for (int i = 0; i < password.length(); i++) {
            if (password.substring(i, i+1).matches("[^a-zA-Z0-9]")) {
                count++;
                if (count == 2) {
                    actual = "I have 2 special characters";
                } else {
                    actual = "I'm broken";
                }
            }
        }

        String expected = "I have 2 special characters";

        assertEquals(expected, actual);
    }
}