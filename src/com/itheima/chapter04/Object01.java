package com.itheima.chapter04;

class Animal00{
    void shout(){
        System.out.println("动物叫");
    }
}
public class Object01 {
    public static void main(String[] args) {
        Animal00 animal00 = new Animal00();
        System.out.println(animal00.toString());
    }
}
