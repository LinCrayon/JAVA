package com.javapractice.calculator;

import java.awt.Cursor;

import java.awt.FlowLayout;

import java.awt.GridBagConstraints;

import java.awt.GridBagLayout;

import java.awt.GridLayout;

import java.awt.Insets;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.WindowEvent;

import java.awt.event.WindowListener;



import javax.swing.JButton;

import javax.swing.JDialog;

import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JMenu;

import javax.swing.JMenuBar;

import javax.swing.JMenuItem;

import javax.swing.JPanel;

import javax.swing.JTextField;



public class cal extends JFrame implements WindowListener,ActionListener {



    String str;

    String valuas;

    String s;

    double result;

    String labe;

    JMenuBar menubar;

    JMenu menu1;

    JMenu menu2;

    JMenu menu3;

    JMenuItem menuitem1;

    JMenuItem menuitem2;

    JMenuItem menuitem3;

    JMenuItem menuitem4;

    JMenuItem menuitem5;

    JPanel panel;

    JButton button;

    JTextField text;

    JLabel label;

    GridBagConstraints contains;

    public cal()

    {

        labe="";

        result=0;

        str="";

        valuas="0";

        s="+";

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setSize(300,400);

        this.setTitle("计算器");

        this.setLayout(new FlowLayout());

        menubar=new JMenuBar();

        this.setJMenuBar(menubar);

        menu1=new JMenu("查看(V)");

        menu2=new JMenu("编辑(E)");

        menu3=new JMenu("帮助(H)");

        menuitem1=new JMenuItem("历史记录");

        menuitem2=new JMenuItem("科学计算器");

        menuitem3=new JMenuItem("标准计算器");

        menuitem4=new JMenuItem("作者信息");

        menuitem5=new JMenuItem("说明");

        menuitem1.addActionListener(this);

        menuitem2.addActionListener(this);

        menuitem3.addActionListener(this);

        menuitem4.addActionListener(this);

        menuitem5.addActionListener(this);

        menu1.add(menuitem1);

        menu2.add(menuitem2);

        menu2.add(menuitem3);

        menu3.add(menuitem5);

        menu3.add(menuitem4);

        menubar.add(menu1);

        menubar.add(menu2);

        menubar.add(menu3);

        panel=new JPanel();

        panel.setLayout(new GridBagLayout());

        contains=new GridBagConstraints();

        text=new JTextField();

//text.setText("0");

        text.setHorizontalAlignment(JTextField.RIGHT);

        contains.gridx=0;

        contains.gridy=0;

        contains.gridwidth=5;

        contains.gridheight=2;

        contains.fill=GridBagConstraints.HORIZONTAL;

        panel.add(text,contains);

        createButton("x²", 0, 2, 1, 1,GridBagConstraints.HORIZONTAL, 5, 0);

        createButton("√", 1, 2, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("%", 2, 2, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("删除", 3, 2, 2, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("7", 0, 3, 1, 1,GridBagConstraints.HORIZONTAL, 5, 0);

        createButton("8", 1, 3, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("9", 2, 3, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("清零", 3, 3, 2, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("4", 0, 4, 1, 1,GridBagConstraints.HORIZONTAL, 5, 0);

        createButton("5", 1, 4, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("6", 2, 4, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("*", 3, 4, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("/", 4, 4, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("1", 0, 5, 1, 1,GridBagConstraints.HORIZONTAL, 5, 0);

        createButton("2", 1, 5, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("3", 2, 5, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("+", 3, 5, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("-", 4, 5, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton(".", 0, 6, 1, 1,GridBagConstraints.HORIZONTAL, 5, 0);

        createButton("0", 1, 6, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("1/x", 2, 6, 1, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        createButton("=", 3, 6, 2, 1,GridBagConstraints.HORIZONTAL, 5, 5);

        label=new JLabel("历史记录");

        label.setAutoscrolls(true);

        contains.gridx=0;

        contains.gridy=7;

        contains.gridwidth=5;

        contains.gridheight=2;

        contains.fill=GridBagConstraints.HORIZONTAL;

        panel.add(label,contains);

        this.add(panel);

        this.setVisible(true);

    }

    protected void createButton(String name,int x,int y,int w,int h,int hv,int iu,int il)

    {

        button=new JButton(name);

        contains.gridx=x;

        contains.gridy=y;

        contains.gridwidth=w;

        contains.gridheight=h;

        contains.insets=new Insets(iu,il,0,0);

        contains.fill=hv;

        button.addActionListener(this);

        panel.add(button,contains);

    }

    public void calculator()

    {

        if(s=="+")result=result+Double.parseDouble(valuas);

        else if(s=="-")result=result-Double.parseDouble(valuas);

        else if(s=="*")result=result*Double.parseDouble(valuas);

        else if(s=="/")result=result/Double.parseDouble(valuas);

        else if(s=="1/x")result=(1/Double.parseDouble(valuas));

        else if(s=="%")result=result/100;

        else if(s=="√")result=Math.sqrt(Double.parseDouble(valuas));

        else if (s=="x²")result=result*result;

        valuas="0";

    }

    public void actionPerformed(ActionEvent e)

    {

// TODO Auto-generated method stub

        String type;

        JMenuItem mnit = null;

        JButton btn = null;

        type=e.getSource().toString();

        if(type.contains("JMenuItem"))

        {

            mnit=(JMenuItem)e.getSource();

            if(mnit.getText()=="历史记录")

            {

                System.out.println("历史记录");

                JDialog dialog=new JDialog();

                dialog.setTitle("历史记录");

                dialog.setSize(100,200 );

                dialog.add(label);

                dialog.setVisible(true);



            }

            else

            if(mnit.getText()=="科学计算器")

            {

                System.out.println("你的电脑中毒了");



            }

            else

            if(mnit.getText()=="标准计算器")

            {

                System.out.println("建议立即重启");



            }

            else

            if(mnit.getText()=="作者信息")

            {

                System.out.println("懒得写了");



            }

            if(mnit.getText()=="说明")

            {

                System.out.println("这是一款简单易用的计算器");



            }

        }

        if(type.contains("JButton"))

        {

            btn= (JButton) e.getSource();

            if (btn.getText() == "=")

            {

                calculator();

                labe=labe+"<br>"+str+"="+result;

                label.setText("<html>"+"历史记录" +labe+"</html>");

                str = String.valueOf(result);

                text.setText(str);

                s="+";

            }

            else if (btn.getText() == "x²")

            {

                str=text.getText();

                str=str+"²";

                text.setText(str);

                calculator();

                s="x²";



            }

            else if (btn.getText() == "1/x")

            {

                str=text.getText();

                str=str+"1/";

                text.setText(str);

                calculator();

                s="1/x";

            }

            else if (btn.getText() == "删除")

            {

                str=text.getText();

                if(str.length()!=0)

                {

                    if(valuas.length()>=1&&str.length()>=1&&str.charAt(str.length()-1)<='9'&&str.charAt(str.length()-1)>='0')valuas=valuas.substring(0,valuas.length()-1);

                    else s="+";

                    if(str.length()>1&&str.substring(str.length()-2,str.length()).equals("1/"))

                    {

                        str=str.substring(0,str.length()-2);

                    }

                    else str=str.substring(0,str.length()-1);



                }

                text.setText(str);

            }

            else if (btn.getText() == "清零")

            {

                text.setText("");

                valuas="0";

                result=0;

                s="+";

                labe="";

                label.setText("<html>"+"历史记录" +labe+"</html>");

            }

            else if (btn.getText() == "+")

            {

                str=text.getText();

                str=str+"+";

                text.setText(str);

                calculator();

                s = "+";

            }

            else if (btn.getText() == "-")

            {

                str=text.getText();

                str=str+"-";

                text.setText(str);

                calculator();

                s = "-";

            }

            else if (btn.getText() == "/")

            {

                str=text.getText();

                str=str+"/";

                text.setText(str);

                calculator();

                s = "/";

            }

            else if (btn.getText() == "*")

            {

                str=text.getText();

                str=str+"*";

                text.setText(str);

                calculator();

                s = "*";

            }

            else if (btn.getText() == "%")

            {

                str=text.getText();

                str=str+"%";

                text.setText(str);

                calculator();

                s = "%";

            }

            else if (btn.getText() == "√")

            {

                str=text.getText();

                str=str+"√";

                text.setText(str);

                calculator();

                s = "√";

            }

            else

            {

                str=text.getText();

                str=str+btn.getText();

                valuas=valuas+btn.getText();

                text.setText(str);

            }

        }



/*System.out.println(valuas);

System.out.println(result);

System.out.println(s);*/

    }



    public void password()

    {

        JDialog dialog=new JDialog();

        dialog.setTitle("请输入密码");

//dialog.setSize(100,200 );

        dialog.setLayout(new GridLayout(3,1,10,10));

        label.setText("<html>"+"计算器已上锁" +"<br>"+"请输入密码解锁"+"</html>");

        dialog.add(label);

        dialog.add(text);

        dialog.setBounds(600, 400, 200, 150);

        dialog.setVisible(true);

    }

    public static void main(String[] args) {

// TODO Auto-generated method stub

        cal cal =new cal();

        cal.addWindowListener(cal);

    }

    public void windowClosing(WindowEvent e)

    {

        System.out.println("正关闭窗口");

        System.exit(0);

    }

    public void windowActivated(WindowEvent e)

    {

        System.out.println("取得主控窗口");

    }

    public void windowDeactivated(WindowEvent e)

    {

        password();

    }

    public void windowDeiconified(WindowEvent e)

    {

        System.out.println("还原窗口");

    }

    public void windowIconified(WindowEvent e)

    {

        System.out.println("最小化窗口");

    }

    public void windowOpened(WindowEvent e)

    {

        System.out.println("窗口已打开");

    }

    public void windowClosed(WindowEvent e)

    {

        System.out.println("窗口已关闭");

    }



}