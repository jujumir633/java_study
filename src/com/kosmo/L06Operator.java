package com.kosmo;

public class L06Operator {
    public static void main(String[] args) {
        int i=10;
        // 산술연산자(Aritmetic Operator) +,-,*,/,%
        System.out.println(i+10); //20
        System.out.println(i-3); //7
        System.out.println(i*7); //70
        System.out.println(i/4); //2
        System.out.println(i%3); //1
        //증강연산자 (증가+감소 Increment+Decrement)
        // b++, ++b, b--, --b
        System.out.println(i++);
        //증감연산자가 뒤에 있으면 앞에 연산을 먼저하고 증감
        System.out.println(i);
        System.out.println(--i);

        //대입연산자 (Assignment Operator)
        // = , += , -=, *= , /=, %=
        int a=10; //대입연산자
        a+=2;// a=a+2;
        System.out.println(a); //12
        a*=3;
        System.out.println(a); //36
        a%=5;
        System.out.println(a); //1

        // 비트연산자(Bitwise Operator)
        // ~보수연산, not 연산
        System.out.println(~0);
        // 0000 -> 11111
        // 1001 -> 0110
        System.out.println(~5);
        //쉬프트 연산
        // <<:왼쪽 쉬프트 연산
        // >>:오른쪽 쉬프트 연산
        //

        i=1;
        System.out.println(i<<1);
        // 0001 => 0010
        System.out.println(i<<2);
        // 0001 => 0100

        //합집합(더하기, OR) , 교집합(곱하기, AND)
        //0*0 = 0
        //1*0 = 0
        //1*1 = 1
        //1+1 = 1
        //1+0 = 1
        //0+0 = 0
        // 1010 & 0101 = 0000
        System.out.println(10&5);
        System.out.println(10&7);

        System.out.println(10|5);

        // XOR (Exclusive OR)
        // 0 ^ 0 = 0
        // 1 ^ 0 = 1
        // 0 ^ 1 = 1
        // 1 ^ 1 = 0
        // 예시 10 ^ 7
        // 1010
        // 0111
        // 1101 = 13



    }
}
