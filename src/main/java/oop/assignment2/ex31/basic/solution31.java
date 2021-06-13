/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex31.basic;

import java.util.Scanner;

public class solution31 {
    private static final Scanner myObj = new Scanner(System.in);
    private static int age;
    private static int restingHR;

    public static void main(String[] args) {
        solution31 myApp = new solution31();

        myApp.readUserInput();
        myApp.generateOutput();
    }

    private void readUserInput(){
        System.out.print("What is your resting heart rate? ");
        restingHR = inputNum();

        System.out.print("How old are you? ");
        age = inputNum();
    }

    private int inputNum() {
        while (!myObj.hasNextInt()){
            System.out.print("Please enter an integer: ");
            myObj.nextLine();
        }
        return myObj.nextInt();
    }

    private void generateOutput(){
        System.out.format("\nResting Pulse: %d\t\tAge: %d\n\n", restingHR, age);

        System.out.println("Intensity    | Rate");
        System.out.println("-------------|--------");

        for(int i = 55; i <= 95; i+=5){
            int targetHR = targetHeartRate(age,restingHR,i);
            System.out.format("%d%%\t\t\t | %d bpm\n", i, targetHR);
        }

    }

    public int targetHeartRate(int age, int restingHR, int intensity){
        return (((220 - age) - restingHR) * intensity / 100) + restingHR;
    }
}
