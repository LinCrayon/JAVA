package com.itheima.chapter04.exception;
//finally可以使无论程序是否发生异常都要执行

//两数相除
public class TryCatchFinally {
    public static int divide(int x, int y){
        try{
            int result = x / y;
            return result;              //将结果返回
        }catch (Exception e){           //对异常进行捕获处理
            System.out.println("捕获的异常信息为：" +e.getMessage());
        }finally {
            System.out.println("执行finally代码块，无论程序是否异常，都会执行");
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
//注意：当finally{}代码块中执行System.exit(0)语句时任何代码都不能执行，
// 因为System.exit(0)是退出当前Java虚拟机，Java虚拟机停止了