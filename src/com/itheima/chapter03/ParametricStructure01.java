package com.itheima.chapter03;

//有参构造
class Person04 {
    int age;

    public Person04(int a) {
        age = a;
    }
    //定义speak ()方法
    public void speak(){
        System.out.println("我今年" + age + "岁");
    }
}
public class ParametricStructure01 {
    public static void main(String[] args) {
        Person04 p = new Person04(18);
        p.speak();
    }
}
