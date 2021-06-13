package com.itheima.chapter04.exception;
//throws抛出异常

public class Throws {
//实现两整数数相除，并使用throws关键字声明抛出异常
    public static int divide(int x , int y) throws Exception{
        int result = x / y;
        return result;
    }
    public static void main(String[] args) {
        try{
           int result = divide(4,0);    //调用divide()方法
            System.out.println(result);
        }catch (Exception e){               //对捕获的异常进行处理
            System.out.println("捕获的异常信息为：" + e.getMessage() );
        }
    }
}