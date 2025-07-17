package com.kosmo;

public class L41StringBuffer {
    public static void main(String[] args) {
        // Array vs List
        // Array 가 불변데이터기 때문에 List가 나음
        // 가변길이의 문자열은 StringBuff 를 사용해야 합니다
        // buffer : 임시저장공간

        StringBuffer sb=new StringBuffer("안녕");
        sb.append("난 경민이야~"); //문자열 += 연산
        sb.append("오늘비가 많이 오는구나");
        System.out.println(sb);



        String s="A";
        s+="B"; //"A","B","AB"
        s+="C"; //"A","B","C", "AB", "ABC"

        sb=new StringBuffer("A");
        sb.append("B");
        sb.append("C");
        // 기존
        //

        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);


        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("A");
        stringBuilder.append("B");
        stringBuilder.append("C");
        System.out.println(stringBuilder);
        stringBuilder.reverse();
        System.out.println(stringBuilder);
        // StringBuilder vs StringBuffer 거의 비슷
        // StringBuffer 멀티스레드 환경에서 안전 : 멀티스레드 배우고 다시 등장할 예정

        //System : 자바를 실행하는 터미널 호출
        long start=System.nanoTime();
        long sum=1+1;
        long end=System.nanoTime();
        System.out.println(end-start); // 1+1 이 걸린시간

        start=System.nanoTime();
        String str="";
        for(int i=0; i<10000; i++){
            str+=i;
        }

        System.out.println(str);
        end=System.nanoTime();
        System.out.println("문자열 더하기 연산시간"+(end-start));


        start=System.nanoTime();
        stringBuilder =new StringBuilder();
        for(int i=0; i<10000; i++){
            stringBuilder.append(i);
        }
        System.out.println(stringBuilder);
        end=System.nanoTime();
        System.out.println("스트링빌더의 더하기 연산시간"+(end-start));


    }
}
