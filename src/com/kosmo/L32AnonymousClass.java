package com.kosmo;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

interface Testable{
    void test();
}


public class L32AnonymousClass {
    //Testable 를 사용하기 위해 보통 내부클래스를 작성
    //
    class Test implements Testable {
        @Override
        public void test() {
            System.out.println("테스트 중입니다");
        }
    }

    void run() {
        Test t = new Test();
        t.test();
    }

    void run2() {
        //Testable 을 구현하지 않고 객체로 바로 만들고 싶어!!
        //Testable 을 구현한 객체를 한번만 쓰고 다시는 사용하지 않을 거야
        //그런데 Test 클래스를 만들 필요가 있을까??
        Testable t=new Testable(){            //추상클래스를 객체를 만들면 바디를 구현한 익명클래스가 몰래 만들어진다
            //익명클래스 개념
            //추상메서드를 포함하는 인터페이스나 추상클래스를 객체로 만들수 없는데
            //개발자 편의를 위해 추상메서드를 구현 하면서 객체를 생성하는 문법을 지원합니다
            //이때 추상메소드를 구현한 코드를  익명 클래스에 반영한다
            //L32AnonymousClass$1 ->숫자로 만들어짐 익명클래스(숫자이름)
            @Override
            public void test() {
                System.out.println("테스트 중입니다");

            }
        };
        //내(자바)가 그럼 바로 인터페이스를 객체로 만들어 줄께
        //대신 추상메서드를 객체 만들면서 바로 구현해!!
        t.test();
    }

        //Testable 을 사용하기 위해 보통 내부클래스를 작성

       static class BtnHandler implements ActionListener{
           @Override
           public void actionPerformed(ActionEvent e) {

           }
       }

        public static void main (String[]args){
            JButton btn=new JButton("클릭");
            btn.addActionListener(new BtnHandler());
            btn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    //버튼이 눌리는 기능
                }
            });


        }
    }
