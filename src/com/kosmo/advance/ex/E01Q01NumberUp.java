package com.kosmo.advance.ex;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BtnHandler implements ActionListener {
    private JLabel label;

    public BtnHandler(JLabel label){
        this.label=label;
    }
    //건물의 기초설계
    //필드,생성자(객체의 초기값 정의),함수
    //int a=10; //new BtnHandler().a => 10
    // 다른 클래스를 그대로 가져와 사용하고 싶다!! ==> extends
    // 건물을 만들고 싶은데 기초설계도(interface 구현x)를 가져오고 싶어==>implements
    //void sum(int a,int b){} //함수 new BtnHandler().sum(10,20) -->받고싶은것으로 변경가능

    @Override//콜백함수의 설계도 ==콜백함수
    public void actionPerformed(ActionEvent e) {
        //클릭을 했을때 동작됨
        // 1. label 을 클래스 멤버로 변경
        // 2. BtnHandler 생성자에 전달
        // 3. BtnHandler 를 사용하지 않고 람다식이나 익명클래스 사용!!
        // 변수는 클래스 변수, 멤버변수, 지역변수 로 나눈다
        //

        String num=label.getText(); //getText(); 문자열을 가져올때 쓰는 메서드
        int i=Integer.parseInt(num); //문자를 숫자로 바꿈
        label.setText(i+1+"");

    }
}

public class E01Q01NumberUp {

    public static void main(String[] args) {
        //swing 이라는 GUI 으로 만듬
        JFrame frame=new JFrame("숫자증가");

        //hd : 1980 x 1080 중 200x200을 쓰겠다
        JLabel label=new JLabel("0",SwingConstants.CENTER); //SwingConstants.CENTER 가운데 센터로 정렬
        JButton btn=new JButton("숫자1씩증가");

        btn.addActionListener(new BtnHandler(label)); //ActionListener 는 인터페이스 이기 때문에 콜백함수를 써야됨



        label.setFont(new Font("맑은 고딕",Font.BOLD,30)); //폰트변경 및 사이즈 변경

        frame.add(btn, BorderLayout.NORTH);     //실제 창에 버튼을 보여짐 생성
        frame.add(label,BorderLayout.CENTER);   //실제 창에 라벨 보여짐 생성

        frame.setSize(200,200); //크기
        frame.setLocation(100,100); //위치
        frame.setVisible(true); // 창을 보여줌
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //혹은 숫자2번 넣어도



    }
}

// 이건 익명클래스로 만든 코드

   /*public class TNumUp {
    public static void main(String[] args) {
        //swing 이라는 GUI 으로 만듬
        JFrame frame=new JFrame("숫자증가");

        //hd : 1980 x 1080 중 200x200을 쓰겠다
        JLabel label=new JLabel("0",SwingConstants.CENTER); //SwingConstants.CENTER 가운데 센터로 정렬
        JButton btn=new JButton("숫자1씩증가");

        //인터페이스는 클래스의 가이드라인 이기 때문에 객체가 될수 없다.
        //오직 클래스만 객체가 될 수 있다.
        // class 1 implements ActionListener{} 익명 클래스 생성(컴파일러) 아래처럼 하면
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String i=label.getText();
                int s=Integer.parseInt(i);
                label.setText(s+1+"");
            }
        }); //ActionListener 는 인터페이스 이기 때문에 콜백함수를 써야됨



        label.setFont(new Font("맑은 고딕",Font.BOLD,30)); //폰트변경 및 사이즈 변경

        frame.add(btn, BorderLayout.NORTH);     //실제 창에 버튼을 보여짐 생성
        frame.add(label,BorderLayout.CENTER);   //실제 창에 라벨 보여짐 생성

        frame.setSize(200,200); //크기
        frame.setLocation(100,100); //위치
        frame.setVisible(true); // 창을 보여줌
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE); //혹은 숫자2번 넣어도*/
