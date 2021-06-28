package com.javapractice.thirdday;
//【程序29】
//题目：一个偶数总能表示为两个素数之和。
//程序分析：判断两个加数是不是素数
import java.util.*;
public class Test29 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n  = sc.nextInt();
        while(n % 2 != 0 ){
            System.out.println("不是偶数，重新输入");
            n = sc.nextInt();
        }
        for(int i = 2 ; i < n ; i++){
            if(ss(i) && ss(n - 1)){
                System.out.println(n + "=" + i + (n - 1) );
            }
        }
    }
    private static boolean ss(int n){
        for (int i = 2; i < n; i++)
            if( n % i == 0) return false;
        return true;
    }
}
