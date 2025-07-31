package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;

public class A24Canvas extends JFrame {


    MyCanvas canvas=new MyCanvas();

    class MyCanvas extends Canvas{
        public MyCanvas(){
            this.setBackground(Color.PINK);
        }


        @Override
        public void paint(Graphics g) {
            g.setColor(Color.RED);
            g.drawLine(50,50,100,100);

            g.setColor(Color.YELLOW);
            g.fillArc(150,150,200,200,0,300);

        //이미지
        //    Image image=Toolkit.getDefaultToolkit().createImage("./이미지.jpg");
             Image image=new ImageIcon("./이미지.jpg").getImage();
             g.drawImage(image,300,300,50,50,this);




        }
    }

    public A24Canvas(){
        super("캔버스 수업");
        canvas=new MyCanvas();
        this.add(canvas);

        this.setBounds(0,0,500,500);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }
    public static void main(String[] args){
        new A24Canvas();
    }

}
