package com.kosmo;

import java.util.Arrays;

public class L02Data {
    public static void main(String[] args) {
        //프로그램은 계산(연산)을 하거나 출력, 입력을 할 때 모든 것을 데이터로 저장 합니다
        //자바는 연산을 위해서 숫자 데이터(기본형,원시형)와 관리를 위한 자료형 데이터(자료형)로 나누어 저장합니다
        //수학적 연산
        //+-*/%>><<..
        //숫자 데이터(실수1.111, 정수 1,2)
        System.out.println(12.33); //실수
        System.out.println(13); //정수
        System.out.println(13/3);//4.33333333333
        //자바는 정수 데이터와 실수 데이터가 분리되어 있고 정수끼리 연산하면 정수만 반환합니다
        System.out.println(13.0/3.0); //4.3333333333333333333333333333
        //자바는 수를 표현할 수 있는 크기가 정해져있다
        System.out.println(13/3.0);
        //실수와 정수를 연산하면 실수의 결과가 반환(return) 됩니다

        // 자바는 참(1=true)과 거짓(0=false)을 표현하는 데이터 boolean 이 존재합니다
        // 비교연산자(A>B, < , ==, !=, >= , <=)
        System.out.println(1==1);
        System.out.println(10<1); //bool 조지 불 만듬(논리대수)
        System.out.println("A"); // 문자열 => 자료형
        System.out.println('A');
        //컴퓨터는 숫자만 다루기 때문에 모든 번호로 치환해서 사용함
        //파일 인코딩이 utf-8 : utf-8의 문자표를 이용해서 문자를 번호를 치환한다
        System.out.println((int)'A'); //'A' 문자 A 를 정수로 바꿔라
        // '' : 문자 데이터는 정수 데이터입니다

        //기본형(수) : 정수(int), 실수(float,double), 논리타입(boolean), 문자타입(char)
        System.out.println('A'+'A');
        //System.out.println(true+true) 자바 문법으로 불가능

        //자료형 데이터 : 데이터를 묶어서 관리
        int [] nums={80,82,100,99,70,100}; //배열 자료형
        System.out.println(Arrays.toString(nums));
        //int [] : 데이터 타입, 정수로 된 배열
        //nums : 생성한 데이터를 참조하는 이름 변수
        //배열 : 순서가 있는 자료형
        char [] arr={'H','e','l','l','o'};
        String str="Hello"; //문자열 자료형 (arr 와 str은 데이터가 같다)\
        System.out.println(str);
        str=new String(); //문자열의 자료형

    }
}
