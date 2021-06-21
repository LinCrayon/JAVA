package com.itheima.chapter05;
//字符串判断
public class StringJudgment {
    public static void main(String[] args) {
        String s1 = "Starter";
        String s2 = "St";
        String str1 = new String("abc");
        String str2 = new String("abc");
        System.out.println("判断是否以字符串St开头：" + s1.startsWith("St"));
        System.out.println("判断是否以字符er结尾：" + s1.endsWith("er"));
        System.out.println("判断是否包含字符串ar:"+ s1.contains("ar"));
        System.out.println("判断字符串是否为空：" + s1.isEmpty());
        System.out.println("判断连个字符串是否相等："+  s1.equals(s2));

        System.out.println("==================================");
        System.out.println(str1 == str2);           //false
        System.out.println(str1.equals(str2));      //true
        //equals()方法比较两个字符串中的字符字符值是否相等
        //而 == 是比较两个字符串对象的内存地址是否相等

    }
}
