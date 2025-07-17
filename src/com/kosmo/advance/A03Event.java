package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class A03Event {
    static int num;
    static class BtnHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("버튼이 눌렀습니다");
        }
    }
    public static void main(String[] args) {
        //GUI 는 마우스 이벤트로 인터페이스가 구성됨
        //마우스 : 클릭, over(enter),leave,focus .... 많음
        JFrame frame=new JFrame("이벤트");

        JButton btn=new JButton("++num");
        int num=0;

        btn.addActionListener(new BtnHandler());
        //btn.addActionListener();
        //이벤트리스너 : (동작인식 형광등), 이벤트를 대기하고 있다가 정의한 동작을 실행
        //ActionListener : 버튼 클릭 이벤트
        //버튼을 누를때 동작(콜백함수)을 정의해서 매개변수로 전달
        //콜백함수 : 어떤 동작에 으해 호출된 함수(개발자가 임의로 실행하는 함수가 아님)

        JLabel label=new JLabel(num+"",SwingConstants.CENTER);

        //모든 컴포넌트를 Font 글자체를 변경가능
        label.setFont(new Font("나눔 고딕",Font.BOLD,50));

        frame.add(btn, BorderLayout.NORTH);
        frame.add(label,BorderLayout.CENTER);










        frame.setSize(500,500);
        frame.setLocation(1000,0);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);  //1,2,3번 모드도 있음
        frame.setVisible(true);


    }
}
