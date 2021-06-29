package com.exam;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class GUIExample08 extends JFrame {
    public GUIExample08() {
        final JLabel label = new JLabel("此处显示鼠标右键点击的坐标");
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        this.add(label, BorderLayout.NORTH);
        this.setSize(300, 200);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e) {
                if (e.getButton() == MouseEvent.BUTTON1) {
                    int x = e.getX();
                    int y = e.getY();
                    String banner = "鼠标当前点击位置的坐标是" + x + "," + y;
                    label.setText(banner);
                }
            }
        });
        this.setVisible(true);
    }
    public static void main(String[] args) {
        new GUIExample08();
    }
}
