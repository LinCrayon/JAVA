package com.itheima.chapter04.super01;

class Dog extends Animal{
    String name = "狗类";
    void shout(){
        super.shout();//访问父类的成员方法
    }
    void printName(){
        System.out.println("name="+ super.name);//访问父类的成员方法
    }
}
