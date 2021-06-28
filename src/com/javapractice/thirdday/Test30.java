package com.javapractice.thirdday;
//【程序30】
//题目：有五个学生，每个学生有3门课的成绩，从键盘输入以上数据（包括学生号，姓名，三门课成绩），计算出平均成绩，将原有的数据和计算出的平均分数存放在磁盘文件”stud”中。
//最后这题涉及文件存储，输入输出流
import java.io.*;
public class Test30 {
    String[] number=new String[5];
    String[] name=new String[5];
    float[][] grade=new float[5][3];
    float [] sum=new float[5];
    public static void main(String[] args)throws Exception{
        Test30 stud = new Test30();
        stud.input();
        stud.output();
    }
    void input()throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        boolean isRecord=true;
        while(isRecord){
            try{
                for(int i=0;i<5;i++){
                    System.out.print("请输入学号:");
                    number[i]=br.readLine();
                    System.out.print("请输入姓名:");
                    name[i]=br.readLine();
                    for(int j=0;j<3;j++){
                        System.out.print("请输入第"+(j+1)+"门课成绩:");
                        grade[i][j] = Integer.parseInt(br.readLine());
                    }
                    System.out.println();
                    sum[i] = grade[i][0]+grade[i][1]+grade[i][2];
                }
                isRecord = false;
            }
            catch(NumberFormatException e){
                System.out.println("请输入一个数字！");

            }
        }
    }
    void output() throws IOException {
        FileWriter fw = new FileWriter("E://java50//stud.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write("No.  " + "Name  " + "grade1  " + "grade2  " + "grade3  " + "average");
        bw.newLine();
        for (int i = 0; i < 5; i++) {
            bw.write(number[i]);
            bw.write("  " + name[i]);
            for (int j = 0; j < 3; j++)
                bw.write("  " + grade[i][j]);
            bw.write("  " + (sum[i] / 5));
            bw.newLine();
        }
        bw.close();
    }
}
