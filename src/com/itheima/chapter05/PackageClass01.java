package com.itheima.chapter05;
//包装类，方便面对对象
//char ->  Character   ;  int -> Integer
public class PackageClass01 {
    public static void main(String[] args) {
        int a = 20;
        //自动装箱：把基本数据类型的变量a赋给Integer类型的变量b;
        Integer b = a;
        System.out.println(b);
        //自动拆箱：将Integer类型的变量b赋给基本类型的变量
        int c = b;
        System.out.println(c);
    }
}
