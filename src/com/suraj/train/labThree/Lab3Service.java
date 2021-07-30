package com.suraj.train.labThree;

import java.util.ArrayList;
import java.util.StringTokenizer;

public class Lab3Service {
//        Exercise 1: Write a Java program that reads a line of integers and then displays each integer and the sum of all integers.
//        (Use String Tokenizer class)?

    public int tokenizeAndSum(String input) {
        ArrayList<Integer> mango = new ArrayList<>();
        int sum = 0;
        StringTokenizer stringTokenizer = new StringTokenizer(input," ");
        while (stringTokenizer.hasMoreTokens()){
            try {
                mango.add(Integer.parseInt(stringTokenizer.nextToken()));
            }catch (NumberFormatException e){
                System.out.println(e);
            }
        }
        for (int num: mango) {
            sum += num;
        }
        return sum;
}
//      Exercise 2: Create a class containing a method to create the mirror image of a String.
//      The method should return the two Strings separated with a pipe(|) symbol
    public String getImage(String input){
        StringBuffer stringBuffer = new StringBuffer(input);
        String result;
        return result = input + "|" + stringBuffer.reverse();
    }

//      Exercise 3: Create a method which accepts a String and replaces all the consonants in the String with the next alphabet.
//      Note: Consonant refers to all alphabets excluding vowels
    public String alterString(String input){
        char[] inputChar = input.toCharArray();
        for (int i=0;i<input.length();i++){
            if(inputChar[i]!='a'&&inputChar[i]!='e'&&inputChar[i]!='i'&& inputChar[i]!='o' && inputChar[i]!='u'){
                 inputChar[i] = ++inputChar[i];
            }
        }
        input = String.valueOf(inputChar);
        return input;
    }

    //        Exercise 5: Write a Java program that displays the number of characters, lines and words in a text?
    public String countEverything(String input){
        int charCount = 0;
        int lineCount = 0;
        int wordCount = 1;
        for (int i=0;i<input.length();i++) {
            if(input.charAt(i)=='\n'){
                lineCount++;
            }
            if(Character.isLetter(input.charAt(i))){
                charCount++;
            }
            if(input.charAt(i) == ' '){
                wordCount++;
            }
        }
        return "Number of Characters are "+ charCount + " Number of Lines are "+ lineCount + " Number of words are "+ wordCount;
    }

//        Exercise 8: Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string,
//        if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order.
//        For Example: ANT is a positive String (Since T comes after N and N comes after A).
//        The method should return true if the entered string is positive.

    public boolean isPositiveString(String input) {
        for (int i = 0; i < input.length()-1; i++) {
            if(input.charAt(i) > input.charAt(i+1)){
                return false;
            }
        }
        return true;
    }


}
