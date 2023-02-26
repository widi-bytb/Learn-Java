package com.atguigu.java;

/*
 * 使用enum关键字来定义枚举类
 * 说明：定义的枚举类默认继承于java.lang.Enum类
 *
 *
 * */
public class SeasonTest1 {
    public static void main(String[] args) {

        Season1 spring = Season1.SPRING;
        System.out.println(spring);
        System.out.println(Season1.class.getSuperclass());

        Season1[] values = Season1.values();
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);

        }
        System.out.println("*******************************");
        System.out.println(Season1.valueOf("SPRING"));
        spring.show();
    }
}

interface Info {
    void show();
}


enum Season1 implements Info {
    //    1.提供枚举类的对象，多个对象之间用“,”隔开，末尾对象“;”结束
    SPRING("春天", "春暖花开") {
        @Override
        public void show() {
            System.out.println("这是一个春天");
        }
    },
    SUMMER("夏天", "夏日炎炎"),
    AUTUMN("秋天", "秋高气爽"),
    WINIER("冬天", "冰天雪地");

    private final String SeasonName;
    private final String SeasonDesc;

    private Season1(String SeasonName, String SeasonDesc) {
        this.SeasonName = SeasonName;
        this.SeasonDesc = SeasonDesc;
    }

    public String getSeasonName() {
        return SeasonName;
    }

    public String getSeasonDesc() {
        return SeasonDesc;
    }

    @Override
    public String toString() {
        return "Season1{" +
                "SeasonName='" + SeasonName + '\'' +
                ", SeasonDesc='" + SeasonDesc + '\'' +
                '}';
    }

    @Override
    public void show() {
        System.out.println("这是一个季节");
    }
}
