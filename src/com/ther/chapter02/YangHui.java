package com.ther.chapter02;
//        1
//        1	1
//        1	2	1
//        1	3	3	1
//        1	4	6	4	1
//        1	5	10	10	5	1
//        1	6	15	20	15	6	1
//        1	7	21	35	35	21	7	1
//        1	8	28	56	70	56	28	8	1
//        1	9	36	84	126	126	84	36	9	1

public class YangHui {
    public static void main(String[] args) {
        int[][] yanghui = new int[10][];
        for (int i = 0; i < yanghui.length; i++) { // 遍历yanghui的每一个元素
            yanghui[i] = new int[i + 1];//为每个一维数组(行)开空间
            for (int j = 0; j < yanghui[i].length; j++) {//给每一个一维数组(行)赋值
                if (j == 0 || j == yanghui[i].length - 1) {
                    yanghui[i][j] = 1;//每行第一个元素和最后个元素都是一
                } else {
                    yanghui[i][j] = yanghui[i - 1][j] + yanghui[i - 1][j - 1];//中间元素
                }
            }
        }
        //输出杨辉三角
        for (int i = 0; i < yanghui.length ; i++){
            for (int j = 0; j < yanghui[i].length; j++) {
                System.out.print(yanghui[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
