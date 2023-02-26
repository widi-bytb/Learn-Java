package com.atuigu.exer2;

public class AccountTest {
    public static void main(String[] args) {
        Account a = new Account(1122, 2000, 0.045);
        a.withdraw(30000);
        a.withdraw(2500);

        a.deposit(3000);
        System.out.println(a.getMonthlyInterest());
    }


}
