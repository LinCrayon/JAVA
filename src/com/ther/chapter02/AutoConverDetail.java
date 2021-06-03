package com.ther.chapter02;

public class AutoConverDetail {
	public static void main(String[] args) {
		
		//细节 1:有多种类型的数据混合运算时，
		//系统首先自动将所有数据转换成容量最大的那种数据类型，然后再进行计算
		int n1 = 10;
		double d1 = n1 + 1.1;
		//float d1 = n1 + 1.1;//错误 1.1是double类型
		float d2 = n1 + 1.1f;
		System.out.println(n1);
		System.out.println(d1);
		System.out.println(d2);
		
		//细节2：(byte,short)和char之间不会相互转换
		//当把具体数赋给byte时，先判断该数是否在byte范围内，如果是就可以
		byte b3 = 10;   //对 ，-128-127
		int n2 = 1; //n2是int
		//byte b2 = n2;错 ，如果是变量赋值，先判断类型   
		//char c1 = b1;错
		
		
		//细节 3: byte，short，char 他们三者可以计算，在计算时首先转换为 int 类型
		byte b2 = 1;
		byte b4 = 2;
		short s1 = 1;
		//short s2 = b2 + s1;//错, b2 + s1 => int
		int s2 = b2 + s1;//对, b2 + s1 => int
		//byte b4 = b2 + b4; //错误: b2 + b4 => int
		
		
		//boolean 不参与转换
		boolean pass = true;
		//int num100 = pass;// boolean 不参与类型的自动转换
	}
}
