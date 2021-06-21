package com.javapractice.firstday;

//【程序6】
//题目：输入两个正整数m和n，求其最大公约数和最小公倍数。
//程序分析：利用辗除法。
//这里有一个知识点要记住的，最大公约数和最小公倍数的求法：
//1、先求最大公约数bigDivisor
//2、就可以很方便获得最小公倍数multiple=input1*input2/bigDIvisor
//这里最重要的就是求最大公约数，求法如下：
//(1)用大的数对小的数求余
//(2)把小的数赋值给大的数，把求余获得的结果赋值给小的数，
//(3)循环上一步的操作，直到求余的结果为零
//(4)上一步被求余的数就是我们要的最大公约数，不信的话，你可以动手试试
import java.util.Scanner;
public class Test06 {
    public static void main(String[] args) {
        int m , n ,zdgys , zdgbs;
        System.out.print("请输入第一个数：");
        Scanner sc = new Scanner(System.in);
        m = sc.nextInt();
        System.out.print("请输入第二个数：");
        n = sc.nextInt();
        zdgys = GYS(m,n);
        zdgbs = m*n/zdgys;
        System.out.print("最大公约数为：" + zdgys + ",最小公倍数："+ zdgbs);
    }
    private static int GYS(int m , int n){
        int r;
        r = m%n;
        while(r != 0){
            m = n;
            n = r ;
            r = m%n;
        }
        return n;
    }
}
