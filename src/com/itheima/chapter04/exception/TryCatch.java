package com.itheima.chapter04.exception;
//异常捕获
// try{}
// catch(){}

//两数相除
public class TryCatch {
    public static int divide(int x, int y){
        try{
            int result = x / y;
            return result;
        }catch (Exception e){           //对异常进行捕获处理
            System.out.println("捕获的异常信息为：" +e.getMessage());
        }
        return -1;
    }
    public static void main(String[] args) {
        int result = divide(4 , 0);         //调用divide方法
        if(result == -1){                          //对调用的方法返回的结果进行判断
            System.out.println("程序发生异常");
        }else{
            System.out.println(result);
        }
    }
}
