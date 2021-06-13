package com.itheima.chapter03;

import java.util.Scanner;

public class hasNext {
    public static void main(String[] args) {
        //键盘输入
        Scanner scanner = new Scanner(System.in);
        System.out.println("请使用next方式接收：");

        //判断是否还有输入
        if (scanner.hasNext()) {        //  输入的字符串中有空格会停止,netx()不能得到带空格的字符串
            String str = scanner.next();
            System.out.println("输入的内容为:" + str);
        }
        scanner.close();//关闭I/O流
    }
}
