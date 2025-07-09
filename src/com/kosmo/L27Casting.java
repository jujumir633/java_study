package com.kosmo;

public class L27Casting {
    public static void main(String[] args) {
        //변수, 데이터
        //데이터 : 저장되는 것
        //변수 : 데이터를 담는것(참조)하는 것
        int a=10;  // 10이라는 정수 데이터, a라는 변수, =(참조 대입연산자)
        //변수를 사용하는 이유 : 데이터를 재사용 하려고

        Object object=new Object();
        Object 경민=new Object();
        //개발자간의 약속 카멜규칙이면 좋겠어.
        //참조=할당=대입 같은말
        //기본형 데이터 : 수로된 데이터 변수를 정의할때 무조건 소문자로 작성
        byte b=127; // 수(기본데이터)로 b 가 참조           {기본형}
        Byte bobj=127; //127을 객체로 만들어서 참조(대문자B) {자료형}
        //Byte,Short,Integer,Long,Float,Double,Character,Boolean
        //대문자로 쓰면 자료형(Integer, Character 두개 빼고)
        //기본형의 객체형태 : 기본형은 연산만 가능해서 도와줄 클래스가 필요함
        //랩퍼클래스가 존재합니다
        System.out.println(b);
        Integer iobj=10;
        int i=10;
        //기본형데이터가 => 자료형데이터로 형변환
        //변수가 자료형이면 자동으로 형변환됩니다
        //자료형 => 기본형(연산할때 자동으로, 나머진 불가능)
        ++iobj; //자동으로 형변환
        ++i;
        int i2=iobj; //대입연산 자동 가능
        double d=iobj; // 가능

        //작은 수가 큰수로 바뀔때 형변환
        i=10000000;
        long l=i; //작은 수를 큰 수로 바꿀 때(자동 형변환)
        l=100000000000000000l;
        float f=l; //실수(지수부) 데이터 타입이 정수 데이터 타입보다 더 큰수를 표현
        f=100000000000000000000000000000000000000f;
        d=f;

        i=32767;
        short s=(short)i; //큰수가 작은 수로 바뀔때 형변환(casting=강제형변환)
        System.out.println(s);  //만약 short 가 표현하는 숫자보다 예(32769)큰 수가 올때는 데이터 손실이 일어난다
        //거꾸로 반복하는 행위로

        d=1.0E300;  //8byte
        f=(float) d;    //4byte
        System.out.println(f); //결과 Infinity
        d=d*d*d*d*d*d*d;
        System.out.println(d); //결과 Infinity

        //실수는 데이터 손실이 일어났을 때 무한대(Infinity)
        char c='가';  //char => 정수로 형변환(인코딩 라벨의 번호를 출력)
        System.out.println((int)c);








    }
}
