package com.atguigu.java1;

/*
 *注解的使用
 *
 * 1.理解Annotation：
 *     jdk5.0新增的功能
 *
 *     Annotation其实就是代码里的特殊标记，这些标记可以在编译，类加载，运行时被读取，并执行相应的处理。
 * 通过使用Annotation，程序员可以在不改变原有逻辑的情况下，在源文件中嵌入一些补充信息。
 *
 *     在JavaSE中，注解的使用目的比较简单，例如标记过时的功能，忽略警告等。在JavaEE/Android
 * 中注解占据了更重要的角色，例如用来配置应用程序的任何切面，代替JavaEE旧版中所遗留的繁代码和XML配置等。
 *
 * 2.Annotation的使用示例
 * 示例一：生成文档相关的注解
 * 示例二：在编译时进行格式检查（JDK内置的三个基本注解）
 * 示例三：跟踪代码依赖性，实现替代配置文件功能
 *
 *
 * 3.任何自定义注解
 *  注解声明为： @interface
 *  内部定义成员，通常使用value表示
 *  可以指定成员的默认值，使用default定义
 *  如果自定义注解没有成员，表明是一个标识作用
 *
 * 如果注解有成员，在使用注解时，需要指明成员的值。
 * 自定义注解必须配上注解的信息处理流程（使用反射）才有意义
 * 自定义注解通常都会指明两个元注解：Retention，Target
 * 4.jdk 提供的四种元注解
 *   元注解：对现有的注解进行解释说明的注解
 *   Retention:指定所修饰的Annotation的生命周期：SOURCE\CLASS(默认行为)\RUNTIME，
 *           只有声明为RUNTIME生命周期的注解，才能通过反射获取
 *
 *   Target:用于指定被修饰的Annotation能用于修饰哪些程序元素
 * ****************** 出现的频率较低**********************
 *   Documented：表示所修饰的注解在被javadoc解析时，保留下来。
 *   Inherited：被它修饰的Annotation将具有继承性。
 *
 * 5.通过反射获取注解信息
 *
 * 6.jdk 8 中注解的新特性：可重复注解，类型注解
 *
 * 6.1 可重复注解
 * */
public class AnnotationTest {
    @MyAnnotation(value = "hello")
    public static void main(String[] args) {

    }
}
