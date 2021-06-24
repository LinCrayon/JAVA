package com.javapractice.secondday;
//【程序16】
//题目：求1+2!+3!+…+20!的和
//程序分析：此程序只是把累加变成了累乘。
//1、先求该项阶乘的值
//2、累加求求

public class Test16 {
    public static void main(String[] args){
        int  t , i , j ;
        long s = 0;
        for(i = 1; i <= 20 ;i++){
            t = 1;
            for(j = 1 ; j <= i; j++){
                t = t * i;
            }
            s = s + t;
        }
        System.out.println(s);
    }
}
