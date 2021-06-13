package com.itheima.chapter04.exception;

public class DivideByMinusExceptionExercice {
    //两整数相除
    public static int divide(int x,int y ) throws DivideByMinusException{
        if ( y == 0){
            //使用throw关键字声明异常对象
            throw new DivideByMinusException("除数是0");
        }
        int result = x / y;
        return  result;
    }
    public static void main(String[] args){
        try{
            int result =divide(4 , 0);
            System.out.println(result);
        }catch (DivideByMinusException e){
            System.out.println("捕获的异常信息为：" + e.getMessage());
        }
    }
}
