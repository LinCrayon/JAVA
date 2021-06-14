package com.itheima.chapter05;

public class String01 {
    public static void main(String[] args) {
        //创建一个空字符串
        String str1 = new String();

        String str2 = new String("abc");

        //创建一个内容为字符数组的字符串
        char[] charArray = new char[]{'A','B','C'};
        String str3 = new String(charArray);

        System.out.println("a" + str1 + "b");
        System.out.println(str2);
        System.out.println(str3);
    }
}
