package com.itheima.chapter06;
//foreach增强for循环
import java.util.ArrayList;
public class Foreach {
    public static void main(String[] args){
        ArrayList list = new ArrayList();
        list.add("date_1");
        list.add("date_2");
        list.add("date_3");
        //使用foreach循环遍历集合
        for(Object obj : list){
            System.out.println(obj);
        }
    }
}
