package com.exam;
//类的封装
class Persion00{
    String name;
    int age;
    public void spack(){
        System.out.println("我叫" + name + ",今年" + age + "岁了");
    }
}
public class

EncapsulationFengZhuang03 {
    public static void main(String[] args) {
        Persion00  p = new Persion00();
        p.name = "张三";
        p.age = -18;
        p.spack();
    }
}
