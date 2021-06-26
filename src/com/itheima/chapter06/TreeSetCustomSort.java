package com.itheima.chapter06;
import java.util.Comparator;
import java.util.TreeSet;
//定义比较器实现Comparator接口
class MyComparator implements Comparator{
    public int compare(Object obj1 , Object obj2){//定制排序方式
        String s1 = (String) obj1;
        String s2 = (String) obj2;
        int temp = s1.length() - s2.length();
        return temp;
    }
}
public class TreeSetCustomSort {
    public static void main(String[] args) {
        //创建集合时，传入Comparator接口实现定制排序规则
        TreeSet ts = new TreeSet(new MyComparator());
        ts.add("JACK");
        ts.add("HELENA");
        ts.add("EVE");
        System.out.println(ts);
        //创建集合时，使用Lambda表达式定制排序规则
        TreeSet ts2 = new TreeSet((obj1,obj2) -> {
            String s1 = (String) obj1;
            String s2 = (String) obj2;
            return s1.length() -s2.length();
        });
        ts.add("JACK");
        ts.add("HELENA");
        ts.add("EVE");
        System.out.println(ts);
    }
}
