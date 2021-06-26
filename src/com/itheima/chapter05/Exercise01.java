package com.itheima.chapter05;
//倒叙输出Hello World
import java.lang.*;
public class Exercise01 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        // 字符串转成char数组
        char[] ch = str.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                buffer.append(String.valueOf(ch[i]).toLowerCase());
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                buffer.append(String.valueOf(ch[i]).toUpperCase());
            }
        }
        System.out.println(buffer.toString());
    }
}
