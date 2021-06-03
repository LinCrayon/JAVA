package com.ther.chapter02;

public class ForceConvert {
	public static void main(String[] args) {
		//自动类型转换的逆过程，将容量大的数据类型转换为容量小的数据类型。使用时要加上强制转换符 ( )，但可能造成
		//精度降低或溢出,格外要注意。
		int n1 = (int)1.9;
		System.out.println("n2="+n1);//1
		
		int n2 = 2000;//2000
		byte b1 = (byte)n2;
		System.out.println("b1="+b1);//-48造成数据溢出
	}

}
