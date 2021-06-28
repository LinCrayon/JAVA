package com.javapractice.thirdday;
//【程序21】
//题目：求一个3*3矩阵对角线元素之和
//程序分析：利用双重for循环控制输入二维数组，再将a[i][i]累加后输出。
import java.util.Scanner;
public class Test21 {
    public static void main(String[] args){
        int sum = 0;
        int[][] arr = new int[3][3];
        Scanner scanner = new Scanner(System.in);
        for(int i = 0 ; i <3 ; i++){
            System.out.print("请输入第"+ (i + 1) + "行三个数据：");
            for(int j = 0 ; j <3;j++)
                arr[i][j] = scanner.nextInt();
        }
        for(int i = 0 ; i < 3 ;i++ ){
            sum = sum + arr[i][i];
        }
        System.out.print(sum);
    }
}
