package com.javapractice.thirdday;
//【程序26】
//题目：写一个函数，求一个字符串的长度，在main函数中输入字符串，并输出其长度。
import java.util.Scanner;
public class Test26 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("输入一个字符串：");
        String input = scanner.nextLine();		//nextLine是Enter结束;next是空格结束
        System.out.println("你输入的字符串为：" + input);
        System.out.print("字符串长度为："+input.length());
    }
}
