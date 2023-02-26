package com.atguigu.java;

/*
 * 算法的考查：求数值型数组中元素的最大值，最小值，平均数，总和等
 *
 * 定义一个int型的一维数组，包含10个元素，分别赋一些随机整数，然后求出所有元素的最大值，最小值，和值，
 * 要求：所有随机数都是两位数。
 * */
public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * (99 - 10 + 1) + 10);
        }

//        求数组元素的最大值
        int maxValue = arr[0];
        for (int j : arr) {
            if (maxValue < j) {
                maxValue = j;
            }
        }
//        System.out.println(maxValue);
//        求数组元素的最小值
        int minValue = arr[0];
        for (int i : arr) {
            if (minValue > i) {
                minValue = i;
            }
        }
//        System.out.println(minValue);
//        求数组元素的总和
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
//        System.out.println(sum);
//        求数组元素的平均数
        int avgValue = sum / arr.length;
        System.out.println(avgValue);
    }
}
