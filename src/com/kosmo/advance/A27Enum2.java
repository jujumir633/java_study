package com.kosmo.advance;

import java.time.LocalDate;
import java.util.Arrays;

class A{
    int a;
    int b;
    int c;
}

enum E{
    A,B,C
}

enum Day{
    MON("월요일"),
    TUES("화요일"),
    WED("수요일"),
    THU("목요일"),
    FRI("금요일"),
    SAT("토요일"),
    SUN("일요일");

    String koStr;
    String enStr;
    Day(){}

    Day(String koStr){
        this.koStr=koStr;
    }


    Day(String koStr,String enStr){
        this.koStr=koStr;
        this.enStr=enStr;
    }
    //toString() 이 필드명과 같은 것을 반환

}

class Plan{
    String txt;
    Day day;
    LocalDate date;

    public Plan(String txt, Day day, LocalDate date) {
        this.txt = txt;
        this.day = day;
        this.date = date;
    }
}


public class A27Enum2 {
    public static void main(String[] args) {
        A obj=new A(); //obj 필드안에는 {a:0 , b:0 , c:0}
        // obj 필드 전체를 탐색??
        // 자바는 객체 내부의 필드가 무엇이 있는지 알수 있는 방법이 없음
        E[] arr=E.values(); //enum 의 필드는 무엇이 있나 보기
        System.out.println(Arrays.toString(arr));
        Day[] arr2=Day.values();
        System.out.println(Arrays.toString(arr2));

        Plan plan=new Plan("일정",Day.FRI,LocalDate.of(2025,8,7));
        for (Day d:Day.values()){
            if(plan.day==d){
                System.out.println("목요일은 산책하면 안됨");
            }
        }
        System.out.println(plan.day); //목요일
        System.out.println(plan.day.koStr);
        System.out.println(plan.day.enStr);




    }
}
