package com.itheima.chapter06;
//foreach只能访问集合元素，不能对其元素修改
//普通for循环可以修改其中元素
public class ForeachFor {
    static String[] strs ={"aaa" , "bbb" , "ccc"};
        public static void main(String[] args) {
            //foreach循环遍历数组
        for(String str: strs){
            str = "ddd";
        }
            System.out.println("foreach循环改后的数组:"  + strs[0] +","+
                                            strs[1] + "," + strs[2]);
        //for循环遍历数组
            for (int i = 0; i < strs.length; i++) {
                strs[i] = "ddd";
            }
            System.out.println("普通for循环改后的数组:"  + strs[0] +","+
                    strs[1] + "," + strs[2]);
    }
}