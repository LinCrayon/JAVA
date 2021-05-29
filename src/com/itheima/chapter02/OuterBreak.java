package com.itheima.chapter02;

public class OuterBreak {
    public static void main(String[] args) {
            //外层循环，变量i控制在1~9行
        outer :for (int i = 1; i <= 9 ; i++) {
            //内层循环，变量i控制在1~9行
            for (int j = 1; j <=i ; j++) {
                if (i >= 3){
                    // break outer跳出外层循环
                    break outer;
                }
                System.out.print( j +"*"+ i + "="+ j*i +"\t");
            }
            System.out.println("");
        }
    }
}
