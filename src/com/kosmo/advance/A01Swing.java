package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;

public class A01Swing {
    public static void main(String[] args) {
        //GUI(그래픽 유저 인터페이스) : OSX apple의 최초의 운영체제,window(애플모방) IOS(터치) 모바일
        //IOS(터치) 모바일 => 구글안드로이드
        //CLI(커맨드 라인 인터페이스)

        //자바! 플랫폼에 독립적으로 원도우를 구현(MAC,Window)
        //window

        JFrame f=new JFrame(); // awt 패키지
        //BorderLayout

        f.setBounds(1000,200,900,500);

        //Label : 글자를 추가하는 컴포넌트
        JLabel l = new JLabel("안녕");
        JLabel l2 = new JLabel("잘가");

        //컨테이너에 컴포넌트를 추가하는 함수 add
        f.add(l,BorderLayout.NORTH);
        f.add(l2,BorderLayout.CENTER);


        f.setVisible(true);

        //JFrame : swing 패키지
        //awt 패키지가 나온지 오래되어서 플랫폼에 일관성이 부족해짐
        //이를 보완하기 위해 java 1,2 에서 swing 을 발표
        //java FX java6 버전(swing 후속작), html 같은 스타일 적용이 가능
        //awt(AWT = Abstract Window Toolkit), swing,fx 패키지 대표적

        //컨테이너와 컴포넌트
        //swing 에는 Container 를 구현하는 클래스와 Component를 구현하는 클래스로 나뉜다.
        //컨테이너 클래스는 컴포넌트를 포함하기 위해 존재
        //컨테이너에는 레이아웃(Layout Manager) 매니저라는 클래스가 포함되는데
        //컴포넌트의 위치를 조정한다.


    }
}
