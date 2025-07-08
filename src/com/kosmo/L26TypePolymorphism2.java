package com.kosmo;

class P{
    void show(){
        System.out.println("안녕");
    }
}


class C extends P{
    //기능이 수천가지

}


class C2 extends P{
    //기능이 수천가지
}

// 객체 instanceof 타입 : 비교연산자 해당 객체가 어떤 타입인지 비교연산



public class L26TypePolymorphism2 {
    public static void main(String[] args) {
        C c=new C();
        C2 c2=new C2();
        P p;   //P클래스(부모)에서 p; 라는 변수 생성
        p=c;   // c 객체가 참조가능
        p.show();
        //타입의 다형성 : 부모타입의 변수로 객체를 참조
        //부모타입의 변수로 여러 객체를 참조할 수 있어서 편하다

        //부모타입을 참조하던 변수를 자식타입을 참조 하도록 바꾸는 것
        //캐스팅 형변환


        // 객체 instanceof 타입 : 비교연산자 해당 객체가 어떤 타입인지 비교연산
        String str ="안녕";
        System.out.println(str instanceof String);
        System.out.println(c2 instanceof C2);
        System.out.println(c2 instanceof P);
        System.out.println(c2 instanceof Object);




    }
}
