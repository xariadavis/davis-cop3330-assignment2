/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex33.basic;

import java.util.Scanner;

public class solution33 {
    private static final Scanner myObj = new Scanner(System.in);
    public static void main(String[] args) {
        magic8BallGame game = new magic8BallGame();

        System.out.print("What's your question?\n> ");

        myObj.nextLine();

        int output = game.generateRandomNum();
        game.printResponse(output);
    }
}
