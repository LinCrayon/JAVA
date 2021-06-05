package com.itheima.chapter04.super02;

class Dog extends Animal{
    public Dog(){
        //super调用父类构造方法时代码必须位于子类构造方法的第一行，并且只能出现一次
        super("哈哈哈");
    }
}
