package com.javapractice.firstday;

//【程序5】
//题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
// 60-89分之间的用B表示，60分以下的用C表示。
//程序分析：(a>b)?a:b这是条件运算符的基本例子。
import java.util.Scanner;

public class Test05 {
    public static void main(String[] args) {
        System.out.println("请输入成绩：");
        Scanner sc = new Scanner(System.in);
       int n = sc.nextInt();
        char c;
        if (n >= 90) {
            c = 'A';
        } else if(n >= 60){
            c = 'B';
        }else{
            c = 'C';
        }
        System.out.println("成绩为" + n +",对应的等级为：" + c);
    }
}
