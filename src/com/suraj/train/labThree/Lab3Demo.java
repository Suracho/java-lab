package com.suraj.train.labThree;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Lab3Demo {
    public static void main(String[] args) {
        Lab3Service lab3Service = new Lab3Service();
//        Exercise 1: Write a Java program that reads a line of integers and then displays each integer and the sum of all integers.
//        (Use String Tokenizer class)?

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        System.out.println("Sum after tokenizing and adding is " + lab3Service.tokenizeAndSum(input));


//      Exercise 2: Create a class containing a method to create the mirror image of a String.
//      The method should return the two Strings separated with a pipe(|) symbol

        input = sc.nextLine();
        System.out.println("mirror image is " + lab3Service.getImage(input));

//      Exercise 3: Create a method which accepts a String and replaces all the consonants in the String with the next alphabet.
//      Note: Consonant refers to all alphabets excluding vowels

        input = lab3Service.alterString(sc.nextLine());
        System.out.println("After replacing consonants in the String with the next alphabet, the new String is "+ input);

//        Exercise 4: Create a method that accepts a number and modifies it such that the each of the digit in the newly formed
//        number is equal to the difference between two consecutive digits in the original number.
//        The digit in the units place can be left as it is.
//        Note: Take the absolute value of the difference. Ex: 6-8 = 2


//        Exercise 5: Write a Java program that displays the number of characters, lines and words in a text?
        System.out.println(lab3Service.countEverything(sc.nextLine()));

//        Exercise 8: Create a method that accepts a String and checks if it is a positive string. A string is considered a positive string,
//        if on moving from left to right each character in the String comes after the previous characters in the Alphabetical order.
//        For Example: ANT is a positive String (Since T comes after N and N comes after A).
//        The method should return true if the entered string is positive.

        System.out.println(lab3Service.isPositiveString(sc.next()));

//        Exercise 9: Create a method to accept date and print the duration in days, months and years with regards to current system date.
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        System.out.println(dateFormat.format(date));


    }
}
