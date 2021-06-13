/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex39.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class solution39Test {
    String[] fNames = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
    String[] lNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
    String[] pos = {"Manager", "Software Engineer", "District Manager", "Programmer", "DBA", "Web Developer"};
    String[] sepDates = {"2016-12-31", "2016-10-05", "2015-12-19", "", "", "2015-12-18"};
    EmployeeDatabase test = new EmployeeDatabase(fNames, lNames, pos, sepDates);

    @Test
    @DisplayName("Prints employee at specific index: Jacquelyn")
    void printEmployeeAtIndex_printJacquelyn() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.sortEmployees();
        test.printEmployeeAtIndex(0);

        String expectedOutput  = "Jacquelyn Jackson   | DBA               |                \n";

        assertEquals(expectedOutput, outContent.toString());

    }

    @Test
    @DisplayName("Prints employee at specific index: Jake")
    void printEmployeeAtIndex_printJake() {

        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.sortEmployees();
        test.printEmployeeAtIndex(1);

        String expectedOutput  = "Jake Jacobson       | Programmer        |                \n";

        assertEquals(expectedOutput, outContent.toString());

    }

    @Test
    @DisplayName("Print unsorted list (PRINT TEST)")
    void printAllEmployees(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.printAllEmployees();

        String expectedOutput = """
                Name                | Position          | Separation Date
                --------------------|-------------------|----------------\r
                John Johnson        | Manager           | 2016-12-31    \s
                Tou Xiong           | Software Engineer | 2016-10-05    \s
                Michaela Michaelson | District Manager  | 2015-12-19    \s
                Jake Jacobson       | Programmer        |               \s
                Jacquelyn Jackson   | DBA               |               \s
                Sally Webber        | Web Developer     | 2015-12-18    \s
                """;

        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Print sorted list (SORT TEST)")
    void sortEmployees_printExpectedOutput(){
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        test.sortEmployees();
        test.printAllEmployees();

        String expectedOutput  = """
                Name                | Position          | Separation Date
                --------------------|-------------------|----------------\r
                Jacquelyn Jackson   | DBA               |               \s
                Jake Jacobson       | Programmer        |               \s
                John Johnson        | Manager           | 2016-12-31    \s
                Michaela Michaelson | District Manager  | 2015-12-19    \s
                Sally Webber        | Web Developer     | 2015-12-18    \s
                Tou Xiong           | Software Engineer | 2016-10-05    \s
                                """;

        assertEquals(expectedOutput, outContent.toString());
    }
}