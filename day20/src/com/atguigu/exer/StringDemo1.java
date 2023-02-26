package com.atguigu.exer;

/*
 * 获取一个字符串在另一个字符串中出现的次数。
 * 比如：获取“ab”在"abkkcadkaabkedfkabkskab"中出现的次数
 *
 *
 *
 * */
public class StringDemo1 {
    public static void main(String[] args) {
        StringDemo1 stringDemo1 = new StringDemo1();
        int count = stringDemo1.getCount("abkkcadkaabkedfkabkskab", "ab");
        System.out.println(count);
    }

    public int getCount(String str, String subStr) {
        int strNum = str.length();
        int subStrNum = subStr.length();
        int count = 0;
        int index = 0;
        if (strNum >= subStrNum) {
//            方式一：
            /*while ((index = str.indexOf(subStr)) != -1) {
                count++;
                str = str.substring(index + subStr.length());
            }*/
//            方式二：对方式一改进
            while ((index = str.indexOf(subStr,index)) != -1) {
              count++;
              index += subStrNum;
            }
            return count;
        } else {
            return count;
        }


    }
}
