package com.itheima.chapter02;
//阶乘
/*
    1!  1
    2!  2*1

    2!   2 * f(1)
    3!   3 * f(2)

 */
public class Factorial {
    public static void main(String[] args) {
        f(5);
    }

    public static int f(int n){
        if (n == 1){
            return  1;
        }else {
            return n*f(n-1);
        }
    }
}
