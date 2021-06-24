package com.itheima.chapter05;
//exec()方法执行DOS命令
import java.io.IOException;
public class Exex {
    public static void main(String[] args) throws  IOException {
        Runtime runtime = Runtime.getRuntime();//创建Runtime实例对象
        runtime.exec("notepad.exe");//调用exec()方法
    }
}
