package com.ther.chapter02;

public class FloatDetail {
	public static void main(String[] args) {
		//bit是计算机中最小的存储单位。byte是计算机中最基本的存储单位1byte = 8 bit
		//浮点数 = 符号位 + 指数位 + 尾数位 ；尾部部分可能丢失，造成精度损失
		//java的浮点型常量（具体值）默认double类型，声明float型常量需加'f'或‘F’
		
		//float num1 = 1.1;错
		float num1 = 1.1f;//对
		double num2 = 1.1;//对
		double num3 = 1.1f;//对
		
		//十进制数形式：如：5.12 512.0f .512 (必须有小数点）
		double num5 = .123; //等价 0.123
		System.out.println(num5);
		
		//科学计数法形式:如：5.12e2 [5.12 * 10 的 2 次方 ] 5.12E-2 []所以是小数
		System.out.println(5.12e-2);
		System.out.println(5.12e2);
		
		//通常情况下，应该使用 double 型，因为它比 float 型更精确。
		double num6 = 2.1234567851;
		float num7 = 2.1234567851F;
		System.out.println(num6);
		System.out.println(num7);
		
		System.out.println("============================");
		
		//浮点数使用陷阱: 2.7 和 8.1 / 3 比较
		//看看一段代码
		double num8 = 2.7;
		double num9 = 2.7; //8.1 / 3; //2.7
		System.out.println(num8);//2.7
		System.out.println(num9);//接近 2.7 的一个小数，而不是 2.7
		
				//得到一个重要的使用点: 当我们对运算结果是小数的进行相等判断是，要小心
				//应该是以两个数的差值的绝对值，在某个精度范围类判断
				if( num8 == num9) {
				System.out.println("num8 == num9 相等");
				}
				//正确的写法 , ctrl + / 注释快捷键, 再次输入就取消注释
				if(Math.abs(num8 - num9) < 0.000001 ) {
					System.out.println("差值非常小，到我的规定精度，认为相等...");
		
				}
		}

}
