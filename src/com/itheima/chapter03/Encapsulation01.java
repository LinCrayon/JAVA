package com.itheima.chapter03;

class  Person {
    String name;
    int age;
    public void speak(){
        System.out.println("我今年" + age + "岁");
    }
}
public class Encapsulation01 {
    public static void main(String[] args) {
        Person p = new Person();
        p.name = "张三";
        p.age = -18;
        p.speak();
    }

}
