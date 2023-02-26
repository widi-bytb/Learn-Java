package com.atguigu.java;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil util = new ArrayUtil();
        int[] arr = new int[]{32, 423, 25, 36, 12, 3, 1, -90, 45, -1, 266, 2};
        int max = util.getMax(arr);
        System.out.println("最大值为：" + max);
        util.sort(arr);
        util.print(arr);
    }
}
