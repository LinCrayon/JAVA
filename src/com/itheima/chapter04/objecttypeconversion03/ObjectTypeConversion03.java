package com.itheima.chapter04.objecttypeconversion03;

//向下类型转换时,如果不是转换为本质类型会有异常情况.
//Java有一个关键字instanceof判断一个对象是否为某个类或接口的实例或子类实例

interface Animal{
    void shout();
}
class Cat implements Animal {
    public  void shout(){
        System.out.println("喵喵喵");
    }
    public void catchMouse(){
        System.out.println("猫抓鼠");
    }
}
class Dog implements Animal {
    public void shout(){
        System.out.println("汪汪");
    }
}
public class ObjectTypeConversion03 {
    public static void main(String[] args) {
        Animal an1 = new Dog();
        if(an1 instanceof Cat){     //判断an1本质类型 ；instanceof（实例）
            Cat cat = (Cat) an1;
            cat.shout();
            cat.catchMouse();
        }else {
            System.out.println("该类型的对象不是Cat类型");
        }
    }
}
