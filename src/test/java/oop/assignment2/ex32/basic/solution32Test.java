/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex32.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution32Test {
    guessTheNumberGame test = new guessTheNumberGame();

    @Test
    @DisplayName("Test random number is between 1 and 10")
    void randNumber_randMax10() {
        String actual;
        if(test.randNumber(1) <= 10){
            actual = "I am between 1 and 10";
        } else {
            actual = "I'm broken";
        }

        String expected = "I am between 1 and 10";

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test random number is between 1 and 100")
    void randNumber_randMax100() {
        String actual;
        if(test.randNumber(2) <= 100){
            actual = "I am between 1 and 100";
        } else {
            actual = "I'm broken";
        }

        String expected = "I am between 1 and 100";

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Test random number is between 1 and 1000")
    void randNumber_randMax1000() {
        String actual;
        if(test.randNumber(3) <= 1000){
            actual = "I am between 1 and 1000";
        } else {
            actual = "I'm broken";
        }

        String expected = "I am between 1 and 1000";

        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Return yes for play again")
    void playAgainBool_returnYesForPlayAgain() {
        assertTrue(test.playAgainBool("y"));
    }

    @Test
    @DisplayName("Return no for play again")
    void playAgainBool_returnNoForPlayAgain() {
        assertFalse(test.playAgainBool("n"));
    }
}