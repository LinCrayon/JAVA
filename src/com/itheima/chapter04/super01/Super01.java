package com.itheima.chapter04.super01;

public class Super01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();//调用dog对象重写shout()方法
        dog.printName();//调用dog对象的printName()方法
    }
}
