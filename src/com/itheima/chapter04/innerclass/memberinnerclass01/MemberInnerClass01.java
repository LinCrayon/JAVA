package com.itheima.chapter04.innerclass.memberinnerclass01;

//内部类有四种
//        1. 成员内部类
//        2. 静态内部类
//        3. 局部内部类
//        4. 匿名内部类

//成员内部类，成员内部类中不能写静态属性和方法

//定义一个外部类Outer
class Outer{
    int m = 0;  //定义外部类的成员变量
    void test1(){
        System.out.println("外部类成员变量");
    }
    //定义成员内部类Inner
    class Inner{
        int n = 1;
        //1.定义内部类方法,访问外部类成员变量和方法
        void show1(){
            System.out.println("外部类成员变量m="+m);
            test1();
        }
        void show2(){
            System.out.println("内部类成员方法");
        }
    }
        //2. 定义外部类方法,访问外部类成员变量和方法
        void test2(){
        Inner inner = new Inner();
            System.out.println("内部类成员变量n="+inner.n);
            inner.show2();
        }
}
//定义测试类
public class MemberInnerClass01 {
    public static void main(String[] args) {
        Outer outer = new Outer();              //创建外部类对象
        Outer.Inner inner = outer.new Inner();     //创建内部类对象,通过外部类创建内部类
        inner.show1();                              //测试在成员内部类中访问外部类成员变量和方法
        outer.test2();                     //测试在外部类中访问内部类成员变量和方法
    }
}
