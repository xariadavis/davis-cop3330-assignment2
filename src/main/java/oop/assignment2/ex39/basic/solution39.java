/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */


package oop.assignment2.ex39.basic;

public class solution39 {
    public static void main(String[] args) {

            String[] firstNames = {"John", "Tou", "Michaela", "Jake", "Jacquelyn", "Sally"};
            String[] lastNames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
            String[] positions = {"Manager", "Software Engineer", "District Manager", "Programmer", "DBA", "Web Developer"};
            String[] separationDates = {"2016-12-31", "2016-10-05", "2015-12-19", "", "", "2015-12-18"};

            EmployeeDatabase database = new EmployeeDatabase(firstNames, lastNames, positions, separationDates); // database housing all of our information

            database.sortEmployees();
            database.printAllEmployees();

    }
}
