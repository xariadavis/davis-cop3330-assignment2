/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex32.basic;

import java.util.Random;
import java.util.Scanner;

public class guessTheNumberGame {
    private static final Scanner myObj = new Scanner(System.in);
    private Random rand = new Random();

    public int getUserDifficulty(){
        int difficulty = 0;
        do {
            System.out.print("Enter the difficulty level (1, 2, or 3): ");
            try {
                difficulty = myObj.nextInt();
            } catch (Exception e) {
                System.out.println("Error. Please enter integer values 1, 2, or 3.");
                myObj.nextLine();
            }
        } while (difficulty < 1 || difficulty > 3);
        return difficulty;
    }

    public int randNumber(int difficulty){
        int randMax = 0;
        int randNum;
        switch (difficulty) {
            case 1 -> randMax = 10;
            case 2 -> randMax = 100;
            case 3 -> randMax = 1000;
        }

        randNum = rand.nextInt(randMax) + 1;
        return randNum;
    }

    public int numGuesses(int randomNum){
        int userGuess = 0;
        int numGuesses = 0;
        do {
            try {
                userGuess = myObj.nextInt();
                if (userGuess < randomNum) System.out.print("Too low. Guess again: ");
                else if (userGuess > randomNum) System.out.print("Too high. Guess again: ");
                numGuesses++;
            } catch (Exception e) {
                myObj.nextLine();
                numGuesses++;
                System.out.print("Not a number. Guess again: ");
            }
        } while (userGuess != randomNum);
        myObj.nextLine();
        return numGuesses;
    }

    public String playAgainCharFun(){
        String playAgainChar = null;
        do {
            if(myObj.hasNextLine()) {
                playAgainChar = myObj.nextLine().toLowerCase();
            }
            else {
                System.out.print("Not a valid response. Please enter (Y/N). ");
            }
        } while (!(playAgainChar.equals("n") || playAgainChar.equals("y")));
        return playAgainChar;
    }


    public boolean playAgainBool(String playAgainChar){
        Boolean playAgain = null;
        if (playAgainChar.equals("y")) playAgain = true;
        else if (playAgainChar.equals("n")) playAgain = false;
        while (!(playAgainChar.equals("n") || playAgainChar.equals("y")));
        return playAgain;
    }

}
