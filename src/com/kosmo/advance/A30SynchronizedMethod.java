package com.kosmo.advance;

class Game{
    int x; //AtomicInteger 를 사용해도 완전히 안전한 공유자원이 될 수 없음
    int y;
    public synchronized void incrementX(){
        x++;
    }

    class MoveThread extends Thread{
        public void run(){
            for(int i=0; i<500000; i++){
                //1.번 외부에서 싱크로나이즈드 된 함수 불려오기 incrementX();
                synchronized (Game.this){ //2. 싱크로나이즈드로 감싸기
                    x++;
                }
            }
        }
    }
    public Game() throws InterruptedException {
        //1. Thread 재정의
        Thread t1=new MoveThread();
        Thread t2=new MoveThread();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(x);

    }
}


public class A30SynchronizedMethod {
    public static void main(String[] args) {
        try {
            Game game=new Game();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }

}
