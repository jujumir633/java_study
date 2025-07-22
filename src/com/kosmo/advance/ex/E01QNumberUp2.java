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
        super("NumberUp2");
        label=new JLabel("카운터",SwingConstants.CENTER);
        label.setFont(new Font("",Font.ITALIC,20));
        btn=new JButton("증가버튼");
        super.add(label);
        super.add(btn, BorderLayout.NORTH);

        JPanel p = new JPanel();
        p.setLayout(new FlowLayout());
        p.add(btn);
        super.add(p,BorderLayout.NORTH);

        resetBtn=new JButton("리셋버튼");
        resetBtn.setFont(new Font("",Font.ITALIC,10));
        resetBtn.setPreferredSize(new Dimension(40,40));
        resetBtn.addActionListener(e -> {
            num=0;
            label.setText(num+"");
        });
        super.add(resetBtn,BorderLayout.SOUTH);


        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ++num;
                label.setText(num+"");
            }
        });


        this.setSize(500,500);
        this.setLocation(20,20);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }












    public static void main(String[] args){
        new E01QNumberUp2();
    }
}
