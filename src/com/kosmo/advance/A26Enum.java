package com.kosmo.advance;

import javax.swing.*;
import java.awt.*;

// 인터페이스 내부에 정의된 전역변수가 클래스 멤버로 상수가 되는지 설명
interface Direct{
    int NORTH=0;  //public static final
    int SOUTH=1;
    // 인터페이스 내부의 필드는 왜??? public static final 이 붙을까?
    // 인터페이스 필드(인스턴스의 정보)를 가질 수 없다
    // 때문에 인터페이스 내부에 정의된 변수는 자동으로 static 필드인 클래스 멤버가 된다
    // void sum(); 인터페이스 내부 메소는 앞에는 public 이 자동으로 붙는다
    // 클래스 멤버는 정적메모리에 저장, 누구나 접근 후 바꿀 수 있음 => 문제를 야기할수 있음

}

enum DirectEnum{
    // 타입, 접근지정자, 상수를 작성할 필요가 없다
    WEST, EAST;
}


public class A26Enum {
    // Direct d=new Direct();  인터페이스는 설계도일 뿐이지 객체가 될수 없다
    Direct d = new Direct() {}; //익명클래스가 객체가 됨


    public static final int NORTH=10;
    public static final int SOUTH=11;


    public static void main(String[] args) {
        // 열거형 enum == 타입 : 정보로서의 상수 정의용
        // 상수(Constant, cont) : 처음 참조한 값을 바꾸지 못하는것
        // 변수(Variable, val) : 참조한 값을 계속 바꿀 수 있는 것

        int r=2;
        System.out.println(Math.PI);
        System.out.println(r*2*Math.PI);
        // public static final double PI =3.141592653589793
        // public : 다른 패키지 누구나 다 사용
        // static : 클래스멤버, JVM이 시작될때 데이터가 되어라! , 정적 메모리 영역인 메소드 영역에서 계속


        // 상수의 목적
        // 1. 데이터의 상태를 나타내기 위해

        new JFrame().add(new JButton(), BorderLayout.NORTH);
        int code=0;
        switch (code){
            case A26Enum.NORTH -> System.out.println("위로이동");
            case A26Enum.SOUTH -> System.out.println("아래로이동");
        }
        // 정수로 상태를 표현하면 조건의 분기 타입을 어떤 것이든 사용가능하게 됨!
        // 고유 상태를 갖는 상수 타입을 만들자! -> enum

        DirectEnum direct=DirectEnum.EAST;
        switch (direct){
            case EAST -> System.out.println("위로");
            case WEST -> System.out.println("아래");
        }

        //switch : 조건으로 기본형데이터와 문자열과 열거형(enum)외의 자료형을 사용할수 없음










    }
}
