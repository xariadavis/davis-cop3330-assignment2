/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex27.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class solution27Test {
    inputValidation test = new inputValidation();

    @Test
    @DisplayName("Name longer than two characters")
    void isNameValid_LongerThan2Characters() {
        String actual = "Xaria";
        boolean expected = test.isNameValid(actual);
        assertTrue(expected);
    }

    @Test
    @DisplayName("Name is two characters")
    void isNameValid_2Characters() {
        String actual = "XD";
        boolean expected = test.isNameValid(actual);
        assertTrue(expected);
    }

    @Test
    @DisplayName("Name shorter than two characters")
    void isNameValid_shorter2Characters() {
        String actual = "X";
        boolean expected = test.isNameValid(actual);
        assertFalse(expected);
    }

    @Test
    @DisplayName("Name field filled")
    void isNameFilled_Filled() {
        String actual = "Xaria";
        boolean expected = test.isNameFilled(actual);
        assertTrue(expected);
    }

    @Test
    @DisplayName("Name field empty")
    void isNameFilled_notFilled() {
        String actual = "";
        boolean expected = test.isNameFilled(actual);
        assertFalse(expected);
    }

    @Test
    @DisplayName("Zipcode all ints")
    void isZipInt_inputNumeric() {
        String actual = "12345";
        boolean expected = test.isZipInt(actual);
        assertTrue(expected);
    }

    @Test
    @DisplayName("Zipcode all chars")
    void isZipInt_inputChars() {
        String actual = "abcdef";
        boolean expected = test.isZipInt(actual);
        assertFalse(expected);
    }

    @Test
    @DisplayName("Zipcode chars and nums")
    void isZipInt_inputCharsAndNums() {
        String actual = "a2546bcde3232f";
        boolean expected = test.isZipInt(actual);
        assertFalse(expected);
    }


    @Test
    @DisplayName("Valid employee ID")
    void isEmpIDValid_Valid() {
        String actual = "TK-1234";
        boolean expected = test.isEmpIDValid(actual);
        assertTrue(expected);
    }

    @Test
    @DisplayName("invalid employee ID")
    void isEmpIDValid_Invalid() {
        String actual = "A12-1234";
        boolean expected = test.isEmpIDValid(actual);
        assertFalse(expected);
    }

    @Test
    @DisplayName("Sample output no errors")
    void validateInput_Valid() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.validateInput("John", "Johnson", "55555", "TK-4321");

        String expectedOutput  = "There were no errors found.\n";

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Sample output all errors")
    void validateInput_invalid() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.validateInput("J", "", "ABCDE", "A12-1234");

        String expectedOutput  =
                "The first name must be at least 2 characters long.\n" +
                "The last name must be at least 2 characters long.\n" +
                "The last name must be filled in.\n" +
                "The employee ID must be in the format of AA-1234.\n" +
                "The zip code must be a 5 digit number.\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}