package com.itheima.chapter03;

class Person03{
    //类的构造方法
    public Person03(){
        System.out.println("调用了无参方法hh");
    }
}
public class ConstructionMethod01 {
    public static void main(String[] args) {
        Person03 p = new Person03();//实例化Person对象
    }
}
