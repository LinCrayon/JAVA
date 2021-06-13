package com.itheima.chapter04.exception;
//throw抛出异常用在方法体内，只能抛出一个异常
//throws抛出异常用在方法声明中，可以抛出多个异常
//throw关键字抛出异常后还要使用throws或try...catch对异常处理
//如果throw抛出的是Error、RuntimeException或他们的子类则无需使用throws或try...catch对异常处理

public class Throw {
    //定义printAge()输出年龄
    public static void printAge(int age) throws Exception{
        if(age <= 0){
            throw new Exception("输入的年龄有误，必须是正整数！");
        }else {
            System.out.println("年龄为" + age);
        }
    }
    public static void main(String[] args) {
        int age = -1;
        try{
            printAge(age);
        }catch (Exception e){
            System.out.println("捕获的异常信息为：" + e.getMessage());
        }
    }
}
