package com.itheima.chapter04.Super03;

class Dog extends Animal{
    String name = "动物";
    void shout(){//重写父类方法
           super.shout();//调用父类的成员方法
    }
    void printName(){//打印name方法
        System.out.println("name="+super.name);//调用父类的成员变量
    }
}
