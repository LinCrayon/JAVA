package com.linshengqian.operator;

import com.linshengqian.util.Const;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
    /******************北面控件********************/
public class Carculator extends JFrame implements ActionListener {
    private JPanel jp_north = new JPanel();
    private JTextField input_text = new JTextField();
    private JButton c_Btn = new JButton("c");
    /******************中间控件********************/
    private JPanel jp_center = new JPanel();
    public Carculator() throws HeadlessException {
       this.init();
       this.addNorthComponent();
       this.addCenterButton();
    }

    //初始化方法
    public void init(){
        this.setTitle(Const.TITLE);
        this.setSize(Const.FRAME_W,Const.FRAME_H);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocation(Const.FRAME_X,Const.FRAME_Y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //添加北面控件
    public void addNorthComponent(){

        this.input_text.setPreferredSize(new Dimension(230,30));
        jp_north.add(input_text);
        this.c_Btn.setForeground(Color.RED);
        jp_north.add(c_Btn);

        c_Btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_text.setText("");
            }
        });

        this.add(jp_north,BorderLayout.NORTH);
    }
    //添加中间的按钮
    public void addCenterButton(){
        String regex = "[\\+\\-*/.=]";
        String btn_text = "123+456-789*0.=/";

        this.jp_center.setLayout(new GridLayout(4,4));
        for(int i = 0 ; i < 16 ;i++){
            String temp = btn_text.substring(i,i+1);
            JButton btn = new JButton();
            btn.setText(temp);
            if(temp.matches(regex)){
                btn.setFont(new Font("粗体",Font.BOLD,16));
                btn.setForeground(Color.RED);
            }
            /*if(temp.equals("+")||
            temp.equals("-")||
            temp.equals("*")||
            temp.equals("/")||
            temp.equals(".")||
            temp.equals("=")){
            }*/
            btn.addActionListener(this);
            jp_center.add(btn);
        }
        this.add(jp_center,BorderLayout.CENTER);
    }
    public static void main(String[] args) {
        Carculator carculator = new Carculator();
        carculator.setVisible(true);
    }
        private String firstInput = null;
        private String operator = null;

        @Override
        public void actionPerformed(ActionEvent e) {
           String clickStr =  e.getActionCommand();
           if(".0123456789".indexOf(clickStr)!= -1) {
               this.input_text.setText(input_text.getText() + clickStr);
               this.input_text.setHorizontalAlignment(JTextField.RIGHT);
               //JOptionPane.showMessageDialog(this, clickStr);
           }else if(clickStr.matches("[\\+\\-*/]{1}")){
               operator = clickStr;
               firstInput = this.input_text.getText();
               this.input_text.setText("");
           }else if(clickStr.equals("=")){
               Double a = Double.valueOf(firstInput);
               Double b = Double.valueOf(this.input_text.getText());
               Double result = null;
                switch (operator){
                    case "+":
                        result = a + b;
                        break;
                    case "-":
                        result = a - b;
                        break;
                    case "*":
                        result = a * b;
                        break;
                    case "/":
                        if (b != 0){
                            result = a / b;
                        }
                        break;
                }
                this.input_text.setText(result.toString());
           }
        }
}
