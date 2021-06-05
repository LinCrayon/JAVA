package com.itheima.chapter03;

class Person10{
    static{
        System.out.println("执行了Peroson10类中的静态代码块");
    }
}
public class StaticBlockOfCode {
    static{
        System.out.println("执行了测试类中的静态代码块");
    }
    public static void main(String[] args) {
        //实例化两个Person10对象
        Person10 P1 =  new Person10();
        Person10 P2 =  new Person10();
    }
}
