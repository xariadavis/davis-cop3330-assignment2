/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex40.basic;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

class EmployeeDatabase {
    public List<HashMap<String, String>> allEmployees;

    public final String FIRST_NAME = "firstName";
    public final String LAST_NAME = "lastName";
    public final String POSITION = "position";
    public final String SEPARATION_DATE = "separationDate";

    private int numEmployees;

    public EmployeeDatabase(String[] fNames, String[] lNames, String[] pos, String[] sepDates) {
        List<HashMap<String, String>> importedEmployees = new ArrayList<>();

        this.numEmployees = fNames.length;

        for (int i = 0; i < numEmployees; i++) {
            HashMap<String, String> currentEmployee = new HashMap<>();
            currentEmployee.put(FIRST_NAME, fNames[i]);
            currentEmployee.put(LAST_NAME, lNames[i]);
            currentEmployee.put(POSITION, pos[i]);
            currentEmployee.put(SEPARATION_DATE, sepDates[i]);
            importedEmployees.add(currentEmployee);
        }

        this.allEmployees = importedEmployees;
    }


    public void searchForEmployeesContaining(String str) {
        ArrayList<Integer> matches = findIndexes(str);
        int numMatches = matches.size();

        if (matches.size() == 0) {
            System.out.println("No matches found.");
        } else {
            System.out.println("Results:");
            System.out.println();
            System.out.printf("%-20s| %-18s| %-15s\n", "Name", "Position", "Separation Date");
            System.out.println("--------------------|-------------------|----------------");
            for (int i = 0; i < numMatches; i++) {
                printEmployeeAtIndex(matches.get(i));
            }
        }
    }


    public void printEmployeeAtIndex(int index) {
        String currEmpName = (this.allEmployees.get(index).get(FIRST_NAME) + " " + this.allEmployees.get(index).get(LAST_NAME));
        String currEmpPos = this.allEmployees.get(index).get(POSITION);
        String currEmpSepDate = this.allEmployees.get(index).get(SEPARATION_DATE);
        System.out.printf("%-20s| %-18s| %-15s\n", currEmpName, currEmpPos, currEmpSepDate);
    }


    public ArrayList<Integer> findIndexes(String str) {
        ArrayList<Integer> matchingIndexes = new ArrayList<>();

        for (int i = 0; i < this.numEmployees; i++) {
            if (this.allEmployees.get(i).get(FIRST_NAME).toLowerCase().contains(str.toLowerCase()) || this.allEmployees.get(i).get(LAST_NAME).toLowerCase().contains(str.toLowerCase()))
                matchingIndexes.add(i);
        }

        return matchingIndexes;
    }

}
