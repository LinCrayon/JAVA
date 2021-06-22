package com.javapractice.firstday;
//【程序17】
//题目：利用递归方法求5!。
//程序分析：递归公式：f(n)=n*f(n-1)，不断的调用方法，直到最小的值确定1。
import java.util.Scanner;
public class Test17 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个整数：");
        int n = scanner.nextInt();
        System.out.println(n + "!= "+ fac(n));
    }
    private static int fac(int n){
        int f;
        if(n == 0 || n == 1){
            f = 1;
        }else{
            f =  n * fac(n - 1);
        }
        return f;
    }
}
	/*public static int getSum(int n){
		if(n == 1){
			return 1;
		}
		int temp = getSum(n - 1);
		return temp * n;
	}
	public static void main(String[] args){
		int sum = getSum(5);
		System.out.println("5!=" + sum);
	}
}*/




	/*public static void main(String[] args){
		int i  , m;
		int j = 1;
		for(i = 5 ; i >=1;i--){
			m = i;
			if(i >= 1 ){
				j = j * m ;
			}
		}
		System.out.println(j);

	}*/
