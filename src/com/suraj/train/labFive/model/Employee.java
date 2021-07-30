package com.suraj.train.labFive.model;

import com.suraj.train.labFive.exceptions.EmployeeException;
import com.suraj.train.labFive.exceptions.InvalidFullNameException;

public class Employee {
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(String firstName, String lastName, int salary) throws InvalidFullNameException, EmployeeException {
        if(firstName.equals("") || lastName.equals("")){
            throw new InvalidFullNameException("Both the name fields cannot be blank");
        }else {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        if(salary<3000){
            throw new EmployeeException("Salary cannot be below 3000");
        }else {
            this.salary = salary;
        }
    }
}
