package com.kosmo;

interface Aable{}

class Aimp1 implements Aable{}

class Aimp2 implements Aable{}
//제네릭은 해당 타입이(설계도,클래스) 객체가 될 때 필드나 매개변수의 타입을 구체화 시키면 좋겠어


class GenericClass<T>{
    Object o; //가장 추상화 된 필드
    Aable a;  //인터페이스로 일반화한 필드
    T t; //객체가 생성될때 전달된 제네릭으로 일반화한 필드



    void callGeneric(T t){ //new GenericClass<Number =>T>()
        System.out.println(t.toString());
    }



    void call(Object o){
        System.out.println(o.toString());
    }


    //매개변수 타입을 구체화
    void callAable(Aable a){ //부모 타입이 Aable 것은 호출 가능
        System.out.println(a.toString());
    }
}


class GenericExtends<T extends Number>{
    //제네릭 자체에 제한주기 extends Type : type의 자식만 제네릭으로 사용가능
    void call(T t){

    }

}

public class L36Generic { //제네릭,제네럭 : 일반화 하기(특징없애기),Object 타입을 구체화 시키기
    public static void main(String[] args) {
        GenericExtends<Double> d=new GenericExtends<>(); //Double, Long , Short 등 됨
        //String 안됨 문자열 안됨
        GenericClass<Integer> superG=new GenericClass<>();
        superG.callGeneric(10);



        GenericClass g=new GenericClass();
        g.call(12);
        g.call("안녕");
        g.call(1.36);
        //타입의 다양성 : 모든 객체의 부모인 Object 매개변수로 모든 객체를 받고 있습니다
        // 너무 조상 부모의 매개변수를 사용하면 오류를 동반할수 있음
        g.callAable(new Aimp1());
        g.callAable(new Aimp2());
        g.callAable(new Aable(){
            @Override
            public String toString() {
                return "안녕난제네릭이야";
            }
        });

        g.callGeneric("안녕 g");
        GenericClass<Number> g2=new GenericClass<>();
        //g2.callGeneric("안녕 g2");
        g2.callGeneric(10.3);
        g2.t=0;
        //g2.t="안녕"; 오류
        System.out.println(g2.t); //null


        GenericClass<String> g3=new GenericClass<>();
        g3.callGeneric("안녕g3");
        g3.callGeneric("12");

        //제네릭은 꼭 자료형 타입만 작성가능(기본형 불가)
        //오류남 : GenericClass<int> g4=new GenericClass<int>();





    }
}
