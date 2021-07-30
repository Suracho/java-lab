package com.suraj.train.labFour.exOne;

public class SavingsAccount extends Account {
    final private double minimumBalance = 100;
    double balance = getBalance();

    public SavingsAccount(long accNum, double balance, Person accHolder) {
        super(accNum, balance, accHolder);
    }

    public SavingsAccount() {
    }

    @Override
    public void deposit(double amt) {
        super.deposit(amt);
    }

    @Override
    public boolean withdraw(double amt) {
        if (balance - amt < minimumBalance) {
            return false;
        } else {
            return super.withdraw(amt);
        }
    }
}
