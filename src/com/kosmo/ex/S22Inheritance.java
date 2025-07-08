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
/*
📘 자바 상속(Inheritance) & super() 생성자 호출 수업 정리

⸻

        1. 상속 기본 개념

✅ 정의
	•	상속(Inheritance): 기존 클래스(부모)의 필드와 메서드를 새로운 클래스(자식) 에 물려주는 기능
	•	extends 키워드 사용

✅ 용어 정리

용어	설명
부모 클래스	상속해주는 클래스 (superclass)
자식 클래스	상속받는 클래스 (subclass)
extends	상속을 명시하는 키워드
super	부모의 멤버 또는 생성자를 가리키는 키워드

⸻

        2. 필드 재정의 (이름 겹칠 때의 처리)

🔎 예시 코드

class Parent {
    String name = "부모";
    String birth = "1986-05-25";

    public String toString() {
        return "Parent{ name :" + this.name + ", birth :" + this.birth + " }";
    }
}

class Child extends Parent {
    String name = "자식"; // 필드 재정의 (부모의 name을 숨김)

    @Override
    public String toString() {
        return "Child{ name :'" + this.name + "', birth :'" + this.birth + "' }";
    }
}

✅ 개념 정리
	•	자식 클래스에서 부모와 같은 이름의 필드를 선언하면 → 부모 필드는 가려짐(숨겨짐)
	•	this.name → 자식 클래스의 name 참조
	•	부모의 name을 사용하고 싶으면 super.name 사용 가능

⸻

        3. super() 생성자 호출

🔎 예시 코드

class 슈퍼 {
    int a;

    슈퍼(int a) {
        this.a = a;
    }
}

class 디스 extends 슈퍼 {
    디스(int a) {
        super(a); // 반드시 부모 생성자를 호출해야 함
    }
}

✅ 개념 정리
	•	자식 객체가 생성되면 반드시 부모 객체도 함께 생성되어야 한다
	•	부모 클래스에 매개변수가 있는 생성자만 존재한다면 → 자식 클래스는 반드시 super(값)으로 호출해야 함
	•	자식 생성자에서 super()를 가장 먼저 호출해야 함 (자동 또는 수동)

⸻

        4. super 키워드의 용도 요약

사용 위치	의미
super()	부모 클래스의 생성자 호출
super.필드	부모의 필드 접근
super.메서드()	부모의 메서드 호출


⸻

        5. 실행 결과 요약

Parent p = new Parent();
System.out.println(p);
// 출력: Parent{ name :부모, birth :1986-05-25 }

Child c = new Child();
System.out.println(c);
// 출력: Child{ name :'자식', birth :'1986-05-25' }

→ 자식 클래스가 toString()을 오버라이딩 했기 때문에 Child 인스턴스는 자식 쪽 출력 형식으로 보여짐

⸻

        ✍️ 보충 설명
	•	자식 클래스가 부모의 생성자를 사용할 수 있는 이유는 super() 덕분
	•	필드 재정의는 변수 숨김(variable hiding)이라고 하며, 메서드 오버라이딩과는 다름

⸻
        */



