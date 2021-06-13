/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex24.basic;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class anagramDetectorTest {
    anagramDetector detector = new anagramDetector();

    @Test
    @DisplayName("Are 'note' and 'tone' anagrams")
    void isAnagram_return_correct_value_for_true() {

        char[] first = {'n','o','t','e'};
        char[] second = {'t','o','n','e'};
        boolean actual = detector.isAnagram(first, second);
        assertTrue(actual);

    }

    @Test
    @DisplayName("Are 'note' and 'tote' anagrams")
    void isAnagram_returning_correct_value_for_false() {

        char[] first = {'n','o','t','e'};
        char[] second = {'t','o','t','e'};
        boolean actual = detector.isAnagram(first, second);
        assertFalse(actual);

    }

    @Test
    @DisplayName("Are 'notes' and 'tone' anagrams")
    void isAnagram_return_correct_value_for_false_diff_length() {

        char[] first = {'n','o','t','e', 's'};
        char[] second = {'t','o','n','e'};
        boolean actual = detector.isAnagram(first, second);
        assertFalse(actual);

    }
}