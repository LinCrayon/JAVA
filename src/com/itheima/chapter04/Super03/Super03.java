package com.itheima.chapter04.Super03;

public class Super03 {
    public static void main(String[] args) {
        Dog dog = new Dog();//创建dog对象
        dog.shout();//调用dog对象重写shout()方法
        dog.printName();//调用dog对象的printName()方法
    }
}


//使用super关键字调用父类的成员变量和成员方法