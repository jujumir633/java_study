package com.kosmo.advance;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Timer;
import java.util.TimerTask;

public class A13JavaUtilTimer {
    public static void main(String[] args){
        //1초 마다 현재 시간을 콘솔에 출력하는 어플
        //대부분의 무한반복문에 텀을 작성하는 이유: cpu 과다 사용(StackOverflow)을 막기위해
        Thread t=new Thread(()->{

        while (true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("오류났네!");
            }
            LocalTime now=LocalTime.now();
            System.out.println(now);
        }
        });
        //t.start();
        //쉬면서 스레드 생성하는 클래스 제공 : java.util.Timer
        Timer timer=new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("안녕 타이머");
                System.out.println(LocalDateTime.now());

            }
        },2000,1000);
        //delay 기간동안 쉬었다가 period 마다 실행(start 필요없음)

        System.out.println("스레드실행됨 잘했어");

        //Swing 의 스레드와 충돌 위험이 있어서 중복해서 사용하면 안됨







    }
}
