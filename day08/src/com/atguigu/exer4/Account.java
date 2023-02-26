package com.atguigu.exer4;

public class Account {
    private double balance;

    public Account(double init_balance) {
        this.balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    //    存钱
    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            System.out.println("存款成功");
        }
    }

    //    取钱
    public void withdraw(double amt) {
        if (amt > balance) {
            System.out.println("余额不足");
            return;
        }
        balance -= amt;
        System.out.println("取钱成功,余额为" + balance);
    }
}
