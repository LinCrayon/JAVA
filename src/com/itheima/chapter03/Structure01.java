package com.itheima.chapter03;

//有参构造
class Person05 {
    int age;

    public Person05(int a) {
        age = a;
    }
    //定义speak（）方法
    public void speak(){
        System.out.println("我今年"+age+"岁了");
    }
}

public class Structure01 {
    public static void main(String[] args) {
        Person05 p = new Person05(18);//实例化Person05对象
        p.speak();

    }
}
