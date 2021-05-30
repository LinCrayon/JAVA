package com.itheima.chapter03;
class Animal{
    String name;
    void shout(){
            System.out.println("哈哈哈哈");
        }
}
class Dog extends Animal{
    public  void printName(){
        System.out.println("name =" + name);
    }
}
public class ClassInherit {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "花皮狗";
        dog.printName();
        dog.shout();
    }
}
