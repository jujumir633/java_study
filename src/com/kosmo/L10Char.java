package com.kosmo;

public class L10Char {
    public static void main(String[] args) {
        //char c='B' //문자표의 번호
        //아스키코드 0~127 : 영문자+키보드 문자표(컴퓨터에서 사용하기위해 최초로 만들어진
        //모든 문자표는 아스키코드를 포함
        //MS949 : 원도우 운영체제에서 사용
        //유니코드 : 국제표준 문자표(utf-8(1~4) , utf-16(2or4)
        //utf-8 : 1~4byte 문자를 표현, 이때 한글은 3byte @ 이모지 4byte
        //utf-16 : 2 or 4 byte 문자 데이터를 저장 한글 2byte @ 이모지 4byte
        System.out.println((int)'A'); //65
        System.out.println((int)'가'); //44032 ==>16진수
        // FF 1byte
        // A1F2 2byte
        // Integer : int 기본형을 돕는 랩퍼클래스
        System.out.println(Integer.toHexString(44032)); //ac00
        // 😍 자바는 문자를 2byte 까지 저장 가능 합니다
        String s="\uD83D\uDE0D";
        // \uD83D : 유니코드
        //자바의 문자는 2byte 고정크기다





    }
}
