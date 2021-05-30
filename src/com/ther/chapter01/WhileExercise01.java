package chapter05;

public class WhileExercise01 {
	public static void main(String[] args) {
		// 打印 1—100 之间所有能被 3 整数。
		int start = 1 ;
		int end = 100;
		int n = 3;
		while(start <= end) {
			if(start %n ==0) {
				System.out.println("start="+start);
			}
			start++;
		}
	}

}
