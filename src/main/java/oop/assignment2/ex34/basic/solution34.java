/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex34.basic;


import java.util.Scanner;

public class solution34 {
    private static final Scanner myObj = new Scanner(System.in);

    public static void main(String[] args) {
        solution34 myApp = new solution34();
        String[] employeeNames = myApp.generateList();

        String beingRemoved = myApp.userInputEmployeeRemoval();
        myApp.generateOutput(employeeNames, beingRemoved);
    }

    public String[] generateList(){
        System.out.println("There are 5 employees: ");

        String[] employeeNames = {"John Smith", "Jackie Johnson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"};

        for(int i = 0; i < 5; i++){
            System.out.println(employeeNames[i]);
        }
        return employeeNames;
    }


    private String userInputEmployeeRemoval(){
        System.out.print("\nEnter an employee name to remove: ");
        return myObj.nextLine();
    }

    public String[] removeNameFromString(String[] employeesNames, String beingRemoved){

            String[] output = new String[employeesNames.length - 1];
            int count = 0;
            for (String i : employeesNames) {
                if (!i.equals(beingRemoved)) {
                    output[count++] = i;
                }
            }
            return output;
        }

    private void generateOutput(String[] employeesNames, String beingRemoved){
        System.out.println("\nThere are 4 employees: ");

        String[] newArray = removeNameFromString(employeesNames, beingRemoved);
        for(int i = 0; i < 4; i++){
            System.out.println(newArray[i]);
        }

    }
}
