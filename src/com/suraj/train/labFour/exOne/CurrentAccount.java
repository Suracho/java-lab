package com.suraj.train.labFour.exOne;

public class CurrentAccount extends Account{
    final private double overdraftLimit = 10000;

    public CurrentAccount() {
    }

    public CurrentAccount(long accNum, double balance, Person accHolder) {
        super(accNum, balance, accHolder);
    }

    @Override
    public boolean withdraw(double amt) {
        if (amt > overdraftLimit) {
            return false;
        } else {
            return super.withdraw(amt);
        }
    }
}
