package com.kosmo.ex;

import java.util.Arrays;
class Student {
    int score;
    int bread;

    public Student(int score,int bread) {
        this.score=score;
        this.bread=bread;
        score = 100;// 생성자 안에서 필드에 값 넣음
        bread = 3;
        System.out.println(score);// 생성자 안에서 필드 사용 가능
        System.out.println(bread);
        System.out.println("생성자호출");
        System.out.println("다같이");
    }
}


public class Song {
    public static void main(String[] args) {
        Student s = new Student(500,5);  // 생성자 호출
        System.out.println(s.score);// 생성자 끝난 후에도 필드 사용 가능
        System.out.println(s.bread);
    }
}













