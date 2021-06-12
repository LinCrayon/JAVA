package com.itheima.chapter04.innerclass.ststicinnerclass;
//静态内部类


//静态内部类中只能访问外部类的静态成员，通过外部类访问静态内部类成员时，可以跳过外部类直接通过内部类访问静态内部类成员
class Outer{
    static int m = 0;
    static class Inner{
        void show(){
            //静态内部类访问外部静态成员
            System.out.println("外部静态变量m="+m);
        }
    }
}
public class StaticInnerClass {
    public static void main(String[] args) {
        //静态内部类可以自己通过外部类创建
        Outer.Inner inner = new Outer.Inner();
        inner.show();
    }
}
