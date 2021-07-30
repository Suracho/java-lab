package com.suraj.train.labFour.exOne;

public class AccountDemo {
    public static void main(String[] args) {
        Account accountSmith = new SavingsAccount(100,1000,new Person("smith",42));
        Account accountKathy = new CurrentAccount(100,1000,new Person("Kathy",43));

        accountSmith.deposit(3600);
        accountKathy.deposit(3600);

        System.out.println("Update balance for "+accountSmith.getAccHolder().getName()+" after depositing is "+ accountSmith.getBalance());
        System.out.println("Update balance for "+accountKathy.getAccHolder().getName()+" after depositing is "+ accountKathy.getBalance());

        if(!accountSmith.withdraw(5000)){
            System.out.println("not enough balance");
        }

        if(!accountKathy.withdraw(20000)){
            System.out.println("overdraft limit reached");
        }
    }
}
