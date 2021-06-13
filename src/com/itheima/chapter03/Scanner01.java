package com.itheima.chapter03;

import java.util.*;

public class Scanner01 {
    public static void main(String[] args) {
        System.out.println("请输入数");
        Scanner scanner = new Scanner(System.in);

        double sum = 0;
        int  m = 0;
        //通过循环判断是否还有输入，并在里面对每一次进行求和统计
        while(scanner.hasNextDouble()){
            double x = scanner.nextDouble();
            m = m + 1;
            sum = sum + x;
            System.out.println("你输入第" + m + "数，当前结果为sum =" + sum);
        }
        System.out.println(m + "个数和为" + sum);
        System.out.println(m + "个数的平均值是" + (sum/m) );
        scanner.close();
    }
}
