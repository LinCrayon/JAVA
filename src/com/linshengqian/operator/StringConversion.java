package com.linshengqian.operator;

public class StringConversion {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a += b;
        a -=b;
        //字符串连接符 + ，String
        System.out.println(""+ a + b);//拼接
        System.out.println(a + b + "");//加
    }
}
