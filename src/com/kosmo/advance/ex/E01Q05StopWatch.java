package com.kosmo.advance.ex;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class E01Q05StopWatch extends JFrame {
    JButton startBtn=new JButton("시작");
    JButton stopBtn=new JButton("멈춤");
    JLabel label=new JLabel("스탑워치",SwingConstants.CENTER);
    int n=0;
    boolean isStart=false; //스탑워치가 시작됨

    public E01Q05StopWatch(){
        super("스탑워치");
        label.setFont(new Font("",Font.BOLD,20));

//        stopBtn.addActionListener(e -> {
//            isStart=false;
//        });
//        startBtn.addActionListener(e -> {
//
 //            Runnable run=()->{  //새로 생성한 스레드가 호출할 함수
//                //무한반복문으로 0.01 초 쉬었다가 n을 증가
//                isStart=true;
//                while (isStart){
//                    try {
//                        Thread.sleep(10);
//                        ++n;
//                        //String.format() //문자열에 수를 추가해주는 포맷을 제공
//                        //"%.4f 입니다", 13.0
//                        String numStr=String.format("%.2f",n/100.0);
 //                       label.setText(numStr);
 //                   } catch (InterruptedException ex) {
 //                       System.out.println("오류");
 //                   }
 //               }
//
 //            };
 //           Thread t=new Thread(run);
 //           t.start();
//
 //        });

        //javax.swing.Timer : 분기(밀리초)가 있는 무한 반복문(이벤트 디스패치 스레드 EDT)
        //start, stop 으로 무한 반복문을 시작, 종료해야함.
        ActionListener timerHandler=(e)->{
            n++;
            String nStr=String.format("%.2f",n/100.0);
            label.setText(nStr);
        };

        Timer timer=new Timer(10,timerHandler);

        startBtn.addActionListener(e -> {
            timer.start();
        });

        stopBtn.addActionListener(e -> {
            timer.stop();
        });





        this.add(startBtn, BorderLayout.WEST);
        this.add(stopBtn,BorderLayout.EAST);
        this.add(label);

        this.setBounds(0,0,600,600);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

    }





    public static void main(String[] args){
        new E01Q05StopWatch();
    }



}
