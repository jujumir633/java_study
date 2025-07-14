package com.kosmo;
//새(날아다니는) 를 구현
interface Flyable { //미완성 설계도에 able을 추가하는 경향이 있다
    //interface 완전한 미완성 설계도
    //1. 미완성 설계도기 때문에 메소드를 구현 할수 없다
    //   -. 메서드 바디없이 선언만 가능
    //2. 필드를 작성할 수 없다 : 다중 구현을 위해서
    //3. 무조건 공개된 함수만 작성가능

    int a=10; // 만약 필드를 작성하면 자동으로 static 으로 구현됨

    public void fly();
    //public void fly(int direct){
    //    System.out.println(direct+"날아라");
}



interface Swimmable{
    int a=100;
    void fly();
    void swim();   //무조건 public 만 쓸수있음 옆에는 생략되어있음
}

//인터페이스는 implements 로 구현을 강제한다.(다중구현이 가능)
//다중구현 : 데이터 충돌(필드=>작성불가)이나 구현간의 충돌(메서드=>추상메서드)이 없으면 가능
//**다중상속 : 부모들이 같은 이름의 필드나 메서드를 가지고 있다면 누구의 것을 사용할 지 알수 없다

/*  정상적인 방법 class Dockswim implements Swimmable{
    public void swim(){}
}

*/




//인터페이스는 implements 로 구현을 강제한다.(다중구현이 가능)
class Dock implements Flyable{
    public void fly(){}
    public void swim(){}
}







public class L31Interface {
    public static void main(String[] args) {
        System.out.println(Flyable.a);


    }
}
