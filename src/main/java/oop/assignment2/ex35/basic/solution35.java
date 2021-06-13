/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex35.basic;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class solution35 {
    private static final Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        solution35 myApp = new solution35();

        ArrayList<String> userNames = myApp.userArray();
        int arrayLEN = myApp.returnArrayLEN(userNames);
        int randomNum = myApp.generateRandomNum(arrayLEN);
        myApp.printWinner(userNames, randomNum);

    }

    public ArrayList<String> userArray(){
        ArrayList<String> userNames = new ArrayList<>();

        while (true)
        {
            System.out.print("Enter a name: ");
            String name = myObj.nextLine();
            userNames.add(name);
            if (name.equals("")) {
                break;
            }
        }
        return userNames;
    }

    public int returnArrayLEN(ArrayList<String> userNames){
        return userNames.size();
    }


    private void printWinner(ArrayList<String> userNames, int randomNum){
        System.out.println("The winner is... " + userNames.get(randomNum));
    }


    public int generateRandomNum(int arrayLEN){
        int n = arrayLEN - 1;
        Random rand = new Random();
        return rand.nextInt(n);
    }


}
