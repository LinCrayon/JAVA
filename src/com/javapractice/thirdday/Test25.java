package com.javapractice.thirdday;
//【程序25】
//题目：有n个人围成一圈，顺序排号。从第一个人开始报数（从1到3报数），凡报到3的人退出圈子，问最后留下的是原来第几号的那位。
//关键问题是怎么移除》？:布尔值确定，如果被选中被赋值为false
//* 从第一个人开始判断，如果他在圈内，那么报数，再判断他报的数是否是3，如果是的话移出圈外
//* 接着判断下一个人，是否到了最末，如果是的话，从零开始
//* 不断循环，直到最后剩下1个人
import java.util.Scanner;
public class Test25 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("请输入一个整数:");
        int n=sc.nextInt();
        int i,m=0,j;
        boolean [] a=new boolean[n];
        for(i=0;i<n;i++){
            a[i]=true;
        }
        i=0;
        j=0;
        while(m<n-1){
            if(a[i]==true){
                j++;
            }else{
            }
            if(j==3){
                a[i]=false;
                j=0;
                System.out.print((i+1)+" ");
                m++;
            }
            i++;
            if(i==n)
                i=0;
        }
        for(i=0;i<n;i++)
            if(a[i]==true)
                System.out.print("最后留下是:"+(i+1));
    }
}
