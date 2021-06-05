package com.itheima.chapter03;

class  Student0{
    private String name;
    private double grade;
    public Student0(){
    }
    public Student0(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public double getGrade(){
        return grade;
    }
    public void setGrade(double grade){
        this.grade = grade;
    }
}
public class Exervice01 {
    public static void main(String[] args) {
        Student0 stu1 = new Student0();
        stu1.setName("张三");
        stu1.setGrade(99);
        Student0 stu2 = new Student0("lin",100);
        }
    }

