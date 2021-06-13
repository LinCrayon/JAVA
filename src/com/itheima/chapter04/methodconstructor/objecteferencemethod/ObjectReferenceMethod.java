package com.itheima.chapter04.methodconstructor.objecteferencemethod;

//2.对象名引用方法
@FunctionalInterface
interface printable{
    void print(String str);
}
class StringUtils {
    public void printUpperCase(String str){
        System.out.println(str.toUpperCase());
    }
}
public class ObjectReferenceMethod {
    private static void printUpper(String text, printable pt){
        pt.print(text);
    }

    public static void main(String[] args) {
        StringUtils stu = new StringUtils();
        //使用Lambda表达式
        printUpper("hello",t->stu.printUpperCase(t));
        //使用方法引用的方式
        printUpper("hello",stu :: printUpperCase);
    }

}
