package com.itheima.chapter02;

public class Break {
    public static void main(String[] args) {
        int x= 1;
        while (x <= 4){
            System.out.println("x= " + x);
            if(x == 3){
                //break跳出当前循环
                break;
            }
            x++;
        }
    }
}
