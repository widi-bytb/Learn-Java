package com.atguigu.exer2;

import java.util.Calendar;
import java.util.Scanner;

public class PayrollSystem {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("请输入当月的月份：");
//        int month = scanner.nextInt();

        Calendar calendar = Calendar.getInstance();
        int month = calendar.get(Calendar.MONTH);//获取当前的月份

        Employee[] arr = new Employee[2];

        arr[0] = new SalariedEmployee("马森", 1001, new MyDate(1992, 10, 28), 10000);
        arr[1] = new HourlyEmployee("张三", 2000, new MyDate(1999, 11, 20), 60, 240);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);

            double salary = arr[i].earnings();
            System.out.println(salary);

            if (month+1 == arr[i].getBirthday().getMonth()) {
                System.out.println("生日快乐");
            }
        }

    }


}
