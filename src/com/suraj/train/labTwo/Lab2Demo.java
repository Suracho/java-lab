package com.suraj.train.labTwo;

import java.util.ArrayList;

public class Lab2Demo {
    public static void main(String[] args) {


        Lab2Service labTwoService = new Lab2Service();

        //    Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element
//    in the array

        int[] iArr = new int[]{34,43,52,61,23,19,75};
        System.out.println("Second smallest integer is "+ labTwoService.getSecondSmallest(iArr));

//        Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order.
//        The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case.
//        Return the resulting array.
//        Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE

        String[] sArr = new String[]{"STRING","gate","lamb","MANGO"};
        System.out.println("Second smallest String in String array is "+ labTwoService.getSecondSmallestString(sArr));

//        Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order

        iArr = labTwoService.getSorted(iArr);
        System.out.println("Reverse and Sort array : ");
        for(int num:iArr){
            System.out.print(num + ", ");
        }
        System.out.println();
//        Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array.
//        Return the resulting array in descending order

        int[] duplicateArr = new int[]{44,44,33,22,33,22,11};

        ArrayList<Integer> duplicateArray = labTwoService.modifyArray(duplicateArr);
        System.out.println("After removing duplicates : ");
        for(int num:duplicateArray){
            System.out.print(num + ", ");
        }
    }
}
