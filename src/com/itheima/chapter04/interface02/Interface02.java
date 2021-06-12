package com.itheima.chapter04.interface02;

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
//定义了LandAnimal接口，并继承Animal接口
interface LandAnimal extends Animal{
    void run();         //定义抽象方法run()
}

//Dog类实现了LandAnimal接口
class Dog implements LandAnimal{
    //实现breathe()方法
    public void breathe(){
        System.out.println("dog在呼吸");
    }
    public void run(){              //实现run()方法
        System.out.println("狗在跑");
    }
}
public class Interface02 {
    public static void main(String[] args) {
        System.out.println(Animal.getID());     //通过接口名调用类方法
        Dog dog = new Dog();
        System.out.println(dog.ID);             //在实现类中获取接口全局变量
        dog.breathe();
        dog.getType("禽类");//通过接口实现类Dog的实例化对象,调用接口默认方法
        dog.run();
    }
}