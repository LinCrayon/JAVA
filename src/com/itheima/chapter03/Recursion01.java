package com.itheima.chapter03;

//方法递归是一个方法在内部内部调用自身的过程，递归必须要结束条件，不然会死循环
public class Recursion01 {
    public static int getSum(int n){
        if(n == 1){
            return 1;
        }
        int temp = getSum(n-1);
        return  temp + n;
    }

    public static void main(String[] args) {
        int sum = getSum(4);
        System.out.println("sum = " + sum);
    }

}
