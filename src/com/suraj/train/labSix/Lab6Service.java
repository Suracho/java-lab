package com.suraj.train.labSix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class Lab6Service {

//    Exercise 1: Create a method which accepts a hash map and return the values of the map in sorted order as a List.
    public List getValues(HashMap hm){
        ArrayList<String> keys = new ArrayList<>(hm.keySet());
        ArrayList<Integer> values = new ArrayList<>();
        ArrayList combined = new ArrayList();

        Collections.sort(keys);
        for (String key:keys) {
            values.add((Integer) hm.get(key));
        }

        combined.add(keys);
        combined.add(values);
        return combined;
    }

//        Create a method that accepts a character array and count the number of times each character is present in the array.
    public HashMap countChars(char[] charArr){
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 97; i < 123; i++) {
            hm.put((char) i,0);
        }
        for (char c:charArr) {
            hm.put(c,hm.get(c)+1);
        }
        return hm;
    }

    public HashMap<Integer,Integer> getSquares(int[] numArr){
        HashMap<Integer,Integer> hm = new HashMap<>();

        for (int num:numArr) {
            hm.put(num,num*num);
        }

        return hm;
    }
}
