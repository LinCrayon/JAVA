package com.itheima.chapter04.interface01;

//接口是一种特殊的抽象类，接口中除了抽象方法外还有默认方法和静态方法（类方法）。接口和接口可以继承关系，静态方法可以通过接口名.方法名调用
//声明类的关键字是class,声明接口的关键字是interface。实现的关键字是implements.
//[修饰符] class 类名 [extends 父类名] [implements 接口1,接口2,...]{}

//定义接口
interface Animal{
    int ID = 1;                 //定义全局变量
    void breathe();             //定义抽象方法breathe（）
    //定义一个默认方法
    default void getType(String type){
        System.out.println("动物属于"+type);
    }
    //定义一个静态方法
    static int getID(){
        return Animal.ID;
    }
}
//Dog类实现了Aminal接口
class Dog implements Animal{
    //实现breathe()方法
    public void breathe(){
        System.out.println("dog在呼吸");
    }
}
public class Interface01 {
    public static void main(String[] args) {
        System.out.println(Animal.getID());     //通过接口名调用类方法
        Dog dog = new Dog();
        System.out.println(dog.ID);             //在实现类中获取接口全局变量
        dog.breathe();
        dog.getType("禽类");                     //通过接口实现类Dog的实例化对象,调用接口默认方法
    }
}
