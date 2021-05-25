package com.linshengqian.base;

public class CastDemo05 {
    public static void main(String[] args) {
        //强制转换
        //不同类型的数据先转化为同一类型，然后进行运算。
        //  byte,short,char—> int —> long—> float —> double
        //不能对boolean类型进行类型转换
        //转换过程中可能导致溢出或损失精度，

        System.out.println((int)23.7);//23
        System.out.println((int)-45.6);//-45
        System.out.println((int)-45.89f);//-45

        System.out.println("=====================");
        char c = 'a';
        int d = c + 1;
        System.out.println(d);
        System.out.println((char)d );

    }
}
