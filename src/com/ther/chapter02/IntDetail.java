package chapter;

public class IntDetail {
	public static void main(String[] args) {
		//java的整形常量（具体值）默认int类型，声明long型常量需加'l'或‘L’
		int n1 = 1;//4个字节
		// int n2 = 1L; 错
		long n3 = 1L;//对
		//bit是计算机中最小的存储单位。byte是计算机中最基本的存储单位1byte = 8 bit
		//浮点数 = 符号位 + 指数位 + 尾数位 ；尾部部分可能丢失，造成精度损失
		System.out.println(n1);
		System.out.println(n3);
	}

}
