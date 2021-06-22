package com.javapractice.firstday;
//【程序11】
//题目：输入某年某月某日，判断这一天是这一年的第几天？
//程序分析：以3月5日为例，应该先把前两个月的加起来，然后再加上5天即本年的第几天，
//特殊情况，闰年且输入月份大于3时需考虑多加一天。
//闰年的条件：year除以400能整除，或者year除以4能整除，但是不能是100的倍数

import java.util.*;
public class Test11 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int year,month,day,n;
        System.out.println("请输入年：");
        year = sc.nextInt();
        System.out.println("请输入月：");
        month = sc.nextInt();
        System.out.println("请输入日：");
        day = sc.nextInt();
        n=day;
        int [] m = {31,28,30,31,30,31,31,30,31,30,31};
        for(int i = 0;i <month-1;i++){
            n = n +m[i];
            if(i == 1){
                if((year%4 == 0 && year%100 != 0) || year %400==0)
                    n=n+1;
            }

        }
        System.out.println(year+ "年"+month+ "月"+day+"日是这年第"+ n + "天");
    }
}
