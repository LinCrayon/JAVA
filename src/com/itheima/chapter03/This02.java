package com.itheima.chapter03;

class Person08 {
    public Person08(){
        System.out.println("无参的构造方法被调用了");
    }
    public Person08(int age){
        this();         // this();必须是第一条执行语句
        System.out.println("有参的构造方法被调用了");
    }
}
public class This02 {
    public static void main(String[] args) {
        Person08 p = new Person08(18);//实例化Person对象
    }
}
//不能在一个类中两个构造方法中使用this方法互相调用
//访问构造器语法：this(参数列表); 注意只能在构造器中使用(即只能在构造器中访问另外一个构造器, 必须放在第一
//条语句).
//this 不能在类定义的外部使用，只能在类定义的方法中使用