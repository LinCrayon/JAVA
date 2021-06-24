package com.javapractice.firstday;
//【程序3】
//题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
// 小兔子长到第三个月后每个月又生一对兔子，
// 假如兔子都不死，问每个月的兔子对数为多少？
//程序分析：兔子的规律为数列1,1,2,3,5,8,13,21…。
//本题有：a[n]=a[n-1]+a[n-2],而第一第二项都知道了，后面的值也可以求得
import java.util.Scanner;
public class Test03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入月份：");
        int n = Integer.parseInt(scanner.nextLine());
        int[] sum = new int[n + 1];
        sum[1] = 1;
        sum[2] = 1;
        for (int i = 3; i <= n; i++) {
            sum[i] = sum[i - 1] + sum[i - 2];
        }
        System.out.println("每个月的兔子对数为" + sum[n]);
    }
}
