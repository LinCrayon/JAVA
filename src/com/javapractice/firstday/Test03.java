package com.javapractice.firstday;

//【程序3】
//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
// 小兔子长到第三个月后每个月又生一对兔子，
// 假如兔子都不死，问每个月的兔子对数为多少？
//程序分析：兔子的规律为数列1,1,2,3,5,8,13,21…。
//本题有：a[n]=a[n-1]+a[n-2],而第一第二项都知道了，后面的值也可以求得
import java.util.Scanner;

public class Test03 {
    public static void main(String[] args){
        int[] s = new int[100];
        int i ,j ,m ,n , x;
        System.out.println("请输入整数：");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = 0;
        while (n != 0){
            s[m] = n;
            m++;
            System.out.println("请输入整数：");
            n =sc.nextInt();
        }
        for(i = 0, j = m-1;i < j;i++,j++ ){
            x = s[i];s[i]=s[j];s[j]=x;
        }
        for(i = 0; i < m; i++){
            System.out.print(s[i]+ " ");
        }
    }
}
