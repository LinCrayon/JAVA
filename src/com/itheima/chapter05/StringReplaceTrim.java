package com.itheima.chapter05;
//字符串去除空格
public class StringReplaceTrim {
    public static void main(String[] args) {
        String s = "          https: // localhost  : 8080      ";
        System.out.println("去除字符串两端空格的结果：" + s.trim());
        System.out.println("去除字符串中所有空格的结果：" + s.replace(" ",""));
    }
}
