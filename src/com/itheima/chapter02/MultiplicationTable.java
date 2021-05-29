package com.itheima.chapter02;

public class MultiplicationTable {
    public static void main(String[] args) {
        //外层循环，变量i控制在1~9行
        for (int i = 1; i <= 9 ; i++) {
            //内层循环，变量i控制在1~9行
            for (int j = 1; j <= i ; j++) {
                System.out.print( j +"*"+ i + "="+ j*i +"\t");
            }
            //外层换行
            System.out.println("");
        }
    }
}
