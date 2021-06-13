/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex24.basic;

import java.util.Scanner;

public class solution24 {
    private static final Scanner myObj = new Scanner(System.in);
    private static char[] word1;
    private static char[] word2;

    public static void main(String[] args) {
        solution24 myApp = new solution24();
        anagramDetector validator = new anagramDetector();

        myApp.readUserInput();

        String word1S = String.valueOf(word1);
        String word2S = String.valueOf(word2);

        boolean result = validator.isAnagram(word1, word2);

        String output = myApp.generateOutput(result, word1S, word2S);
        System.out.println(output);

    }

    private void readUserInput(){
        System.out.println("Enter two strings and I will tell you if they are anagrams:");

        System.out.print("Enter the first string: ");
        word1 = myObj.next().toCharArray();

        System.out.print("Enter the second string: ");
        word2 = myObj.next().toCharArray();
    }

    private String generateOutput(boolean isAnagram, String word1S, String word2S){
        String output;
        if(isAnagram){
            output= String.format("\"%s\" and \"%s\" are anagrams.", word1S, word2S);
        } else {
            output= String.format("\"%s\" and \"%s\" are not anagrams.", word1S, word2S);
        }
        return output;
    }
}
