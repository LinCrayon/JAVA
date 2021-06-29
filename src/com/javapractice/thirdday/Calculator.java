package com.javapractice.thirdday;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.math.BigDecimal;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;

class CalculatorTest {
    public static JFrame jf = new JFrame("计算器");
    public static JPanel jpTotal = new JPanel();	//存在总面板
    public static JPanel jpText = new JPanel();	//存储文本框
    public static JPanel jpButton = new JPanel();	//存储按钮
    public static JTextField jt = new JTextField();
    public static final String[] jbFunction = {"7", "8", "9", "/", "4", "5", "6", "*", "1", "2", "3", "-", "0", ".", "=", "+", "Sqrt", "^2", "^3", "%"};
    public static JButton[] jb = new JButton[jbFunction.length];
    public static double numberOne;
    public static double numberTwo;
    public static int count;

    //用于删除字符串，存储新的字符串
    static String str = "";
    static String s = "";
    static String st;
    static int result;

    //整个面板
    public static void demo() {
        //窗体不能拖动大小
        jf.setResizable(false);

        //设置窗体大小位置
        jf.setBounds(500, 200, 400, 400);

        //面板设置
        jpTotal.setBorder(new EmptyBorder(5,5,4,4));	//设置总面板边框
        jpTotal.setLayout(new BorderLayout(0,0));
        jpTotal.add(jpText, BorderLayout.NORTH); //将面板放置在边界布局的北部
        jf.add(jpTotal);

        //添加文本框
        jt.setHorizontalAlignment(SwingConstants.RIGHT);
        jt.setFont(new Font("楷体", Font.BOLD, 25));
        jt.setColumns(27);
        jpText.add(jt);

        //添加按钮
        jpButton.setLayout(new GridLayout(5,5,4,4));
        for(int i = 0; i < jb.length; i++) {
            jb[i] = new JButton(jbFunction[i]);
            jpButton.add(jb[i]);
            jb[i].setBackground(Color.lightGray);
            jb[i].setContentAreaFilled(true);
            jb[i].setToolTipText("I'm " + jb[i].getText());
            jb[i].setFont(new Font(null, Font.BOLD,18));
        }
        jpTotal.add(jpButton, BorderLayout.CENTER);
        //窗体显示和关闭
        jf.setVisible(true);
        jf.setDefaultCloseOperation(jf.EXIT_ON_CLOSE);
    }
}
public class Calculator
{
    public static void main(String[] args) {
        try {
            //通过 UIManager 来设置窗体的 UI 风格
            UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        CalculatorTest cal = new CalculatorTest();
    }
}