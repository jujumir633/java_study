package com.kosmo.advance;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class A12LocalDate {
    public static void main(String[] args) {
        //최적의 시간 객체 java.util.Date 가 사용하기 불편해서
        //1. 문자열 파싱이 편리함
        //2.
        // java 8에서 java.time.* 패키지 도입
        // LocalDate(날짜), LocalDateTime(날짜+시간), LocalTime(시간,날짜 무시)
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        //ISO-date 표기법 : 문자열로 날짜를 표기하는 공통된 규칙
        //2025-07-21T14:30:00 년-월-일T시:분:초
        //2025-07-21
        //14:30:00
        localDate=LocalDate.parse("2002-05-25");
        System.out.println(localDate);

        localDate=LocalDate.of(2012,12,25);
        System.out.println(localDate);
        //LocalDate 는 년 월 일 만 존재

        //LocalTime
        LocalTime localTime=LocalTime.now();
        System.out.println(localTime);
        localTime=LocalTime.parse("12:01:23");
        localTime=LocalTime.parse("12:21:23.111233");
        System.out.println(localTime);
        System.out.println(localTime.getHour());
        System.out.println(localTime.getMinute());

        localTime=LocalTime.of(1,12,50,111);
        System.out.println(localTime);
        //데이터베이스(데이터저장) => 가져온 데이터를 local* 로 파싱하면 편리함
        //날짜, 시간 Timestamp
        //날짜=> LocalDate
        //시간=> LocalTime
        //Timestamp => LocalDateTime

        LocalDateTime localDateTime=LocalDateTime.now();
        System.out.println(localDateTime); // 2025-07-21T14:54:09.590170200
        //parse
        //of
        System.out.println(localDateTime.getDayOfWeek()); // MONDAY
        //DateTimeFormatter : 심플데이트포맷 처럼 localDateTime 의 문자열 표기 변경
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy년 MM월 dd일");
        String dateStr=LocalDateTime.now().format(dtf);
        System.out.println(dateStr);

        //2025년 7월의 마지막 일자
        System.out.println(localDateTime.toLocalDate().lengthOfMonth());
        System.out.println(localDateTime.toLocalTime()); // 변경 가능 데이트타임 --> 타임 반대로도 가능

        //계산 날짜간의 비교나 계산
        //LocalDate 는 배열처럼 불변데이터

        LocalDate localDate3=localDate.plusDays(10);
        System.out.println(localDate3);




    }
}
