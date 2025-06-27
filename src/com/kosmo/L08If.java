package com.kosmo;

public class L08If {
    public static void main(String[] args) {
        //조건문 if : 프로그램의 분기를 만들때 사용합니다
        //if(논리형)

        int b=10;
        if(b>=10) System.out.println("a는 10보다 크거나 같네요");
        //scope 내부에 코드가 한줄일때 생략가능
        if(b<0){
            System.out.println("a 음수 입니다");

        }else {//위 조건이 false 이면
            System.out.println("a는 양수입니다");
        }
        //if(1+10){} // 결과가 논리형인 경우만 작성가능
        //if(1){} : 1==true 라 생각 하는 언어는 가능 (자바는 불가능)
        //if("안녕"){} : 존재하는 것은 true라 하는 언어(자바는 불가능)
        //if(조건){조건이 true 일때}else{조건이 false 일때}

        //else if() : 분기가 복잡한 경우 사용
        //형제 블럭 : 형제간에 변수를 접근할 수 없다

        int score=75;
        if (score > 90) {
            System.out.println("성적은 A입니다");
        }else if(score>=80) {
            System.out.println("성적은 B입니다");
        }else if(score>=70) {
                System.out.println("성적은 C입니다");
        }else if(score>=60) {
            System.out.println("성적은 D 입니다");
        }else if(score>=50) {
            System.out.println("성적은 F 입니다");
        }

        int a=-3;
        if(a>100) {
            System.out.println("성적을 다시 입력 하세요");
        }else if(a>=90) {
            System.out.println("성적은 A입니다");
        }else if(a>=80) {
            System.out.println("성적은 B입니다");
        }else if(a>=70) {
            System.out.println("성적은 C입니다");
        }else if(a>=60) {
            System.out.println("성적은 D입니다");
        }else {
            System.out.println("성적은 F 입니다");
        }









        }


        }
