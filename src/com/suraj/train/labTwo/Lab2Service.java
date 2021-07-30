package com.suraj.train.labTwo;

import java.util.ArrayList;
import java.util.Collections;

public class Lab2Service {
    //    Exercise 1: Create a method which accepts an array of integer elements and return the second smallest element
//    in the array
    public int getSecondSmallest(int[] arr){
            for (int i = 0; i < arr.length; i++) {
                for (int j=0;j< arr.length-i-1; j++){
                    if(arr[j] > arr[j+1]){
                        int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                    }
                }
            }
            return arr[1];
    }

//        Exercise 2: Create a method that can accept an array of String objects and sort in alphabetical order.
//        The elements in the left half should be completely in uppercase and the elements in the right half should be completely in lower case.
//        Return the resulting array.
//        Note: If there are odd number of String objects, then (n/2) +1 elements should be in UPPPERCASE
    public String getSecondSmallestString(String[] arr){
        for(int i=0; i < arr.length; i++){
            for (int j=i+1; j< arr.length; j++){
                if(arr[j].compareTo(arr[j-1])<0){
                    String temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        return arr[1];
    }

//        Exercise 3: Create a method which accepts an integer array, reverse the numbers in the array and returns the resulting array in sorted order

    public int[] getSorted(int[] arr) {
//        reversing array
        for (int i = 0; i < arr.length; i++) {
            arr[i] = reverseNumber(arr[i]);
        }
//        sorting array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public int reverseNumber(int num){
        int ans = 0;
        while(num!=0){
            ans = (ans * 10)  + (num%10);
            num /= 10;
        }
        return ans;
    }

//        Exercise 4: Create a method which accepts an integer array and removes all the duplicates in the array.
//        Return the resulting array in descending order
    public ArrayList<Integer> modifyArray(int[] duplicateArr) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < duplicateArr.length; i++) {
            if(result.contains(duplicateArr[i])){
                continue;
            }
            result.add(duplicateArr[i]);
        }
        Collections.sort(result,Collections.reverseOrder());
        return result;
    }
}
