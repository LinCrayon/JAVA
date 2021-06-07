package com.itheima.chapter04.rewrite02;

public class rewrite02 {
    public static void main(String[] args) {
        Dog dog = new Dog();
    }
}
//使用super关键字调用父类的构造方法
//super只能出现一次且要位于子类构造方法的第一行
//在实例化对象时，会默认调用父类无参构造方法