package com.javapractice.secondday;
//【程序20】
//题目：对10个数进行排序
//程序分析：可以利用选择法，即从后9个比较过程中，选择一个最小的与第一个元素交换，下次类推，即用第二个元素与后8个进行比较，并进行交换。最后打印出来的数组就是从小到大排列的数组了。
import java.util.Scanner;
public class Test20 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int [] a=new int [10];
        int i,j,k,t;
        System.out.print("请输入10个整数(以空格隔开):");
        for(i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        for(i=0;i<9;i++){
            k=1;
            for(j=i+1;j<10;j++){
                if(a[j]<a[k]){
                    k=j;
                }
            }
            t=a[i];
            a[i]=a[k];
            a[k]=t;
        }
        for(i=0;i<10;i++){
            System.out.print(a[i]+" ");
        }
    }
}
