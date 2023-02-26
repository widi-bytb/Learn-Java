package com.atuigu.exer2;

public class CheckAccount extends Account {
    private double overdraft;

    public CheckAccount(int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }

    @Override
    public void withdraw(double amount) {
        if (getBalance() >= amount) {
//            setBalance(getBalance() - amount);
            super.withdraw(amount);
        } else if (overdraft >= (amount - getBalance())) {//透支额度+余额足够消费

            overdraft -= (amount - getBalance());
            setBalance(0);
        } else {
            System.out.println("超过可透支限额！");
        }

    }
}
