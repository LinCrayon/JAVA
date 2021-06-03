package com.ther.chapter01;

public class DoWhile01 {
	public static void main(String[] args) {
			//循环变量初始化;
			//	do{
			//	循环体(语句);
			//	循环变量迭代;
			//	}while(循环条件);
		
			//	先执行，再判断，也就是说，一定会至少执行一次
		int i = 1;
		do {
			System.out.println("jiexiaowie" + i );
			i++;
		}
		while(i <= 10);
		System.out.println("退出");
	}
}
