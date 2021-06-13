/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex40.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class solution40Test {
    String[] fNames = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
    String[] lNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
    String[] pos = {"Manager", "Software Engineer", "District Manager", "Programmer", "DBA", "Web Developer"};
    String[] sepDates = {"2016-12-31", "2016-10-05", "2015-12-19", "", "", "2015-12-18"};
    EmployeeDatabase test = new EmployeeDatabase(fNames, lNames, pos, sepDates);

    @Test
    @DisplayName("Correctly display search results for 'Jac'")
    void searchForEmployeesContaining_searchForJac() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.searchForEmployeesContaining("Jac");

        String expectedOutput = """
                Results:\r\n\r\nName                | Position          | Separation Date
                --------------------|-------------------|----------------\r
                Jake Jacobson       | Programmer        |               \s
                Jacquelyn Jackson   | DBA               |               \s
                                """;

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Correctly display search results for 'Mich'")
    void searchForEmployeesContaining_searchForMich() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.searchForEmployeesContaining("Mich");

        String expectedOutput = """
                Results:\r\n\r\nName                | Position          | Separation Date
                --------------------|-------------------|----------------\r
                Michaela Michaelson | District Manager  | 2015-12-19    \s
                                """;

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Correctly display no search results for 'dev'")
    void searchForEmployeesContaining_searchForDev() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.searchForEmployeesContaining("dev");

        String expectedOutput = "No matches found.\r\n";

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Prints employee at specific index: John")
    void printEmployeeAtIndex_index0IsJohn() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.printEmployeeAtIndex(0);

        String expectedOutput  = "John Johnson        | Manager           | 2016-12-31     \n";

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Prints employee at specific index: Tou")
    void printEmployeeAtIndex_index1IsTou() {
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.printEmployeeAtIndex(1);

        String expectedOutput  = "Tou Xiong           | Software Engineer | 2016-10-05     \n";

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Finding index for 'Jac'")
    void findIndexes_searchingForJac() {
        ArrayList<Integer> actual;
        actual = test.findIndexes("Jac");

        ArrayList<Integer> expected = new ArrayList<>();
        expected.add(3);
        expected.add(4);
        
        assertEquals(expected, actual);
        
    }

    @Test
    @DisplayName("Finding index for 'dev'")
    void findIndexes_searchingForDev() {
        ArrayList<Integer> actual;
        actual = test.findIndexes("dev");

        ArrayList<Integer> expected = new ArrayList<>(); // empty list

        assertEquals(expected, actual);

    }
}