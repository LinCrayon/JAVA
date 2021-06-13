package com.itheima.chapter04.methodconstructor.staticclass;
//1.类名引用静态方法

//定义一个函数式接口
@FunctionalInterface
interface Calcable{
    int calc(int num);
}
//定义一个类，在类中定义一个静态方法
class Math{
    public static int abs(int num){
        if (num < 0){
            return -num;
        }else {
            return num;
        }
    }
}
//测试类
public class StaticClass {
    private static void printAbs(int num,Calcable calcable){
        System.out.println(calcable.calc(num));
    }
    public static void main(String[] args) {
        //使用Lambda 表达式方式
        printAbs(-10 ,n->Math.abs(n));
        //使用方法引用的方式
        printAbs(-10,Math::abs);
    }
}
