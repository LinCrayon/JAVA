package com.itheima.chapter03;

class Student{
    static String schoolName;       //声明静态变量
}
public class Static01 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        Student stu2 = new Student();
        Student.schoolName = "福建商学院";       //为静态变量赋值

        System.out.println("我是"+ stu1.schoolName + "的学生");
        System.out.println("我是"+ stu2.schoolName + "的学生");
    }
}
//static关键字只能修饰成员变量，不能修饰局部变量