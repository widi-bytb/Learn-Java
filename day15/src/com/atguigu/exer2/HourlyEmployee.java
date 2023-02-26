package com.atguigu.exer2;

public class HourlyEmployee extends Employee {
    private int wage;
    private int hour;


    public HourlyEmployee() {

    }

    public HourlyEmployee(String name, int number, MyDate myDate) {
        super(name, number, myDate);
    }

    public HourlyEmployee(String name, int number, MyDate myDate, int wage, int hour) {
        super(name, number, myDate);
        this.wage = wage;
        this.hour = hour;
    }

    @Override
    public double earnings() {
        return wage * hour;
    }

    @Override
    public String toString() {
        return "HourlyEmployee" + super.toString();
    }
}
