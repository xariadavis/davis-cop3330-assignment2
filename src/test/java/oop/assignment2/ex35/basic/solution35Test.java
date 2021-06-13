/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex35.basic;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class solution35Test {
    solution35 test = new solution35();

    @Test
    @DisplayName("Return correct length of list")
    void returnArrayLEN() {
        ArrayList<String> userNames = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            userNames.add("Xaria");
        }

        int actual = test.returnArrayLEN(userNames);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("randomVal is correct range")
    void generateRandomNumInCorrectRange() {

        ArrayList<String> userNames = new ArrayList<>();

        for(int i = 0; i < 100; i++){
            userNames.add("Xaria");
        }

        String actual;
        int arrayLEN = test.returnArrayLEN(userNames);
        int randomNum = test.generateRandomNum(arrayLEN);
        if(randomNum > arrayLEN) {
            actual = "I do not work";
        } else {
            actual = "I work";
        }

        String expected = "I work";
        assertEquals(expected, actual);
    }
}
