package com.suraj.train.labOne;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab1Service {
    //    *******************OPTIONAL**************************
    //        Create a method to find the sum of the cubes of the digits of an n digit number
    public int cubesOfDigits(int number){
        int temp = 0;
        int result = 0;
        while(number!=0){
            temp = number%10;
            result += (temp*temp*temp);
            number /= 10;
        }
        return result;
    }
    //        Write a java program that simulates a traffic light.
//        The program lets the user select one of three lights: red, yellow, or green with radio buttons.
//        On entering the choice, an appropriate message with “stop” or “ready” or “go” should appear in the console .
//        Initially there is no message shown.
    public String trafficLights(){
        Scanner sc = new Scanner(System.in);
        String light = sc.nextLine();
        switch (light){
            case "red":
                return "stop";
            case "yellow":
                return "ready";
            case "green" :
                return "go";
            default:
                return "Invalid Light";
        }
    }
    //        The Fibonacci sequence is defined by the following rule.
//        The first 2 values in the sequence are 1, 1.
//        Every subsequent value is the sum of the 2 values preceding it.
//        Write a Java program that uses both recursive and non-recursive functions to print the nth value of the
//        Fibonacci sequence?

    public int recursiveFibo(int number) {
        if(number <= 1){
            return number;
        }
        return recursiveFibo(number-1)+recursiveFibo(number-2);
    }

    public int nonRecursiveFibo(int number) {
        int result=0;
        int fib1 = 0;
        int fib2 = 1;
        for(int i=1;i<number;i++){
            result = fib1 + fib2;
            fib1 = fib2;
            fib2 = result;
        }
        return result;
    }
    // Write a Java program that prompts the user for an integer and then prints out all the prime numbers up to that Integer?
    public boolean isPrime(int number){
        for(int i=2;i<=number/2;i++){
            if(number%i==0){
                return false;
            }
        }
        return true;
    }
    public ArrayList<Integer> primeNumberUptoN(int number) {
        ArrayList<Integer> primeNumbers = new ArrayList<>();
        for(int i=0;i<=number;i++){
            if(isPrime(i)){
                primeNumbers.add(i);
            }
        }
        return primeNumbers;
    }
    //        *************************MANDATORY****************************

    //    Exercise 5: Create a class with a method which can calculate the sum of first n natural numbers which
//    are divisible by 3 or 5.
    public int calculateSum(int n) {
        int sum = 0;
        for(int i=1;i<=n;i++){
            if(i%3==0||i%5==0){
                sum += i;
            }
        }
        return sum;
    }
    //    Exercise 6: Create a class with a method to find the difference between the sum of the squares and
//    the square of the sum of the first n natural numbers.
    public int calculateDifference(int n){
        int sumOfSquares = 0;
        int sumOfSquareCollective = 0;
        for(int i=1;i<=n;i++){
            sumOfSquares += (i*i);
            sumOfSquareCollective += i;
        }
        return sumOfSquares - (sumOfSquareCollective * sumOfSquareCollective);
    }
    //    Exercise 7: Create a method to check if a number is an increasing number
    public boolean checkNumber(int n){
        int temp1 = 0;
        int temp2 = 0;
        int temp =0;
        while(n!=0){
            temp1 = n %10;

            temp = n/10;
            temp2 = temp%10;
            if(temp2>temp1){
                return false;
            }
            n /= 10;
        }
        return true;
    }
    //    Exercise 8: Create a method to check if a number is a power of two or not
    public boolean checkNumberPowerOf2(int number){
        for(int i=1;i<number;i++){
            if(i*i==number){
                return true;
            }
            if(i*i>number){
                return false;
            }
        }
        return false;
    }
}
