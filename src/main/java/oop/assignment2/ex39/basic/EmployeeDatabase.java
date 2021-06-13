/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex39.basic;

import java.util.ArrayList;
import java.util.Comparator;
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

    public void printAllEmployees() {
        if (this.numEmployees == 0) {
            System.out.print("No employees found.\n");
        } else {
            System.out.printf("%-20s| %-18s| %-15s\n", "Name", "Position", "Separation Date");
            System.out.println("--------------------|-------------------|----------------");
            for (int i = 0; i < this.numEmployees; i++) {
                printEmployeeAtIndex(i);
            }
        }
    }


    public void printEmployeeAtIndex(int index) {
        String currEmpName = (this.allEmployees.get(index).get(FIRST_NAME) + " " + this.allEmployees.get(index).get(LAST_NAME));
        String currEmpPos = this.allEmployees.get(index).get(POSITION);
        String currEmpSepDate = this.allEmployees.get(index).get(SEPARATION_DATE);
        System.out.printf("%-20s| %-18s| %-15s\n", currEmpName, currEmpPos, currEmpSepDate);
    }


    public void sortEmployees() {
        this.allEmployees.sort(Comparator.comparing(e -> e.get(LAST_NAME)));
    }
}