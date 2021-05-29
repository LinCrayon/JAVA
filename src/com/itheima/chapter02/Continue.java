package com.itheima.chapter02;

public class Continue {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) {       //if (i % 2 == 0)
                //continue是终止本次循环，执行下一次循环
                continue;
            }
            sum += i;
        }
        System.out.println("sum =" + sum);
    }
}
