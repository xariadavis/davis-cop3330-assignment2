/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex36.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class solution36 {
    private static final Scanner myObj = new Scanner(System.in);
    mathematicalOps math = new mathematicalOps();

    public static void main(String[] args) {
        solution36 myApp = new solution36();
        myApp.generateOutput();
    }

    private static ArrayList<Integer> userNumbers() {
        String readLine;
        ArrayList<Integer> values = new ArrayList<>();

        System.out.print("Enter a number: ");
        while (!(readLine = myObj.nextLine()).equals("done")) {
            try {
                int val = Integer.parseInt(readLine);
                values.add(val);
            } catch (NumberFormatException e) {}
            System.out.print("Enter a number: ");
        }

        System.out.print("Numbers: ");
        for (int i = 0; i < values.size(); i++) {
            System.out.print(values.get(i));
            if(i < values.size() - 1){
                System.out.print(", ");
            }
        }
        return values;
    }

    private void generateOutput(){
        ArrayList <Integer> values = userNumbers();

        double average = math.average(values);
        System.out.format("\nThe average is %.1f", average);

        int min = math.min(values);
        System.out.format("\nThe minimum is %d", min);

        int max = math.max(values);
        System.out.format("\nThe maximum is %d", max);

        double std = math.std(values);
        System.out.format("\nThe standard deviation is %.2f", std);
    }
}

