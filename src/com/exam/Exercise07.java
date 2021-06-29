package com.exam;
//1.编写一个程序,分别使用字节流和字符流拷贝一个文本文件。要求如下:
//(1)使用FileInputStream、FileOutputStream和FileReader、FileWriter分别进行拷贝。
//(2) 使用字节流拷贝时，定义一个1024长度的字节数组作为缓冲区，使用字符流拷贝，使用BufferedReader和BufferedWriter包装流进行包装。
import java.io.*;
public class Exercise07 {
    public static void main(String[] args) throws Exception {
        // 字节流拷贝
        FileInputStream in = new FileInputStream("E:/src.txt");
        FileOutputStream out = new FileOutputStream("E:/des1.txt");
        byte[] buf = new byte[1024];
        int len;
        while ((len = in.read(buf)) != -1) {
            out.write(buf, 0, len);
        }
        in.close();
        out.close();
        // 字符流拷贝
        BufferedReader bf = new BufferedReader(new FileReader("E:/src.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("E:/des2.txt"));
        String str;
        while ((str = bf.readLine()) != null) {
            bw.write(str);
            bw.newLine();
        }
        bf.close();
        bw.close();
    }
}
