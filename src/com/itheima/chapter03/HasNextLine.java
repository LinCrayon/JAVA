package com.itheima.chapter03;

import java.util.*;

public class HasNextLine {
    public static void main(String[] args) {
        //键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请使用nextLine方式接收：");

        //判断是否还有输入
        if (scanner.hasNextLine()) {        //  输入的字符串中有空格不会停止
            String str = scanner.nextLine();
            System.out.println("输入的内容为:" + str);
        }
        scanner.close();//关闭I/O流
    }
}
