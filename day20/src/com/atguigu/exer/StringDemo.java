package com.atguigu.exer;

/*
 * 将一个字符串进行反转。将字符串中指定部分进行反转。比如“abcdefg”反转为"abfedcg"
 *
 *
 * */
public class StringDemo {
    public static void main(String[] args) {
        StringDemo stringDemo = new StringDemo();
        String result = stringDemo.reverse2("abcdefighjkhjkhjkhk", 2, 5);
        System.out.println(result);
    }

    /*
     * 方式一：转换为char[]
     *
     * */
    public String reverse(String str, int startIndex, int endIndex) {

        char[] arr = str.toCharArray();
        for (int x = startIndex, y = endIndex; x < y; x++, y--) {
            char temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
        }
        return new String(arr);
    }

    /*
     * 方式二：
     *
     * */

    public String reverse1(String str, int startIndex, int endIndex) {

//        第一部分
        String reverseStr = str.substring(0, startIndex);
//        第二部分
        for (int i = endIndex; i >= startIndex; i--) {
            reverseStr += str.charAt(i);
        }
//        第三部分
        reverseStr += str.substring(endIndex + 1);
        return reverseStr;
    }

    //    方式三：使用StringBuffer或StringBuilder替换String
    public String reverse2(String str, int startIndex, int endIndex) {
        StringBuilder builder = new StringBuilder(str.length());

//      第一部分
        builder.append(str.substring(0, startIndex));
//      第二部分
        for (int i = endIndex; i >= startIndex; i--) {
            builder.append(str.charAt(i));
        }
//        第三部分
        builder.append(str.substring(endIndex + 1));


        return builder.toString();
    }

}
