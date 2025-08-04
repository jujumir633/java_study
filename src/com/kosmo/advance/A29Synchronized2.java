package com.kosmo.advance;

public class A29Synchronized2 {
    public static int A=0; //공유자원

    public static final Object lcok=new Object();




    public static void main(String[] args) throws InterruptedException {
        // synchronized : 멀티스레드 환경에서 공유자원의 일관성 보장

        Thread t=new Thread(()->{
            for (int i=0; i<100000; i++){
                synchronized (lcok){

                    A++;
                }
            }
        });
        t.start();

        Thread t2=new Thread(()->{
            for (int i=0; i<100000; i++){
                synchronized (lcok){

                    A++;
                }
            }
        });
        t2.start();

        Thread t3=new Thread(()->{
            for (int i=0; i<100000; i++){
                synchronized (lcok){

                    A++;
                }
            }
        });
        t3.start();

        Thread t4=new Thread(()->{
            for (int i=0; i<100000; i++){
                synchronized (lcok){

                    A++;
                }
            }
        });
        t4.start();

        Thread t5=new Thread(()->{
            for (int i=0; i<100000; i++){
                synchronized (lcok){

                    A++;
                }
            }
        });
        t5.start();

        t.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
        System.out.println(A);  // 500000 == Synchronized(공유자원이 안전)
        //172922 , 154438 계속 바뀜 값나옴, 스레드간 동시에 하나의 상수를 작업하다 오류 생김
        // 기본형 데이터 타입이 제일 많이 문제를 일으킴!!
        // list.add(), Map.put(), Set....공유자원으로 안전하지 않음

        // 1. 안전한 타입사용 int => AtomicInteger, ArrayList =>Vector (다 못외움)
        // 2. synchronized 블럭을 사용 후 참조 => 가장 좋은 방법
        // 3. synchronized 된 메서드 사용(인스턴스의 메소드, static 메소드는 안됨)





    }
}
