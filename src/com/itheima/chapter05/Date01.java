package com.itheima.chapter05;
import java.util.*;
public class Date01 {
    public static void main(String[] args) {
        Date date1 = new Date();
        //获取当前时间后一秒的时间
        Date date2 =new Date(System.currentTimeMillis() + 1000);
        System.out.println(date1);
        System.out.println(date2);
    }
}
