package com.itheima.chapter05;



//字符串转换
public class StringConversion {
    public static void main(String[] args) {
        String str = "java";
        char [] charArray = str.toCharArray();//字符串转为字符数组
        for (int i = 0; i < charArray.length; i++) {
            if(i != charArray.length -1){       //如果不是数组最后一个元素就在后面加逗号
                System.out.print(charArray[i] + ",");
            }else {
                System.out.println(charArray[i]);    //否则不加逗号
            }
        }
        System.out.println("将int值转换为String类型之后的结果：" + String.valueOf(12));
        System.out.println("将字符串转换为大写后的结果：" + str.toUpperCase());
    }
}
