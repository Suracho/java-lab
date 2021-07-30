package com.suraj.train.labFive;

import com.suraj.train.labFive.exceptions.EmployeeException;
import com.suraj.train.labFive.exceptions.InvalidAgeException;
import com.suraj.train.labFive.exceptions.InvalidFullNameException;
import com.suraj.train.labFive.model.Employee;
import com.suraj.train.labFive.model.Person;

public class Lab5Demo {
    public static void main(String[] args) {

 //    Exercise 1:  Validate the age of a person and display proper message by using user defined exception.
//    Age of a person should be above 15.
        try {
            Person person = new Person(13);
        }catch (InvalidAgeException e) {
            System.out.println(e);
        }

//        Exercise 2: Write a Java Program to validate the full name of an employee.
//        Create and throw a user defined exception if firstName and lastName is blank.


//        Exercise 3:  Create an Exception class named as “EmployeeException”(User defined Exception) in a package
//        named as “com.cg.eis.exception” and throw an exception if salary of an employee is below than 3000.
//        Use Exception Handling mechanism to handle exception properly.

        try {
            Employee employee = new Employee("","",2000);
        }catch (InvalidFullNameException | EmployeeException e) {
            System.out.println(e);
        }



    }
}
