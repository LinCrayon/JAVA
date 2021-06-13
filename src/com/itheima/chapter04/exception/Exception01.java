package com.itheima.chapter04.exception;
//两整数数相除

public class Exception01 {
public static int divide(int x , int y){
    int result = x / y;
    return result;
    }
    public static void main(String[] args){
        int result = divide(4,2);
        System.out.println(result);
    }
}


// try 、 catch 、 finally 、 throw 、 throws
//try -- 用于监听。将要被监听的代码(可能抛出异常的代码)放在try语句块之内，当try语句块内发生异常时，异常就被抛出。
//catch -- 用于捕获异常。catch用来捕获try语句块中发生的异常。
 /*
 finally -- finally语句块总是会被执行。它主要用于回收在try块里打开的物力资源(如数据库连接、网络
 连接和磁盘文件)。只有finally块，执行完成之后，才会回来执行try或者catch块中的return或者throw语
 句，如果finally中使用了return或者throw等终止方法的语句，则就不会跳回执行，直接停止。
 */
//shrow -- 用于抛出异常。
//throws -- 用在方法签名中，用于声明该方法可能抛出的异常。