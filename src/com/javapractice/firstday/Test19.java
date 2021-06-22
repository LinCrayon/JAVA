package com.javapractice.firstday;
//【程序19】
//题目：一个5位数，判断它是不是回文数。即12321是回文数，个位与万位相同，十位与千位相同。
//这个程序跟上一个程序类似。
//  * 创建一个五位数的数组
//  * 逐次取位
//  * 组后判断条件就可以了
import java.util.Scanner;
public class Test19 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int  n = scanner.nextInt();
        int  x = 0 , m;
        int[] arr = new int[5];
        while( n != 0){
            m = n % 10;
            arr[x] = m;
            n = n/10;
        }
        for(int i = 0 ; i <=4 ;i++){
            if(n == arr[i]){
                System.out.println("S");
            }else{
                System.out.println("F");
            }
        }
    }
}
