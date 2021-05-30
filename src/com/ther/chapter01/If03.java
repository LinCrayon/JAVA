package chapter05;
import java.util.Scanner;
public class If03 {
	public static void main(String[] args) {
		/*
		输入保国同志的芝麻信用分：
		如果：
		信用分为 100 分时，输出 信用极好；
		信用分为(80，99]时，输出 信用优秀；
		信用分为[60,80]时，输出 信用一般；
		其它情况 ，输出 信用 不及格
		请从键盘输入保国的芝麻信用分，并加以判断
		假定信用分数为 int
		*/
		Scanner myScanner = new Scanner(System.in);
		//接收用户输入
		System.out.println("请输入信用分:");
		int grade = myScanner.nextInt();
		
		
		//a=b 就是把b的值赋予给a;
		//a==b 就是判断a等于b
		
		//四种情况
		if(grade == 100) {
			System.out.println("信用极好");
		}else if(grade > 80 && grade <= 99) {
			System.out.println("信用优秀");
		}else if(grade >= 60 && grade <= 80) {
			System.out.println("信用一般");
		}else  if (grade >= 0 && grade < 60) {
			System.out.println("不及格");
		}else {
			System.out.println("输入有误");
		}
		
	}

}
