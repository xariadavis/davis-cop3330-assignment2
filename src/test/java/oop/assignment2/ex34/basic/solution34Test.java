/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex34.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class solution34Test {
    solution34 test = new solution34();

    @Test
    @DisplayName("Generate sample output list")
    void generateListFromOutput() {

        String[] expected = {"John Smith", "Jackie Johnson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] actual = test.generateList();
        assertArrayEquals(expected, actual);
    }

    @Test
    @DisplayName("Given list != sample values")
    void generateListFalseValues() {

        String[] expected = {"Johnny Smith", "Jackie Robinson", "Chris Rock", "Amanda Cullen", "Jeremy Goodwin"};
        String[] actual = test.generateList();
        assertNotEquals(expected, actual);
    }

    @Test
    @DisplayName("Removing John from string")
    void removeJohnnyFromString() {

        String[] empNames = {"John Smith", "Jackie Johnson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String empRemoved = "John Smith";
        String[] expected = {"Jackie Johnson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String[] actual = test.removeNameFromString(empNames, empRemoved);
        assertArrayEquals(expected, actual);

    }

    @Test
    @DisplayName("Removing Chris from string")
    void removeChrisFromString() {

        String[] empNames = {"John Smith", "Jackie Johnson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};
        String empRemoved = "Chris Jones";
        String[] expected = {"John Smith", "Jackie Johnson", "Amanda Cullen", "Jeremy Goodwin"};
        String[] actual = test.removeNameFromString(empNames, empRemoved);
        assertArrayEquals(expected, actual);

    }

}