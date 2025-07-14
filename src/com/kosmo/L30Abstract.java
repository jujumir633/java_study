package com.kosmo;

abstract class AbstractClass{
    int a=10; //추상클래스는 필드를 가질수 있다
    //추상 클래스는 상속의 형태로 클래스에 포함되기 때문에 필드를 가질수 있다
    //상속은 부모 자식으로 우선순위가 존재한다

    //추상클래스 내부에서만 추상 메서드를 작성할수 있다
    abstract public void sum(); //추상 메소드는 바디가 없음{}요거
    //왜쓰나?
    //1. 추상클래스는 클래스를 만들기 위한 중간단계 설계도 =>미완성된 설계도이기 때문에 객체가 될 수 없다.
    //2. 상속받은 클래스가 추상 메서드의 구현을 강제한다

    public void sum(int a){
        System.out.println(a);
    }
}


//클래스는 완벽한 설계도기 때문에 미완성된 추상메서드를 포함할수 없다
class Childclass extends AbstractClass{
    //추상메서드를 재정의 하는 것도 오버라이드
    //오버라이드 : 부모가 정의한 메소드 대신 자식이 재정의한 메소드가 실행되도록 한다
    //1. 추상클래스를 상속받기 위해서는 부모 클래스의 메서드를 가져와서 재정의
    //2. 아니면 자식클래스도 추상클래스로 만들던가,,



    @Override
    public void sum() {

    }

    public void sum(int a){
        super.sum(a);
        System.out.println("안녕");
    }
}




public class L30Abstract {
    //abstract public void sum();
    //추상적인(구체적이지 않은) abstract 메소드
    public static void main(String[] args) {
        //new AbstractClass();  객체가 될수 없다
        new Childclass();


    }
}
