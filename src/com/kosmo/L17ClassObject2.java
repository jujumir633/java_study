package com.kosmo;

//클래스 = 필드 , 생성자 , 함수(메서드) 를 가지고 있다
//

import java.util.Arrays;

public class L17ClassObject2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,4};
        System.out.println(nums.toString()); //[].toString()
        //toString() 기본값 : 데이터의 타입 + 객체가 저장된 주소 위치
        //toString : 객체의 정보를 출력하는 함수
        //Arrays : 배열을 돕는 클래스(필드,메서드)
        System.out.println(Arrays.toString(nums)); //[1,2,3,4]
        System.out.println(Integer.toHexString(2222)); //16진수

        Calculator c=new Calculator();
        Calculator c2=new Calculator("키티 계산기");
        System.out.println(c); //com.kosmo.Calculator@4e50df2e
        System.out.println(c.toString());//com.kosmo.Calculator@4e50df2e
        System.out.println(c);
        System.out.println(c2.name);
        System.out.println(c.name);


    }
}
//class : 필드로 자료만 저장하면 할수 있는 것이 별로없어
//자료가 동작이 있는면 할 수 있는 것이 더 많겠어 => 메서드
//메서드
// 1. 매개변수를 받는다.() => 동작을 제어, 동작에 필요한 데이터를 제공
// 2. 자신만의 영역이 필요 => scope{} 제공
// 3. 메서드의 이름이 있어야 호출이 가능
// 4. 결과를 반환해야한다 => return 과 반환타입을 작성할 수 있어야한다.



class  Calculator{
    String name=""; //필드 : 클래스 전역에 선언된 변수
    public Calculator(){} // 생성자 : 객체를 만들때 호출되는것, 클래스 이름 (파라미터){스코프 영역}
    public Calculator(String gag){
        //this.name : 필드 접근자(객체 자신을 접근), 변수나 파라미터의 이름이 같을 때 사용
        //객체의 필드인 name을 바꾸고 싶다
        //==생성자의 매개변수로 필드를 재정의(바꾼다)하고 싶다.
        this.name=name;

    }
    //생성자는 파라미터(매개변수)가 다른 것을 만들 수 있다.

    void a(){int a=20;}
    int b(){int b=30;
            return b; }




}