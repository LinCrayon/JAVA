package com.itheima.chapter05;
import java.util.*;
public class Calendar01 {
    public static void main(String[] args) {
        //获取表示当前时间的Calendar对象
        Calendar calendar = Calendar.getInstance();//调用静态方法getInstance()得到Calendar
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int date = calendar.get(Calendar.DATE);
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MONTH);
        int second = calendar.get(Calendar.SECOND);
        System.out.println("当前时间为：" + year + "年" +month + "月" + date + "日" + hour + "时" + minute + "分" + second + "秒");
    }
}
