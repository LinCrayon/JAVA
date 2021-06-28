package com.javapractice.thirdday;
//【程序22】
//题目：有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中。
//程序分析：首先判断此数是否大于最后一个数，然后再考虑插入中间的数的情况，插入后此元素之后的数，依次后移一个位置。
//1、创建两个数组，如果插入的数字比数组最后一个都大，那么插入的数放在新数组最后就可以
//2、如果插入的不是最大，那么和数组前面的数逐一比较，比较到比插入的数大就break
//3、比如第i个符合条件，那么arrB[i-1]=arrA[i-1],arrB[i]=num,arrB[i+1]=arrA[i]
import java.util.*;
public class Test22 {
    public static void main(String[] args){
        int [] a = {1,3,5,7,9,16,18,24,56};
        int [] b = new int[a.length+1];
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = scanner.nextInt();
        int i , j;
        for( i = 0; i < a.length;i++){
            if(n > a[i]){
                b[i] = a[i];
            }else
                break;
        }
        b[i] = n;
        for( j = i;j < a.length;j++)
            b[j + 1] = a[j];
        for( i = 0;i < b.length;i++)
            System.out.print(b[i] + " ");
    }
}
