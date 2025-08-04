package com.kosmo.advance;

public class A28Synchronized {
    public static int A=0;

    public static void main(String[] args) throws InterruptedException {
        // synchronized : 멀티스레드 환경에서 공유자원의 일관성 보장
        // !=스레드간 비동기와 다른 뜻

        // 스레드간 비동기

        int a=0;
        for (int i=0; i<10; i++){
            a++;
        }
        System.out.println(a);
        //스레드가 1개라 코드간의 동기화(위에 코드가 끝나면 아래코드가 실행 : 실행 결과가 예상됨)

         a=0;

        Thread thread=new Thread(()->{
            for (int i=0; i<10; i++){
                A++;
            }

        });  //새로운 일꾼 만들어서 할일 정의
        thread.start();

        thread.join(); // thread의 일꾼이 일을 끝날때까지 메인 일꾼은 기다려!!
        //요게 없으면 메인 일꾼이 thread 일꾼이 일을 끝나기 전에 아래 코드 실행됨

        System.out.println(A);
        // A가 10이면 멀티스레드간 동기화 됨
        // A가 10이 아니면 멀티스레드간 비동기화 됨






    }
}
