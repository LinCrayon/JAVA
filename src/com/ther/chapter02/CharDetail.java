package com.ther.chapter02;

public class CharDetail {
	public static void main(String[] arrgs) {
		char c1 = 'a';
		char c2 = '\t';
		char c3 = '林';
		char c4 = 97;	//说明：字符类型可以直接存放一个数字
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);//97表示字符=》编码a
		
		System.out.println("===================");
		
		//在 java 中，char 的本质是一个整数，在默认输出时，是 unicode 码对应的字符
		//要输出对应的数字，可以(int)字符
		char c5 = 97;//a
		System.out.println(c5);
		
		char c6 = 'a';
		System.out.println((int)c6);//输出a对于的数字
		char c7 = '林';
		System.out.println((int)c7);
		char c8 = 26519;
		System.out.println(c8);
		
		//char 类型是可以进行运算的，相当于一个整数，因为它都对应有 Unicode 码.
		
		System.out.println('a' + 10);//107
		
		
		char c9 = 'b' + 1 ;
		System.out.println((int)c9);//99
		System.out.println(c9);//99->对应的字符->编码表 ASCII(规定好的)=>c
		
	}
}
