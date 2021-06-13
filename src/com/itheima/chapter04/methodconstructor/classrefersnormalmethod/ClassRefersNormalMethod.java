package com.itheima.chapter04.methodconstructor.classrefersnormalmethod;
//类名引用普通方法

//类名引用普通方法是通过提供普通类的类名对其普通方法进行引用


@FunctionalInterface
interface Printable{
    void print(StringUtils su, String str);
}
class StringUtils{
    public void printUpperCase(String str){
        System.out.println(str.toUpperCase());
    }
}
public class ClassRefersNormalMethod {
    private static void printUpper(StringUtils su,String text,Printable pt){
        pt.print(su,text);
    }

    public static void main(String[] args) {
        //使用Lambda表达式方式
        printUpper(new StringUtils(),"Hello",(object,t) -> object.printUpperCase(t));
        //使用方法引用的方式
        printUpper(new StringUtils(),"Hello",StringUtils::printUpperCase);
    }
}
