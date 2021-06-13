/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex33.basic;

import java.util.Random;

public class magic8BallGame {

    public int generateRandomNum(){
        Random rand = new Random();
        int upperbound = 5;
        return rand.nextInt(upperbound);
    }

    public void printResponse(int randomNum){
        String[] response = {"\nYes.", "\nNo.", "\nMaybe.", "\nAsk me later."};
        System.out.println(response[randomNum]);
    }
}
