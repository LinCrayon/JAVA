package com.itheima.chapter01;

public class Count {
    public static void main(String[] args) {
        int a = 7 % 5;//只与等号左边符号有关 2
        int b = -7 % 5;//只与等号左边符号有关 -2
        int c = 7 % -5;//只与等号左边符号有关 -2
        System.out.println("a = " +a);
        System.out.println("b = " +b);
        System.out.println("c = " +c);
    }
}
