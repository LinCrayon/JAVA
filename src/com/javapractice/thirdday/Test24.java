package com.javapractice.thirdday;

//【程序24】
//题目：输入数组，最大的与第一个元素交换，最小的与最后一个元素交换，输出数组。
//程序分析：1、找到该数组的最大值和最小值
//* 找到该数组最大项把它和第一位交换，
//* 找到该数值的最小项把它和最后一项交换
//* 这里有一点值得注意：不能把最大值和最小值先找出来，再连续执行两次操作交换，会出错！
import java.awt.*;
import java.util.Scanner;
public class  Test24 {
    public static void main(String[] args){
        int [] a=new int [50];
        int max,min,t;
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入10个数:");
        for(i=0;i<10;i++)
            a[i]=sc.nextInt();
        max=0;
        for(i=1;i<10;i++){
            if(a[i]>a[max])
                max=i;
        }
        t=a[0]; a[0]=a[max]; a[max]=t;
        min=0;
        for(i=1;i<10;i++){
            if(a[i]<a[min])
                min=i;
        }
        t=a[9]; a[9]=a[min]; a[min]=t;
        for(i=0;i<10;i++)
            System.out.print(a[i]+" ");

    }
}
