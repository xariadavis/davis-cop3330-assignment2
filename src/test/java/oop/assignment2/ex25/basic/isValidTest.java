/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex25.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class isValidTest {
    isValid validator = new isValid();
    solution25 test = new solution25();

    @Test
    @DisplayName("Very weak from Sample")
    void passwordValidator_return_correct_very_weak_sample() {

        int actual = validator.passwordValidator("12345");
        int expected = 1;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Invalid iff input > 8 numbers")
    void passwordValidator_return_correct_invalid_if_more_than_8_numbers() {

        int actual = validator.passwordValidator("123456789");
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Weak from Sample")
    void passwordValidator_return_correct_weak_sample() {

        int actual = validator.passwordValidator("abcdef");
        int expected = 2;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Invalid iff input > 8 letters")
    void passwordValidator_return_correct_invalid_if_more_than_8_letters() {

        int actual = validator.passwordValidator("abcdefgh");
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Strong from Sample")
    void passwordValidator_return_correct_strong_sample() {

        int actual = validator.passwordValidator("abc123xyz");
        int expected = 3;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Invalid if input < 8 letters and numbers")
    void passwordValidator_return_correct_invalid_if_less_than_8_lettersAndNumbers() {

        int actual = validator.passwordValidator("abc123");
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Very strong from Sample")
    void passwordValidator_return_correct_very_strong_sample() {

        int actual = validator.passwordValidator("1337g@xor!");
        int expected = 4;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Invalid if input < 8 letters, numbers, and special")
    void passwordValidator_return_correct_if_invalid_if_less_than_8_lettersNumbersSpecial() {

        int actual = validator.passwordValidator("12#ab9");
        int expected = 0;

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Return correct output for very weak password")
    void generateOutput_veryWeak() {

        String actual = test.generateOutput("12345", 1);
        String expected = "The password '12345' is a very weak password.";

        assertEquals(expected, actual);

    }

    @Test
    @DisplayName("Return correct output for very strong password")
    void generateOutput_veryStrong() {

        String actual = test.generateOutput("1337g@xor!", 4);
        String expected = "The password '1337g@xor!' is a very strong password.";

        assertEquals(expected, actual);

    }


}