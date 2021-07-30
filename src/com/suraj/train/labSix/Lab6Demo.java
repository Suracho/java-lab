package com.suraj.train.labSix;

import java.util.HashMap;
import java.util.TreeMap;

public class Lab6Demo {
    public static void main(String[] args) {
        Lab6Service lab6Service = new Lab6Service();

//    Exercise 1: Create a method which accepts a hash map and return the values of the map in sorted order as a List.
        HashMap<String,Integer> hm = new HashMap<>();
        hm.put("e",3);
        hm.put("d",2);
        hm.put("c",1);
        hm.put("b",4);
        hm.put("a",5);
        System.out.println(lab6Service.getValues(hm));

//        Create a method that accepts a character array and count the number of times each character is present in the array.
        System.out.println(lab6Service.countChars("hello this is me".replaceAll("\\s","").toCharArray()));

//        Exercise 3: Create a method which accepts an array of numbers and returns the numbers and their squares in Hashmap
        System.out.println(lab6Service.getSquares(new int[]{5, 4, 3, 2, 1, 3}));
    }
}
