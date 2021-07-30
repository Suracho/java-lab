package com.suraj.train.labFour.exOne;

public class Account {
    private long accNum;
    private double balance;
    private Person accHolder;


    public Account(long accNum, double balance, Person accHolder) {
        this.accNum = accNum;
        this.balance = balance;
        this.accHolder = accHolder;
    }

    public long getAccNum() {
        return accNum;
    }

    public void setAccNum(long accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Person getAccHolder() {
        return accHolder;
    }

    public void setAccHolder(Person accHolder) {
        this.accHolder = accHolder;
    }

    public void deposit(double amt){
        this.balance += amt;
    }

    public Account() {
    }

    public boolean withdraw(double amt){
        this.balance -= amt;
        return true;

    }
}
