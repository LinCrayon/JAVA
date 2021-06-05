package com.itheima.chapter03;

//构造方法的重载
class Person06{
        String name;
        int age;
    public Person06(int a){
            age = a;
    }
    public Person06(String n,int a){
        name = n;
        age =  a;
    }
    //定义speak()方法
    public void speak(){
        System.out.println("我今年"+age+"岁了");
    }
    //定义say()方法
    public void say(){
        System.out.println("我叫"+name+",我今年"+age+"岁了");
    }
}
public class HeavyLoad01 {
    public static void main(String[] args) {
        Person06 P1 = new Person06(18);
        Person06 P2 = new Person06("张三",32);
        P1.speak();

    }
}
