package com.javapractice.thirdday;
//【程序27】
//题目：编写一个函数，输入n为偶数时，调用函数求1/2+1/4+…+1/n,当输入n为奇数时，调用函数1/1+1/3+…+1/n(利用指针函数)
//程序分析：
//1、先判断是奇数还是偶数
//2、分数分子都是一，偶数分母从2开始，奇数的分母从1开始，分母差值都为2`
import java.util.Scanner;
public class Test27 {
    public static void main(String[] args){
        double sum = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int input = scanner.nextInt();
        if(input%2 == 0){
            for(double i = 2 ; i <= input; i = i + 2){
                sum = sum +  1/i;
                if(i== input){
                    System.out.print("1/" +(int)i);
                    break;
                }
                System.out.print("1/" +(int)i + "+");
            }
        }else{
            for(double i = 1 ; i <= input; i =+ 2){
                sum = sum + 1/i;
                if(i== input){
                    System.out.print("1/" +(int)i);
                    break;
                }
                System.out.print("1/" +(int)i + "+");

            }
        }
        System.out.println("=" + sum);

    }
}
