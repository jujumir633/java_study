package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class A25MoveBlockCanvas extends JFrame {
    private Canvas canvas;
    int x=0;
    int y=0;
    int x2=0;
    int y2=50;
    Timer timer;
    final int WIDTH=550;
    final int HEIGHT=550;
    int keyCode=KeyEvent.VK_RIGHT;
    int keyCode2=KeyEvent.VK_RIGHT;



    class Mycanvas extends Canvas{
        public Mycanvas(){
            this.addKeyListener(new KeyAdapter() {
                @Override
                public void keyPressed(KeyEvent e) {
                    keyCode2=e.getKeyCode();
                }
            });



            this.addKeyListener(new KeyAdapter() {
                @Override

                public void keyPressed(KeyEvent e) {
                    keyCode=e.getKeyCode();

                }
            });
        }



        @Override
        public void paint(Graphics g) {
            g.setColor(Color.BLUE);
            g.fillRect(x,y,50,50);

            g.setColor(Color.RED);
            g.fillRect(x2,y2,50,50);
        }
    }



    public A25MoveBlockCanvas(){
        super("블럭을 움직이는 캔버스");
        this.setBounds(50,50,WIDTH,HEIGHT);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        canvas=new Mycanvas();
        canvas.setBackground(new Color(200,200,250));
        this.add(canvas);
        canvas.setFocusable(true);

        //0.1 초 마다 블럭을 오른쪽으로 이동 하는 방법
        // 1. 스레드를 만들고 0.1초 쉬었다가 블럭의 x를 오른쪽(++, +=10)으로 이동하고 새로그림(repaint)
        // 2. java.utill.Timer로 0.1초 분기마다 실행되는 스레드 생성 후
        // 3. javax.swing.Timer 로 EDT에게 0.1초 분기마다 실행되는 콜백함수 정의

        // 1,2번은 같고 3번은 다르다 [1,2는 멀티스레드, 3번은 원래 존재하는 EDT에게 일시킴 ]
        // 3번으로 해야됨

        timer=new Timer(100, (e)->{

            //x+=10;
            switch (keyCode){
                case KeyEvent.VK_RIGHT -> {
                    x+=10;
                    x2+=10;
                }
                case KeyEvent.VK_LEFT -> {
                    x-=10;
                    x2-=10;
                }
                case KeyEvent.VK_UP -> {
                    y-=10;
                    y2-=10;
                }
                case KeyEvent.VK_DOWN -> {
                    y+=10;
                    y2+=10;
                }

            }
            if(x<0) x=0;
            if (x > WIDTH - 50) x = WIDTH - 50;
            if (y < 0) y = 0;
            if (y > HEIGHT - 50) y = HEIGHT - 50;
            if (x2 < 0) x2 = 0;
            if (x2 > WIDTH - 50) x2 = WIDTH - 50;
            if (y2 < 0) y2 = 0;
            if (y2 > HEIGHT - 50) y2 = HEIGHT - 50;

            canvas.repaint();

        });
        timer.start();


    }

    public static void main(String[] args){
        SwingUtilities.invokeLater(()->{
            new A25MoveBlockCanvas();
        });
    }

}
