package com.itheima.chapter01;

public class Cast04 {
    public static void main(String[] args) {
        short s = 3;
        int i = 5;
        s += i;             //进行赋值运算时会自动强制转换
        System.out.println("s =" + s);
    }
}