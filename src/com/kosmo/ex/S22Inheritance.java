package com.kosmo.ex;

// 부모가 name을 초기화 하도록 구현하세요
// 자식 클래스가 문제가 생기면 해결하세요
class Young {
    String name="아빠";
    int age=40;
    String gender="남";
    public Young(String name){
        this.name=name;
    }

    public String toString() {
        return "이름은 :" + this.name + "   나이는 :" + this.age + "   성별은:" + this.gender + " 입니다";
    }
}


class Ju extends Young {
    String name="누구";
    Ju(String name){
        super(name);
        this.name=name;
    }

    public String toString() {
        return "이름은 :" + this.name + "   나이는 :" + this.age + "   성별은:" + this.gender + " 입니다";
    }
}



public class S22Inheritance {
    public static void main(String[] args) {
        Young s =new Young("나야");
        System.out.println(s);
        Ju p=new Ju("몰라");
        System.out.println(p);

    }
}




