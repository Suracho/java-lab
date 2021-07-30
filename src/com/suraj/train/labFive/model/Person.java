package com.suraj.train.labFive.model;

import com.suraj.train.labFive.exceptions.InvalidAgeException;

public class Person {
    private int age;

    public Person(int age) throws InvalidAgeException {
        if(age<15){
            throw new InvalidAgeException("AGE BELOW 15 NOT ALLOWED");
        }else {
            this.age = age;
        }
    }
}
