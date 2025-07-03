package com.kosmo;

import java.util.Scanner;

public class L12While {
    public static void main(String[] args) throws InterruptedException {
        //while 반복문 : 같은 동작을 반복 실행
        //현관에 형광등 : 사람이 지나가는지 검사 지나가면 on, 10초 후 off
        //while(true){반복 실행할 블럭}
        //특정한 조건 만큼 일하는 반복문
        //while(조건) {반복 실행할 블럭, 조건을 false로 만들 값 대입}
        //while(true){
        //    System.out.println("안녕");
        //}
        //보통 무한반복문을 이정 주기만 쉬도록 작성

       /* while (true){
            //실행 == Thread(실행하는 일꾼)
            Thread.sleep(1000); //밀리초
            //sleep : 실행을 잠시 쉬게함
            System.out.println("안녕");
        }*/

        int nums[]={11,22,33,44,55};

        //배열의 모든 자료를 검색하고 싶다.
        int i=0;
        while (i<nums.length){
            System.out.println(nums[i++]);
        }
        i=4;
        while (i>=0){
            System.out.println(nums[i--]);
        }

        //* int i=0; 선언문
        //* while(i<arr.length) 조건문
        //* i++; 증감문

        //do{}while(조건식) : 조건관 상관없이 첫번째는 무조건 실행

        Scanner scanner=new Scanner(System.in);
        //Scanner : 입력받는 클래스
        //자바를 실행하는 터미널에서 키보드 입력을 받겠다


        //문자열 입력 후 라인개행 즉 엔터를 하면 입력한 문자열을 가져옴)==input
        System.out.println("입력한 값은 :");
        String line=scanner.nextLine(); //입력을 기다리는 무한 반복문
        System.out.println("값은"+line+"입니다");

        Calculator v= new Calculator("잠자리");
        System.out.println(v.name);





    }
}
