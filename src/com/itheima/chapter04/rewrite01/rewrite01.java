package com.itheima.chapter04.rewrite01;

public class rewrite01 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.shout();
    }
}
//子类重写父类方法，不能使用比父类中重写的方法更严格的访问权限