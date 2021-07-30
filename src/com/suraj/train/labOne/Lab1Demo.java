package com.suraj.train.labOne;

public class Lab1Demo {
    public static void main(String[] args) {
        //    *******************OPTIONAL**************************

        //        Create a method to find the sum of the cubes of the digits of an n digit number

        Lab1Service lab1Service = new Lab1Service();
        System.out.println(lab1Service.cubesOfDigits(54));

//        Write a java program that simulates a traffic light.
//        The program lets the user select one of three lights: red, yellow, or green with radio buttons.
//        On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .
//        Initially there is no message shown.

        System.out.println(lab1Service.trafficLights());

//        The Fibonacci sequence is defined by the following rule.
//        The first 2 values in the sequence are 1, 1.
//        Every subsequent value is the sum of the 2 values preceding it.
//        Write a Java program that uses both recursive and non-recursive functions to print the nth value of the
//        Fibonacci sequence?

        System.out.println(lab1Service.recursiveFibo(3));
        System.out.println(lab1Service.nonRecursiveFibo(3));

//        Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?

        System.out.println(lab1Service.primeNumberUptoN(10));

//        *************************MANDATORY****************************
        //    Exercise 5: Create a class with a method which can calculate the sum of first n natural numbers which
//    are divisible by 3 or 5.

        System.out.println(lab1Service.calculateSum(5));

        //    Exercise 6: Create a class with a method to find the difference between the sum of the squares and
//    the square of the sum of the first n natural numbers.

        System.out.println(lab1Service.calculateDifference(5));

        //    Exercise 7: Create a method to check if a number is an increasing number

        System.out.println(lab1Service.checkNumber(1243));

        //    Exercise 8: Create a method to check if a number is a power of two or not

        System.out.println(lab1Service.checkNumberPowerOf2(4));
    }
}
