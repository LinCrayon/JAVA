package chapter;

public class VarDetail {
	public static void main(String[] args) {
		//变量必须先声明，后使用, 即有顺序
		int a = 50;
		System.out.println(a);//50
		a = 88;
		System.out.println(a);//88
		
		//变量在同一个作用域内不能重名
		//int a = 77;//错误
		System.out.println("=====================");
		
		System.out.println(100 + 90);	//190
		System.out.println(100 + "a");	//100a
		System.out.println(100 + 90 + "hello");	//10090hello
		//左右两边有一方是字符串时，做拼接运算

		
	}

}
class Dog{
	public static void main(String[] args) {
		int a = 666;//对
		System.out.println(a);
	}
}