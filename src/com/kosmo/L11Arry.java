package com.kosmo;

import java.util.Arrays;

public class L11Arry {
    public static void main(String[] args) {
        //배열 Array : 순서와 길이가 있는 자료형
        //자바의 배열 : 타입이 같은 자료가 순서와 길이가 있는 자료형, 고정길이 (변경이 안됨)
        // [] <== 배열
        // 자료형을 만들때는 꼭 new 연산자를 사용 => 자료를 메모리에 저장하겠다

        int [] nums=new int [5]; //{0, 0, 0, 0, 0}
        String [] strs=new String[3]; // {null, null, null}

        //[] Array : 메모리가 작고 기능이 최소화

        System.out.println(nums.toString());// [I@b4c966a
        System.out.println(strs); // [Ljava.lang.String;@2f4d3709

        // L => 참조형 데이터(자료형 객체

        // Arrays : array 를 도와주는 유틸 클래스(랩퍼런스 : 기본형)
        nums[0]=1;   // [index] : 순서(0부터 시작)
        nums[1]=10;
        nums[2]=100;
        nums[3]=1000;
        nums[4]=10000;
        //nums[5]=100000; //컴파일시 발견되지 않는 오류(런타임 오류, 무서운 오류)
        //런타임 오류가 발생하면 JVM이 멈춘다
        System.out.println(Arrays.toString(nums)); // [0, 0, 0, 0, 0]
        System.out.println(Arrays.toString(strs)); // [null, null, null]

        System.out.println(nums[3]);
        System.out.println(nums[2]);

        strs[0]="안녕";
        strs[1]="잘가";
        strs[2]="맛있게 드세요";
        System.out.println(strs[0]);
        System.out.println(strs[1]);






    }
}
