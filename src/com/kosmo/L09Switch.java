package com.kosmo;

public class L09Switch {
    public static void main(String[] args) {
        //Switch
        //else if 같은 분기가 많고 조건이 간단할때 작성하는 조건문
        //if 보다 연산 속도가 빠르다.

        int a=1;
        switch (a){
            case 0 :
                System.out.println("a는 0입니다");
                break;
            case 1 :
                System.out.println("a는 1입니다");
                break;
            case 2 :
                System.out.println("a는 2입니다");
                break;
            default:
                System.out.println("a는 0,1,2가 아닙니다");


        }
        //java 14 도입
        int weeknum=3; // 0월요일, 1 화 , 2 수 ....6 일요일
        String week=null; // 목요일
        switch (weeknum) {
            case 0 : week="월요일"; break;
            case 1 : week="화요일"; break;
            case 2 : week="수요일"; break;
            case 3 : week="목요일"; break;
            case 4 : week="금요일"; break;
            case 5 : week="토요일"; break;
            case 6 : week="일요일"; break;
            default: week="요일이 아닙니다";

        }

        System.out.println("오늘은"+week+"입니다!");

        //java 14에 도입된 스위치 문법
        // -> 를 사용하면 바로 변수가 데이터를 참조, break 생략 가능
        String weekStr=switch (weeknum){
            case 0->"월요일";
            case 1->"화요일";
            case 2->"수요일";
            case 3->"목요일";
            case 4->"금요일";
            case 5->"토요일";
            case 6->"일요일";
            default->"잘못된 요일 입니다";

        };
        System.out.println("오늘의 요일은 "+weekStr+"입니다");
        //switch는 변수의 동등비교만 가능합니다
        //변수의 데이터가 기본형(b,s,i,l,f,d,b,c)이어야 합니다. 자료형은 문자열(자바7부터)과 enum만 가능합니다
        //스위치가 제한은 많지만 분기의 가독성이 좋고  비교연산이 빠르다





    }
}
