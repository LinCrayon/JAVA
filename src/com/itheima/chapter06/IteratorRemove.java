package com.itheima.chapter06;
//Iterator迭代器对集合迭代时,调用集合对象remove()方法删除元素
import java.util.ArrayList;
import java.util.Iterator;
public class IteratorRemove {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("Jack");
        list.add("Annie");
        list.add("Rose");
        list.add("Tom");
        Iterator it = list.iterator();
        while (it.hasNext()){
            Object obj = it.next();
            if("Annie".equals(obj)){
                list.remove(obj);
                break;      //使用break或it.remove();
            }
        }
        System.out.println(list);
    }
}
