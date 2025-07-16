package com.kosmo;

public class L40String {
    public static void main(String[] args) {
        //문자열
        String s="안녕"; //문자열
        char[] s2={'안','녕'}; //"안녕"을 선언하면 생성되는 데이터
        //문자열==배열(공정길이, 불변데이터)
        //"AB" +"CD" => "ABCD"
        s+="잘가";
        System.out.println(s); // "안녕" 따로 "잘가" 따로 "안녕잘가" 따라 생성

        // + concat() : 배열을 더하는 함수 이름
        s=s.concat("!");
        s+="~";
        System.out.println(s);
        //문자열 더하기(+) 연산은 수의 더하기 연산보다 우선순위가 높다(먼저 연산)

        System.out.println("문자열"+2*2); //문자열4
        System.out.println("문자열"+2+2); //"문자열"+ 2를 자동형변환[문자열로] 따라서 문자열22로 출력
        System.out.println("문자열"+(2+2)); //더하기 연산은 소가로 로 구분해서 사용 주의

        // 문자열의 리터렬 표기법 : "" , 배열{}
        // 10, 10l, 10.0, 10.0f, true, false, '',

        //문자열 리터렬 표기법을 사용하면...
        // 같은 문자열을 새로만들면 새로만들지 않고 기존의 문자열을 참조
        // 문자열을 많이 사용하기 때문에 메모리를 절약하기 위해
        System.out.println("안녕"=="안녕"); //문자열, 배열은 불변, 리터렬은 기존것 참고
        System.out.println("안녕"==new String("안녕")); // 해시코드로 비교 , new 는 새로생성

        //문자열의 유용한 함수들
        String str="ABCDEFG";
        System.out.println(str.charAt(2));
        System.out.println(str.length());
        System.out.println(str.contains("E"));
        System.out.println(str.contains("Z"));
        System.out.println(str.contains("AB"));
        System.out.println(str.substring(1,3));
        System.out.println(str.substring(5,7));
        System.out.println();
        System.out.println(str.substring(1));
        //삭제 : x 안됨 List.remove()
        //수정 : x 안됨 List.set(index,obj)
        //더하기 : x 안됨 List.add(obj)
        //전체삭제 : x 안됨 List.clear()
        //정렬 : x 안됨 List.sort()
        //반복자 : x 안됨 List.iterator()

        for(int i=0; i<str.length(); i++){
            System.out.print(str.charAt(i)+",");
        }

        //for(char c:str){}  문자열 안됨
        //str.iterator(); 안됨

        System.out.println();

        int [] arr={10,20,30};
        for (int n:arr){             //배열 가능
            System.out.print(n+",");
        }


    }
}
