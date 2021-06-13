/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex24.basic;

import java.util.Arrays;

public class anagramDetector {
    public boolean isAnagram(char[] word1, char[] word2){
        int word1LEN = word1.length;
        int word2LEN = word2.length;

        if(word1LEN != word2LEN){
            System.out.println("Words are not the same length. Please input words with the same length.");
            return false;
        }

        Arrays.sort(word1);
        Arrays.sort(word2);

        for(int i = 0; i < word1LEN; i++){
            if(word1[i] != word2[i]){
                return false;
            }
        }
        return true;
    }
}
