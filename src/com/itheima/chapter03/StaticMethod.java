package com.itheima.chapter03;

class Person09{
    public static void say(){
        System.out.println("Hello");
    }
}
public class StaticMethod {
    public static void main(String[] args) {
         //类名.方法的方式调用静态方法
        Person09.say();
        Person09  person09 = new Person09();
        //实例对象名.方法的方式调用静态方法
        person09.say();
    }
}
