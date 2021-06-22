package com.javapractice.firstday;
//【程序18】
//题目：给一个不多于5位的正整数，要求：一、求它是几位数，二、逆序打印出各位数字。
//程序分析：创建一个五位数数的数组，把输入数字的每位数的值赋值到数组里面
//* 把输入数字从个位起获取，并且每获取一次之后/10，这样就能分别获取十位百位千位了
//* 把数字打印出来就是题目所求了
import java.util.Scanner;
public class Test18 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int  n = scanner.nextInt();
        int  x = 0 , m;
        int[] arr = new int[5];
        while( n != 0){
            m = n % 10;
            arr[x] = m;
            n = n/10;
            x++;
        }
        System.out.println("您输入的数是" + x + "位数。" );
        System.out.print("逆序输出为：");
        for(int i = 0 ; i < x ;i++){
            System.out.print(arr[i]);
        }
    }
}
