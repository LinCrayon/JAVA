package com.itheima.chapter04.abstractclass01;
//定义抽象类
//[修饰符] abstract class 类名{
//      定义抽象方法
//      [修饰符] abstract 方法返回值类型 方法名（{参数列表}）
//      其他方法和属性
//      }
abstract class Animal{
    public abstract void shout();
}
class Dog extends Animal{
    public void shout(){
        System.out.println("汪汪汪");
    }
}
public class Abstract01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();        //调用dog对象的shout方法
    }
}
