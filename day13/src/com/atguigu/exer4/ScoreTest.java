package com.atguigu.exer4;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Vector v = new Vector();

        int maxScore = 0;

        for (; ; ) {
            System.out.println("请输入学生成绩（以负数代表输入结束）");
            int score = scanner.nextInt();
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("数据非法");
                continue;
            }
//            Integer inScore = new Integer(score);

            v.addElement(score);

            if (maxScore < score) {
                maxScore = score;
            }
        }

//        for (int i = 0; i < v.size(); i++) {
//            Object obj = v.elementAt(i);
//        }

    }
}
