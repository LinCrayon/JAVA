package com.linshengqian.base;

public class SelfIncreaseOrDecrease {
    public static void main(String[] args) {
        int a = 3;//a    a = a + 1
        int b = a++;//执行完后,b=3。先给b赋值，再自增。
        int c = ++a; //执行完后,c=5。先自增,再给b赋值
        System.out.println(a);
        System.out.println(a);
        System.out.println(b);
        System.out.println(b);
        System.out.println(c);
        System.out.println(c);

        //幂运算2^3        2*2*2 =8
        double pow = Math.pow(2,3);
        System.out.println(pow);
    }
}
