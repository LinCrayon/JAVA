package com.ther.chapter02;

public class ForceConverDetail {
	public static void main(String[] args) {
		//演示强制类型转换
		//强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5;//编译错误： double -> int
		int x = (int)(10*3.5+6*1.5);// (int)44.0 -> 44
		System.out.println(x);//44
		
		//char类型可以保存int的常量，但不能保存int的变量值，需要强转
		char c1 = 100; //ok
		int m = 100; //ok
		//char c2 = m; //错误
		char c3 = (char)m; //ok
		System.out.println(c3);//100 对应的字符, d 字符
		//byte和short类型在进行运算时，当做int类型处理
	}
}
