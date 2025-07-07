package com.kosmo;

class Parent{
    String name="부모";
    String birth="1986-05-25"; //1986-05-25
    public String toString(){
        return "Parent{name :"+this.name+", birth :"+this.birth+"}";
    }
}

//extends : 상속
//상속 하는 대상을 부모, 상속받는 대상을 자식이라 부르고
//자식은 부모의 필드 모두를 물려받는다
class Child extends Parent{
    String name="자식";  //부모가 물려준 필드를 재정의 한다

    @Override
    public String toString() {
        return "Child{" +
                "name='" + name + '\'' +
                ", birth='" + birth + '\'' +
                '}';
    }
}




public class L22Inheritance {
    public static void main(String[] args) {
        Parent p=new Parent();
        System.out.println(p.name);
        System.out.println(p.birth);
        Child c=new Child();
        System.out.println(c.name);
        System.out.println(c.birth);
        System.out.println(c);


    }
}
