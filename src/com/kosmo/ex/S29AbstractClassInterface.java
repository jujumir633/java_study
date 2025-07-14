package com.kosmo.ex;

public class S29AbstractClassInterface {
    /*

자바 추상 클래스(Abstract Class)와 추상 메서드(Abstract Method)

1. 추상 클래스란?
	•	abstract 키워드를 사용하는 클래스
	•	불완전한(미완성된) 설계도 역할
	•	직접 객체 생성 불가
	•




new AbstractClass(); // 에러


	•	일반 필드와 메서드를 포함할 수 있음

int a = 10; // 필드 가능
public void sum(int a) { ... } // 일반 메서드는 가질 수 있음


	•	추상 메서드를 포함할 수 있음
→ 자식 클래스가 반드시 구현해야 함 (오버라이딩 강제)

⸻

2. 추상 메서드란?
	•	abstract 키워드 사용
	•	본문(바디 {})이 없는 메서드 선언
	•	실제 동작은 자식 클래스에서 반드시 구현해야 함

abstract public void sum(); // 추상 메서드



⸻

3. 추상 클래스 예제 설명

abstract class AbstractClass {
    int a = 10;

    abstract public void sum(); // 추상 메서드: 자식이 구현해야 함

    public void sum(int a) {
        System.out.println(a);
    }
}

	•	추상 클래스 내부에는 일반 필드 int a, 일반 메서드 sum(int a)가 존재
	•	추상 메서드 sum()은 자식 클래스가 반드시 오버라이딩해야 함

⸻

4. 자식 클래스에서 추상 메서드 구현

class ChildClass extends AbstractClass {
    @Override
    public void sum() {
        System.out.println("추상 메서드를 구현한 함수");
    }

    @Override
    public void sum(int a) {
        super.sum(a); // 부모의 일반 메서드 호출
        System.out.println("안녕!");
    }
}

	•	추상 메서드 sum()을 자식이 반드시 구현해야 함 (@Override)
	•	일반 메서드 sum(int a)도 오버라이딩 가능
→ super.sum(a)로 부모 메서드 호출 후 추가 동작 수행

⸻

5. 메인 클래스

public class L30Abstract {
    public static void main(String[] args) {
        new ChildClass(); // 추상 클래스는 객체 생성 불가, 자식 클래스는 가능
    }
}

	•	추상 클래스는 객체 생성 불가 (new AbstractClass();는 오류)
	•	자식 클래스는 완성된 설계도이므로 객체 생성 가능

⸻

✅ 핵심 요약

항목	설명
추상 클래스	객체 생성 불가. 추상 메서드 포함 가능. 일반 필드/메서드도 포함 가능
추상 메서드	구현(본문)이 없는 메서드. 자식 클래스에서 반드시 오버라이딩 필요
상속 목적	자식 클래스에게 메서드 구현을 강제함
오버라이딩	자식 클래스가 부모의 메서드를 재정의해서 사용
물론입니다. 자바의 추상 클래스, 추상 메서드, 인터페이스 관련 개념을 확인할 수 있는 객관식 문제 10개를 아래에 구성해 드립니다.

⸻


자바 인터페이스 (Interface) 정리

1. 인터페이스란?
	•	interface 키워드로 정의
	•	완전한 미완성 설계도
	•	클래스처럼 객체를 만들 수는 없지만, 구현(implements)을 통해 기능을 강제할 수 있음
	•	다중 구현(multiple implements) 가능
	•	주로 기능 중심의 이름에 ~able 접미어를 붙임 (예: Flyable, Swimmable)

⸻

2. 인터페이스의 특징

✅ 메서드 관련
	•	모든 메서드는 자동으로 public abstract (따라서 생략해도 동일)
	•	본문(구현부 {})이 없는 추상 메서드만 선언 가능
	•	자바 8 이후부터는 default, static 메서드는 구현 가능 (예외적인 경우)

void fly(); // 실제로는 public abstract void fly();

✅ 필드(변수) 관련
	•	모든 필드는 자동으로 public static final 상수
	•	인스턴스 변수 선언 불가 (즉, 상태 저장 불가)
	•	충돌 방지를 위해 필드는 거의 사용하지 않음

int a = 10; // 자동으로 public static final


⸻

3. 다중 구현 (Multiple Interface Implementation)
	•	클래스는 여러 인터페이스를 implements로 동시에 구현 가능
	•	각 인터페이스의 추상 메서드는 모두 구현해야 함
	•	필드 이름이나 메서드 시그니처가 충돌하지 않는 한 가능

class Dock implements Flyable, Swimmable {
    public void fly() { }
    public void swim() { }
}

❌ 만약 다중 상속이었다면?
	•	두 부모 클래스가 같은 필드/메서드를 가지면 모호성이 발생하여 컴파일 에러
	•	자바는 그래서 다중 상속을 금지, 대신 인터페이스의 다중 구현은 허용

⸻

4. 인터페이스 사용 예

public class L31Interface {
    public static void main(String[] args) {
        System.out.println(Flyable.a); // 10
        // 인터페이스 변수는 static 이므로 객체 없이 접근 가능
    }
}


⸻

✅ 핵심 요약

항목	        설명
정의	        interface 키워드로 선언, 기능 명세서 역할
메서드	    모두 public abstract / 본문 없이 선언
변수	        모두 public static final / 상수만 가능
객체 생성	    불가
다중 구현	    가능 (implements Interface1, Interface2)
사용 목적	    클래스에 특정 “기능”을 강제할 때


⸻




📘 추상 클래스 & 인터페이스 문제 10제

문제 1

다음 중 abstract class에 대한 설명으로 옳은 것은? C번

A. abstract 클래스는 객체를 생성할 수 있다
B. abstract 클래스는 반드시 추상 메서드를 포함해야 한다
C. abstract 클래스는 일반 메서드와 필드를 가질 수 있다
D. abstract 클래스는 인터페이스만 상속할 수 있다

⸻

문제 2

추상 메서드에 대한 설명으로 틀린 것은? D번

A. 메서드 바디({})를 가질 수 없다
B. 자식 클래스에서 반드시 오버라이딩해야 한다
C. abstract가 붙으면 클래스도 무조건 추상 클래스여야 한다
D. private abstract 메서드는 정의할 수 있다

⸻

문제 3

다음 중 추상 클래스를 올바르게 정의한 코드는? C번

A. abstract class A { void show(); }
B. class A { abstract void show(); }
C. abstract class A { abstract void show(); }
D. abstract void show();

⸻

문제 4

다음 중 추상 클래스와 인터페이스의 공통점이 아닌 것은? C번

A. 객체를 직접 생성할 수 없다
B. 모두 추상 메서드를 가질 수 있다
C. 생성자를 정의할 수 있다
D. 자식 클래스에서 메서드 구현을 강제할 수 있다

⸻

문제 5

다음 코드의 실행 결과는? A번

abstract class Parent {
    abstract void greet();
}

class Child extends Parent {
    void greet() {
        System.out.println("Hello");
    }
}

public class Main {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet();
    }
}
//// Parent p = new Parent(); 이것은 안됨
A. Hello
B. 컴파일 에러
C. 런타임 에러
D. 아무 출력 없음

⸻

문제 6

다음 중 인터페이스의 특징으로 옳은 것은? C번

A. 생성자를 정의할 수 있다
B. 인스턴스 필드를 가질 수 있다
C. 인터페이스는 다중 구현이 가능하다
D. 인터페이스 메서드는 모두 private이다

⸻

문제 7

인터페이스에 선언된 메서드는 자동으로 어떤 키워드를 갖는가? C번

A. private static
B. public final
C. public abstract
D. protected abstract

⸻

문제 8

다음 중 인터페이스에서 선언 가능한 것은? A,C,D번

A. int x = 10;
B. private int y;
C. abstract void run();
D. static void method();

⸻

문제 9

다음 중 올바르게 추상 클래스를 상속하고 추상 메서드를 구현한 것은? B번

A.

abstract class Animal {
    abstract void sound();
}
class Dog extends Animal { }

B.

abstract class Animal {
    abstract void sound();
}
class Dog extends Animal {
    void sound() {
        System.out.println("멍멍");
    }
}

C.

abstract class Animal {
    void sound();
}
class Dog extends Animal {
    void sound() { }
}

D.

abstract class Animal {
    void sound() {}
}
class Dog extends Animal {
    void sound() {}
}


⸻

문제 10

다음 중 자식 클래스에서 반드시 구현해야 하는 경우는? D번

A. 부모 클래스에 private 메서드가 있을 때
B. 부모 클래스에 static 메서드가 있을 때
C. 부모 클래스에 final 메서드가 있을 때
D. 부모 클래스에 abstract 메서드가 있을 때

⸻


1번: C, 2번: D, 3번: C, 4번: C, 5번: A, 6번: C, 7번: C, 8번: A, 9번: B, 10번: D*/
}