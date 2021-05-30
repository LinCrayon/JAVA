package chapter;

public class Var02 {
	//编写一个main方法
	public static void main(String[] args) {
		int age = 30;
		double score = 88.9;
		char gender = 'b';
		String name = "king";
		
		// string不是基本数据类型，它是个class类
		//基本数据类型有八种，数值型【byte,short,int,float,double】char,boolean
		//引用类型[类，接口，数组]
		
		System.out.println("人的信息如下:");
		System.out.println(name);
		System.out.println(age);
		System.out.println(score);
		System.out.println(gender);
	}
}
