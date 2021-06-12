package com.itheima.chapter04.innerclass.localinnerclass01;

//局部内部类

//局部内部类中的方法有效范围只限方法内部
//局部内部类可以访问外部类的所以成员变量和方法

class Outer{
    int m = 0;
    void test1(){
        System.out.println("外部类成员方法");
    }
    void test2(){
        //1.定义局部内部类Inner,在内部类中访问外部类变量和方法
        class  Inner{
            int n =1;
            void show(){
                System.out.println("外部类变量m="+m);
                test1();
            }
        }
        //1.创建局部内部类的方法中，调用局部内部类变量和方法
        Inner inner = new Inner();
        System.out.println("局部内部类变量n="+inner.n);
        inner.show();
    }
}
public class LocalInnerClass01 {
    public static void main(String[] args) {
        Outer outer =new Outer();
        outer.test2();
    }
}
