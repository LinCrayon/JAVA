package chapter05;

public class WhileExercise02 {
	public static void main(String[] args) {
		// 打印 40—200 之间所有的偶数 [使用 while, 课
		int n1 = 40;
		int n2 = 200;
		int n3 = 2;
		while(n1 <= n2) {
			if(n1 %n3 == 0) {
				System.out.println("n1="+n1);
			}
			n1++;
		}
	}
}
