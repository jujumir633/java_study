package com.kosmo.advance.ex;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E01QNumberUp2 extends JFrame {
    JButton btn;
    JButton resetBtn;
    JLabel label;
    int num=0;




    public E01QNumberUp2(){
        // E01Q01NumberUp2 this=new E01QNumberUp2(); // this 의 실체
        // super(); // this.super=new JFrame(); 무조건 맨 상단에 자동완성!
        super("숫자증가 리셋");
        label = new JLabel("카운트",SwingConstants.CENTER);
        label.setFont(new Font("맑은고딕",Font.BOLD,20));
        super.add(label);

        btn = new JButton("시작");
        btn.addActionListener(e -> {
            ++num;
            label.setText(num+"");
        });

        resetBtn = new JButton("리셋");
        resetBtn.addActionListener(e -> {
            num=0;
            label.setText(num+"");
        });

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(btn); // 가상으로 만들어짐
        p.add(resetBtn); // 가상으로 만들어짐
        super.add(p,BorderLayout.NORTH);  // 실제 눈에 보여짐








        this.setSize(500,500);
        this.setLocation(20,20);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }












    public static void main(String[] args){
        new E01QNumberUp2();
    }
}
