package com.ther.chapter01;

public class ForDetail {
	public static void main(String[] args) {
		//	1) 循环条件是返回一个布尔值的表达式
		//	2) for(;循环判断条件;) 中的初始化和变量迭代可以写到其它地方，但是两边的分号不能省略。
		//	3) 循环初始值可以有多条初始化语句，但要求类型一样，并且中间用逗号隔开，循环变量迭代也可以有多条变量迭代
		//	语句，中间用逗号隔开
		int i = 1 ;//循环变量初始化
		for(   ; i <= 10 ;  ) {
			System.out.println("jiexiaowei" +i );
			i++;
		}
		System.out.println("i = " +i);
	}
}