package com.itheima.chapter02;

public class Multiplication {
    //先打印第一列
    //把固定的1再用一个循环包起来
    //去掉重复项，i<=j，调整格式
    public static void main(String[] args) {
        for (int i = 1; i <= 9 ; i++) {
            for (int j = 1; j <= i ; j++) {
                System.out.print(j + "*" +i + "=" +j*i +"\t");
            }
            System.out.println();
        }
    }
}
