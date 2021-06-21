package com.itheima.chapter05;
//字符串的截取和分割

//substring()截取字符串
//split()对字符串进行分割

public class StringSubstringSplit {
    public static void main(String[] args) {
        String str = "2021-06-01";
        //截取操作
        System.out.println("从第六个字符截取到末尾的结果：" + str.substring(5));      //06-01
        System.out.println("从第六个字符截取到第七个字符的结果：" + str.substring(5,7));//06
        //分割操作
        System.out.print("分割后的字符串数组中的元素依次为：");
        //通过横线连接符 ” - “ 将字符串转换为字符串数组
        String[] strArray = str.split("-");
        for(int i = 0 ; i < strArray.length ; i++){     //  循环输出数组
            if(i != strArray.length - 1){
                System.out.print(strArray[i] + " 、");
            }else{
                System.out.println(strArray[i]);
            }
        }
    }
}
