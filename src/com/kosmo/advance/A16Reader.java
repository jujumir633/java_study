package com.kosmo.advance;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A16Reader {
    public static void main(String[] args) throws IOException {
        InputStream inputStream=System.in;
        //인코딩 처리 및 2byte씩 받을 수 있는 InputStramReader 문자열 입력 스트림
        InputStreamReader reader=new InputStreamReader(inputStream);
        int a;
        String str="";
        StringBuilder sb=new StringBuilder();
        while ((a=reader.read()) !=-1){
            //break : 반복문 종료
            //continue : 반복문의 한구간만 건너뜀

            if((char)a=='\n') break;
            System.out.println(a+":"+(char)a);
            str+=(char)a;
            sb.append((char) a);
            //안녕
            //50504=안 //문자를 2byte 씩 처리
            //45397=녕
        }
        System.out.println(str);

        BufferedReader bufferedReader=new BufferedReader(reader);
        //buff로 한줄씩 받을 수 있음
        str=bufferedReader.readLine();
        System.out.println("버퍼로받은 한줄 :"+str);


        // Scanner : BufferedReader 보다 기능이 많고 inputStream 을 바로 변환가능
        Scanner scanner=new Scanner(System.in);
        str=scanner.nextLine();
        System.out.println("스캐너로 받은 한줄 :"+str);

        InputStream inputStream1=System.in;
        InputStreamReader inputStreamReader=new InputStreamReader(inputStream1);
        BufferedReader bufferedReader1=new BufferedReader(inputStreamReader);
        //BufferedReader 를 사용하기 위한 과정
        //1Byte -> 2Byte -> 2Byte 짜리 buffer 로 변환





    }
}
