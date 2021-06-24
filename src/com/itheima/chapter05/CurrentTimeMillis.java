package com.itheima.chapter05;
//计算程序运行时间
public class CurrentTimeMillis {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int sum = 0 ;
        for (int i = 0; i < 100000000; i++) {
            sum =+ sum ;
        }
        long enndTieme =System.currentTimeMillis();
        System.out.println("程序运行时间为：" + (enndTieme - startTime ) + "毫秒" );
    }
}
