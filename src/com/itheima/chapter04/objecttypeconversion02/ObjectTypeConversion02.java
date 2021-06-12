package com.itheima.chapter04.objecttypeconversion02;

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
class Dog implements Animal{
    public void shout(){
        System.out.println("汪汪");
    }
}
public class ObjectTypeConversion02 {
    public static void main(String[] args) {
        //Animal an1 = new Dog();  错 Dog类型不能转成Cat类型
        Animal an1 = new Cat();//向下类型转换时,必须转换为本质类型
        Cat cat = (Cat) an1;
        cat.shout();
        cat.catchMouse();
    }
}
