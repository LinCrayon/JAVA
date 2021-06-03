package com.itheima.chapter02;

public class Break01 {
    public static void main(String[] args) {
        int x = 1;
        while (x <= 10){
            System.out.println("x = " + x );
            if(x == 3){
                break;          //break 会跳出当前循环
            }                   //continue是终止本次循环，执行下次循环
            x++;
        }
    }
                //    x = 1
                //    x = 2
                //    x = 3

}
