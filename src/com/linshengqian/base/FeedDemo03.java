package com.linshengqian.base;
import java.util.*;
public class FeedDemo03 {
    public static void main(String[] args) {
        //整数拓展： 进制  二进制0b   八进制0    十进制     十六进制0x
        int i1 = 10;
        int i2 = 010;//八进制0
        int i3 = 0x10;//十六进制0x
        int i4 = 0x11;//十六进制0x
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println("=======================================");
        //浮点数拓展
        //float 有限  离散      舍入误差    接近但不相等
        //浮点类型float, double的数据不适合在不容许舍入误差的金融计算领域。
        //如果需要进行不产生舍入误差的精确数字计算，需要使用BigDecimal类。
        /*由于字长有限，浮点数能够精确表示的数是有限的，因而也是离散的。浮点数一般都存在舍入误差，很
        多数字无法精确表示，其结果只能是接近，但不等于；二进制浮点数不能精确的表示0.1,0.01,0.001这样
        10的负次幂。并不是所有的小数都能可以精确的用二进制浮点数表示。*/
        float f = 0.1f; //  0.1
        double d = 1.0 / 10;  //0.1

        System.out.println(f == d);
        System.out.println(f);
        System.out.println(d);

        float d1 = 111222333;
        float d2 = d1 + 1;
        System.out.println(d1 == d2);

        System.out.println("============================");

        //字符拓展
        char c1 = 'a';
        char c2 = '中';
        System.out.println(c1);
        System.out.println((int) c1);//强制转换
        System.out.println(c2);
        System.out.println((int) c2);//强制转换
        //字符的本质还是数字
        //单引号用来表示字符常量。例如‘A’是一个字符，它与“A”是不同的，“A”表示一个字符串。
        //char 类型用来表示在Unicode编码表中的字符。
        //Unicode编码被设计用来处理各种语言的所有文字，它占2个字节，可允许有65536个字符；
        //区间范围  U0000 -> UFFFF
        char c3 = '\u0061';
        System.out.println(c3);//a

        //**转义字符**
        //  \t 制表符： 一个制表符位置代表8个空格
        //如果前面的内容满足制表符位置的整数倍,重新开辟一个制表符位8个空格
        //如果前面内容不满,不全一整个制表符位
        //  \n 换行
        //  \b 光标退格
        //  \r 光标回到行首
        System.out.println("Hello\nWorld");

        String sa = new String("Hello world");
        String sb = new String("Hello world");
        System.out.println(sa == sb);//false

        String sc = "Hello world";
        String sd = "Hello world";
        System.out.println(sc == sd); // true
    }
}
