/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex32.basic;

public class solution32 {

    public static void main(String[] args) {
        guessTheNumberGame game = new guessTheNumberGame();


        Boolean playAgain = true;
        String playAgainChar;
        System.out.println("Let's play Guess the Number!");

        while(playAgain){
            System.out.println();
            int difficulty = game.getUserDifficulty();
            int randomNum = game.randNumber(difficulty);

            System.out.print("I have my number. What's your guess? ");

            int numGuesses = game.numGuesses(randomNum);

            System.out.println("You got it in " + numGuesses + " guesses!");
            System.out.println();
            System.out.print("Do you wish to play again (Y/N)? ");

            playAgainChar = game.playAgainCharFun();
            if(!game.playAgainBool(playAgainChar)) return;
        }

    }
}


