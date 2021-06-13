/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 Xaria Davis
 */

package oop.assignment2.ex27.basic;

class inputValidation {

    public boolean isNameValid(String name){
        int nameLen = name.length();
        return nameLen >= 2;
    }

    public boolean isNameFilled(String name) {
        return !name.equals("");
    }

    public boolean isZipInt(String zipCode){
        return zipCode.matches("[0-9]{5}");
    }

    public boolean isEmpIDValid(String employeeID){
        return employeeID.matches("[A-Za-z]{2}-[0-9]{4}");
    }

    public void validateInput(String firstName, String lastName, String zipCode, String employeeID){
        if(isNameValid(firstName) && isNameValid(lastName) && isZipInt(zipCode) && isEmpIDValid(employeeID)){
            System.out.print("There were no errors found.\n");
        }

        if(!isNameValid(firstName)){
            System.out.print("The first name must be at least 2 characters long.\n");
        }

        if (!isNameFilled(firstName)) {
            System.out.print("The first name must be filled in.\n");
        }

        if(!isNameValid(lastName)) {
            System.out.print("The last name must be at least 2 characters long.\n");
        }

        if (!isNameFilled(lastName)) {
            System.out.print("The last name must be filled in.\n");
        }

        if(!isEmpIDValid(employeeID)){
            System.out.print("The employee ID must be in the format of AA-1234.\n");
        }

        if(!isZipInt(zipCode)){
            System.out.print("The zip code must be a 5 digit number.\n");
        }

    }
}
