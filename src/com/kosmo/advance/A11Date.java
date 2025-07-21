package com.kosmo.advance;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;
import java.util.Date; //자바의 초창기 시간 클래스
import java.util.TimeZone;

public class A11Date {
    public static void main(String[] args) {
        Date date=new Date(); //객체를 만드는 시점을 시간을 갖는다.
        System.out.println(date); //Mon Jul 21 11:49:17 KST(한국표준시간) 2025
        //UTC : 국제표준시간
        int y=date.getYear();
        int m=date.getMonth();
        int d=date.getDate();
        int w=date.getDay();

        System.out.println(y);
        System.out.println(m);
        System.out.println(d);
        System.out.println(w);

        String week []={"일요일","월요일","화요일","수요일","목요일","금요일","토요일"};
        System.out.println(week[w]);
        System.out.println(y+1900+"년");
        System.out.println(m+1+"월");
        System.out.println(d+"일");

        //특정 시간대의 시간 객체 생성법
        //자바 7버전 이하, Calendar(특전 시간대 호출)
        Calendar cal= Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));

        cal.set(2024,1,1,22,10,10);

        Date date2=cal.getTime();
        System.out.println(date2);

        //자바 8버전 이상, ZoneDateTime(특정시간대 생성)

        Date date3=Date.from(ZonedDateTime
                .of(2023,2,1,10,10,10,0 ,ZoneId.of("Asia/Seoul"))
                .toInstant()
        );
        System.out.println(date3);


        //수로 된 데이트 객체를 문자열로 출력 : SimpleDateFormat() 요거 많이씀
        // YYYY:년
        // MM : 월
        // DD : 일
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy년 M월 d일 H시 m분 s초"); //H가 대문자는 24시 시간
        Date date4=new Date();
        System.out.println(sdf.format(date4));
        String datestr="2002년 5월 5일 13시 13분 13초 001밀리초";
        //Date 객체로 생성
        int i=Integer.parseInt("13"); //문자열=>정수 형변환(파싱:오류가 발생할수 도 있지만 형변환)

        try {
            Date date5=sdf.parse(datestr);
            System.out.println(date5);
        } catch (ParseException e) {
            System.out.println("오류 떳네!");
        }

        // 유닉스 시간(최초의 소형 컴퓨터 운영체제 유닉스가 시간을 표기한 방법)
        // 유닉스가 만들어진 1970년 부터 밀리초로 시간을 표현
        // 시간을 문자열이 아닌 수로 정의 하기위해 등장(시간 비교가 편리)
        // 1970.1.1.0.0.0 ->0
        // 1970.1.1.0.1.0 ->1000 밀리초
        // 1970.1.1.1.0.0 ->1000*60 (1000 밀리초x60 = 1분)

        Date date6=new Date();
        System.out.println(date6.getTime()); //1753069644119

        long time=System.currentTimeMillis();
        System.out.println(time); //1753069644119

        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        sdf2.setTimeZone(TimeZone.getTimeZone("UTC"));
        String str="1970-01-01 00:00:00"; // 1000 x 60 x 60(1시간)
        try {
            Date date7=sdf2.parse(str);
            System.out.println(date7);
            System.out.println(date7.getTime());
        } catch (ParseException e) {
            e.printStackTrace();
        }

        long l=20000000;
        Date date8=new Date(l); //유닉스 시간
        System.out.println(date8);


    }
}
