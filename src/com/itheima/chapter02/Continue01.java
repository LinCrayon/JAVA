package com.itheima.chapter02;

public class Continue01 {
    public static void main(String[] args) {
        //计算奇偶数和
        int sum = 0;
        for (int i = 1; i <= 100 ; i++) {
            if (i % 2  == 0){
                continue;
            }
            sum += i;
        }
        System.out.println("sum = " +sum);
    }
}
                    //break 会跳出当前循环
                   //continue是终止本次循环，执行下次循环