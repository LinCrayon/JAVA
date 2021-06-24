package com.itheima.chapter05;
import java.util.*;
public class Calendar02 {
    public static void main(String[] args) {
        //获取表示当前时间的Calendar对象
        Calendar calendar = Calendar.getInstance();//调用静态方法getInstance()得到Calendar
        //设置指点日期
        calendar.set(2021,6,24);
        //添加时间
        calendar.add(calendar.DATE,5);
        //返回指定日期的年
        int year = calendar.get(Calendar.YEAR);
        //返回指定日期的月
        int month = calendar.get(Calendar.MONTH);
        //返回指定日期的日
        int date = calendar.get(Calendar.DATE);
        System.out.println("计划竣工日期为：" + year + "年" + month + "月" + date + "日");
    }
}
