package com.kosmo.advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class A15Input {
    public static void main(String[] args) throws IOException {
        //터미널의 문자열 입력을 자바 어플에서 받기
        InputStream in=System.in;
        //InputStream 에서 입력받는 함수 InputStream.read();
        //int a=in.read();
        //System.out.println(a);//try catch 로 예외처리를 해야하지만 예외 위임으로 처리
        //ABCD/n(엔터) => 입력
        //65 66 67 68
        //입력 출력은 기본적으로 1byte
        //데이터가 없으면 -1 or /n(enter) 일때 까지

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s = br.readLine();
        System.out.println(s);

        System.out.println("공란");

        in=System.in;
        int a=0;

        while ((a=in.read()) !=-1){
            System.out.println(a);
        }



    }
}
