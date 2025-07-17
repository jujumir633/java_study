package com.kosmo.advance;

//Frame 만드는 법
// 1. class를 따로 만들고 Frame을 상속 받는다.
// 2. 추가할 컴포넌트를 필드로 정의 => 이벤트와 같은 내부 클래스에서 필드를 참조하기 좋다.
// 3. 생성자를 만들어서 정의

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Counter extends JFrame{
    private int num=0;
    private JLabel label; // =new JLabel(num+"");
    private JButton btn;
    class BtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            num++;
            label.setText(num+"");
        }
    }

    public Counter(){
        super("카운터"); // new JFrame
        this.label=new JLabel(this.num+"",SwingConstants.CENTER);
        this.btn=new JButton("num++");
        btn.addActionListener(new BtnHandler());


        this.add(label);
        this.add(btn, BorderLayout.NORTH);
        this.setBounds(0,0,500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(2);
    }
}







public class A04Counter {
    public static void main(String[] args) {
        Counter c=new Counter();
        System.out.println(c);





    }
}
