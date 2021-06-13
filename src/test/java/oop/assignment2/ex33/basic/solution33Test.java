/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex33.basic;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution33Test {
    magic8BallGame test = new magic8BallGame();

    @Test
    void generateRandomNum() {
        String actual;
        int randomNum = test.generateRandomNum();
        if(randomNum < 5) {
            actual = "I work";
        } else {
            actual = "I do not work";
        }

        String expected = "I work";
        assertEquals(expected, actual);
    }

}