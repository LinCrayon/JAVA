package com.javapractice.calculator;

import com.linshengqian.util.Const;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/******************北面控件********************/
class Carculator extends JFrame implements ActionListener {
    private JPanel jp_north = new JPanel();
    private JTextField input_text = new JTextField();
    private JButton Backspace = new JButton("Backspace");
    public static final int FRAME_W = 400;
    public static final int FRAME_H = 300;
    public static final int SCREEN_W = Toolkit.getDefaultToolkit().getScreenSize().width;
    public static final int SCREEN_H = Toolkit.getDefaultToolkit().getScreenSize().height;

    public static int FRAME_X = (SCREEN_W - FRAME_W)/2;
    public static int FRAME_Y = (SCREEN_H - FRAME_H)/2;

    public static final String TITLE = "计算器";

    /******************中间控件********************/
    private JPanel jp_center = new JPanel();
    public Carculator() throws HeadlessException {

        this.init();
        this.addNorthComponent();
        this.addCenterButton();
    }

    //初始化方法
    public void init(){
        this.setTitle(TITLE);
        this.setSize(FRAME_W,FRAME_H);
        this.setLayout(new BorderLayout());
        this.setResizable(false);
        this.setLocation(FRAME_X,FRAME_Y);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    //添加北面控件
    public void addNorthComponent(){

        this.input_text.setPreferredSize(new Dimension(230,30));
        jp_north.add(input_text);
        this.Backspace.setForeground(Color.RED);
        jp_north.add(Backspace);

        Backspace.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                input_text.setText("");
            }
        });

        this.add(jp_north,BorderLayout.NORTH);
    }
    //添加中间的按钮
    public void addCenterButton(){
        String regex = "[\\+\\-*/.= S%立平]";
        String btn_text = "789/456*123-0.=+S%立平";

        this.jp_center.setLayout(new GridLayout(5,4,5,5));
        for(int i = 0 ; i < 20 ;i++){
            String temp = btn_text.substring(i,i+1);
            JButton btn = new JButton();
            btn.setText(temp);
            if(temp.matches(regex)){
                btn.setFont(new Font("粗体",Font.BOLD,16));
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
        }else if(clickStr.matches("[\\+\\-*/S平立%]{1}")){
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
                case "S":
                    result = Math.sqrt(a);
                    break;
                case "平":
                    result = a * a;
                    break;
                case "立":
                    result = a * a * a;
                    break;
                case "%":
                    if (b != 0) {
                        result = a % b;
                    }
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
