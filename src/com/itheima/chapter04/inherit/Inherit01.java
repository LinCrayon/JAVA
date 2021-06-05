package com.itheima.chapter04.inherit;

//继承
class Animal{
    //定义动物叫方法
    void shout(){
        System.out.println("动物叫");
    }
}
//定义Dog继承Aniaml
class Dog extends  Animal {
    void shout() {
        System.out.println("汪汪。。。");
    }
}
    public class Inherit01 {
        public static void main(String[] args) {
            Dog dog = new Dog();//创建Dog类实例对象
            dog.shout();//调用Dog类重写shout()方法
        }
    }
