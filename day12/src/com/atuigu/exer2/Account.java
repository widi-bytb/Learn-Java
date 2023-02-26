package com.atuigu.exer2;

public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;

    public Account() {
    }

    public Account(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    //    返回月利率
    public double getMonthlyInterest() {
        return annualInterestRate / 12;
    }

    //   取钱
    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("取款成功" + amount);
            return;
        }
        System.out.println("余额不足" + balance);
    }

    //    存钱
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("存款成功" + balance);
        }
    }
}
