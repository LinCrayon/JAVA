package com.itheima.chapter05;
//进程的关闭
import java.io.*;
public class ExecProcess {
    public static void main(String[] args) throws Exception{
        Runtime runtime = Runtime.getRuntime();
        //得到表示进程的Process对象
        Process process = runtime.exec("notepad.exe");
        //程序休眠3秒
        Thread.sleep(3000);
        //关闭进程
        process.destroy();
    }
}
