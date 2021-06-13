package com.itheima.chapter04.exception;
//自定义异常
//自定义的异常类必须继承自Exception或子类

//自定义DivideByMinusException异常继承Exception
public class  DivideByMinusException extends Exception {
    public DivideByMinusException(){
        super();            //调用Excepion无参的构造方法
    }
    public DivideByMinusException (String message){
        super(message);     //调用Excepion有参的构造方法
    }
}
