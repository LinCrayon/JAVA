package com.javapractice.firstday;
//【程序15】
//题目：有一分数序列：2/1，3/2，5/3，8/5，13/8，21/13…求出这个数列的前20项之和。
//程序分析：请抓住分子与分母的变化规律。分数：
//   1、第一项是2/1
//   2、前面一项分子和分母相加的和，为下一项的分子
//   3、前面一项分子，为下一项的分母

public class Test15 {
    public static void main(String[] args){
        double m , n , s , t ,a;
        m = 2;
        n = 1;
        s = 0;
        for(int i = 1; i <= 20 ;i++){
            t = m/n;
            s = s + t;
            a = m + n;
            n = m ;
            m = a;
        }
        System.out.println(s);
    }
}
