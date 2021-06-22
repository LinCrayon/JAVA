package com.javapractice.firstday;

//【程序14】
//题目：打印出如下图案（菱形）
//
//   *
//  ***
// *****
//*******
// *****
//  ***
//   *
//
//程序分析：先把图形分成两部分来看待，前四行一个规律，后三行一个规律，利用双重 for循环，第一层控制行，第二层控制列。
//详细分析第一部分图形的规律：
//1、这是一个等腰三角形，*的打印次数1、3、5、7等差数列
//   2、还要注意空格打印的 次数3、2、1、0逐渐递减
//  * 第二部分同理可得！

public class Test14 {
    public static void main(String[] args){
		/*for(int i =1 ;i<=7;i++){
			for(int j = 7;j>=i;j--){
				System.out.print(" ");
			}
			for(int j = 1; j<=i;j++){
				System.out.print("*");
			}
			for(int j = 1; j<i;j++){
				System.out.print("*");
			}
		System.out.println();
		}
		for(int i =1 ;i<=7;i++){
			for(int j = 1;j<i;j++){
				System.out.print(" ");
			}
			for(int j = 1; j>i;j--){
				System.out.print("*");
			}
			for(int j = 1; j>=i;j++){
				System.out.print("*");
			}
		System.out.println();
		}*/


        for(int i =1 ;i<=4;i++){
            for(int j = 4;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =3 ;i>=1;i--){
            for(int j = 1;j<=4-i;j++){
                System.out.print(" ");
            }
            for(int j = 1; j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();

        }
    }
}