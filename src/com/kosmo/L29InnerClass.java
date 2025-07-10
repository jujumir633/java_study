package com.kosmo;

class Out{
    //static : 클래스변수, 메소드(**독립적,객체와 관련이 없음)
    int a=10;
    In in=new In();

    static int b=20;



    class In{ //inner class : 내부클래스
        //내부클래스 : class 내부에서만 사용하려고 만든 자료형
        //Out.java => Out.class
        //Out$In.class
        int score;
        String num;
    }
    static class A{} //정적 내부 클래스 : 밖으 클래스의 이름만 가져다 쓰는 독립적 class
}



public class L29InnerClass {
    public static void main(String[] args) {
        // In in=new In(); 내부클래스는 외부 클래스에 소속된 형태로(독립적이지 않다) 생성안됨
        Out out=new Out();
        Out.In in=out.new In(); //이렇게 사용하는 목적이 아니다(작성이 불편)
        System.out.println("인너클래스시작");
        System.out.println(out.a);
        System.out.println(out.b);

        Out.A a=new Out.A(); //호출 가능

    }

}

