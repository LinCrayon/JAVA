package com.itheima.chapter04.polymorphism01;

//多态是不同类大对象在调用同一个方法时所呈现的多种不同的行为

abstract class Animal{
    abstract void shout();          //定义shout()抽象方法
}
class Cat extends Animal {
    public void shout() {
        System.out.println("喵喵");
    }
}
class Dog  extends  Animal {
    public void shout() {
        System.out.println("汪汪");
    }
}
public class Polymorphism01 {
    public static void main(String[] args) {
        Animal an1 = new Cat();
        Animal an2 = new Dog();
        an1.shout();
        an2.shout();
    }
}
