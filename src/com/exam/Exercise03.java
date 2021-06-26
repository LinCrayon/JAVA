package com.exam;
//按照以下要求设计一个学生类 Student,并进行测试。要求如下:
//(1)Student 类中包含姓名、成绩两个属性。
//(2)分别给这两个属性定义两个方法,一个方法用于设置值,另一个方法用于获取值、
//(3) Student 类中定义一个无参的构造方法和一个接收两个参数的构造方法,两个参数
//分别为姓名和成绩属性赋值。
//(4)在测试类中创建两个 Student 对象,一个使用无参的构造方法,然后调用方法给长
//名和成绩赋值,另一个使用有参的构造方法,在构造方法中给姓名和成绩赋值
class Student {
    private String name;
    private double grade;
    public Student() {
    }
    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGrade() {
        return grade;
    }
    public void setGrade(double grade) {
        this.grade = grade;
    }
}
public class Exercise03 {
    public static void main(String[] args) {
        Student stu1 = new Student();
        stu1.setName("zhangsan");
        stu1.setGrade(99);
        Student stu2 = new Student("lisi", 100);
    }
}
