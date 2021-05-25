package com.linshengqian.base;

public class ScopeDemo07 {
    //类变量static
    static  double salary = 2500;



    //属性：变量

    //实例变量：从属于对象
    //数值型变量初始化成0或0.0，字符型变量的初始化值是16位的0，布尔型默认是false
    String name;
    int age;
    //main方法
    public static void main(String[] args) {
        //局部变量；必须声明和初始化
        int i = 10;
        System.out.println(i);

        //变量类型 变量名字 = new ScopeDemo07();
        ScopeDemo07 sd07  = new ScopeDemo07();
        System.out.println(sd07.age);
        System.out.println(sd07.name);

        //类变量static
        System.out.println(salary);
    }
    //其他方法
    public void add(){

    }
}
