package com.javapractice.firstday;
import java.util.Scanner;
//【程序5】
//题目：利用条件运算符的嵌套来完成此题：学习成绩>=90分的同学用A表示，
// 60-89分之间的用B表示，60分以下的用C表示。
//程序分析：(a>b)?a:b这是条件运算符的基本例子。
public class Test05 {
    public static void main(String[] args) {
        System.out.print("请输入成绩：");
        Scanner scanner = new Scanner(System.in);  //快捷键Alt+Enter
       int n = scanner.nextInt();
        char c = 'A';
        if (n >= 90) {
            c = 'A';
        } else if(n >= 60){
            c = 'B';
        }else if (n <= 60){
            c = 'C';
        }
        System.out.println("成绩为" + n +",对应的等级为：" + c);
    }
}
