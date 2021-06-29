package com.exam;
//编写一个程序,实现字符串大小写的转换并倒序输出。要求如下:
//(1)使用 for 循环将字符串“HelloWorld”从最后一个字符开始遍历。
//2)遍历的当前字符如果是大写字符,就使用 toLowerCase()方法将其转换为小写字
//符,反之则使用 toUpperCase()方法将其转换为大写字符。
//(3)定义一个 StringBuffer 对象,调用 append()方法依次添加遍历的字符,最后调月
//StringBuffer 対象的 toString()方法,井将得到的结果输出。

public class Exercise05 {
    public static void main(String[] args) {
        String str = "HelloWorld";
        // 字符串转成char数组
        char[] ch = str.toCharArray();
        StringBuffer buffer = new StringBuffer();
        for (int i = str.length() - 1; i >= 0; i--) {
            if (ch[i] >= 'A' && ch[i] <= 'Z') {
                buffer.append(String.valueOf(ch[i]).toLowerCase());
            } else if (ch[i] >= 'a' && ch[i] <= 'z') {
                buffer.append(String.valueOf(ch[i]).toUpperCase());
            }
        }
        System.out.println(buffer.toString());
    }
}
