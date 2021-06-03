package com.itheima.chapter03;

//方法的重载是定义多个名称相同，但是参数类型或者个数不同的方法叫重载
public class Overload02 {
    //两数相加
    public static int add(int x, int y) {
        return x + y;
    }
    //三数相加
    public static int add(int x, int y, int z) {
        return x + y + z;
    }
    public static double add(double x , double y) {
        return x + y;
    }
    public static void main(String[] args){
        int sum1 = add(1,2);
        int sum2 = add(2,4,7);
        double sum3 = add(2.2,5.3);
        System.out.println("sum1 =" + sum1);
        System.out.println("sum2 =" + sum2);
        System.out.println("sum3 =" + sum3);

    }
}