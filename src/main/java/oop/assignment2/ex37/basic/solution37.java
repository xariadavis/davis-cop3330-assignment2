/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex37.basic;

import java.util.*;
import java.lang.StringBuilder;

public class solution37 {

    public static void main(String []args) {
        Scanner myObj = new Scanner(System.in);
        int minLength, numSpecials, numNumbers;

        do {
            System.out.print("What's the minimum length? ");
            minLength = safeReadInt(myObj);
        } while (minLength < 1);

        System.out.print("How many special characters? ");
        numSpecials = safeReadInt(myObj);

        System.out.print("How many numbers? ");
        numNumbers = safeReadInt(myObj);

        if ((numNumbers + numSpecials) > minLength/2) minLength = (numNumbers + numSpecials) * 2;

        String password = generatePassword(minLength, numSpecials, numNumbers);
        System.out.print("Your password is " + password);
        myObj.close();
    }


    public static int safeReadInt(Scanner myObj) {
        int readInt = -1;

        while (readInt < 0) {
            try {
                readInt = myObj.nextInt();
            } catch (InputMismatchException e) {
                System.out.print("Invalid input. Please input an integer. ");
                myObj.next();
            }
        }

        return readInt;
    }


    public static String generatePassword(int length, int numSpecials, int numNumbers) {
        Random rand = new Random();
        StringBuilder password = new StringBuilder();
        password.setLength(length);
        int insertIndex;

        List<Character> letters = new ArrayList<>();
        List<Character> specials = Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '(', ')');
        List<Character> numbers = Arrays.asList('0', '1', '2', '3', '4', '5', '6', '7', '8', '9');

        for (char i = 'a'; i <= 'z'; i++) {
            letters.add(i);
        }

        for (char i = 'A'; i <= 'Z'; i++) {
            letters.add(i);
        }

        for (int i = 0; i < numSpecials; i++) {
            do {
                insertIndex = rand.nextInt(length);
            } while (password.charAt(insertIndex) != '\0');
            password.setCharAt(insertIndex, specials.get(rand.nextInt(specials.size())));
        }

        for (int i = 0; i < numNumbers; i++) {
            do {
                insertIndex = rand.nextInt(length);
            } while (password.charAt(insertIndex) != '\0');

            password.setCharAt(insertIndex, numbers.get(rand.nextInt(numbers.size())));
        }

        for (int i = 0; i < length; i++) {
            if (password.charAt(i) == '\0') password.setCharAt(i, letters.get(rand.nextInt(letters.size())));
        }

        return password.toString();
    }

}