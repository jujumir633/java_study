package com.kosmo.ex;

public class S08IfAndSwitch {
    /*


## 1. 조건문이란?

* 프로그램 실행 흐름을 **조건에 따라 분기**시키는 구문
* 특정 조건을 검사해 참/거짓에 따라 서로 다른 명령을 수행할 때 사용

---

## 2. 자바 조건문 종류

### 1) `if` 문

* 가장 기본적인 조건문
* 조건이 참일 때만 코드 블록 실행

```java
if (조건) {
    // 조건이 참일 때 실행
}
```

---

### 2) `if-else` 문

* 조건에 따라 둘 중 하나 실행

```java
if (조건) {
    // 조건 참일 때
} else {
    // 조건 거짓일 때
}
```

---

### 3) `if-else if-else` 문

* 여러 조건을 순차적으로 검사할 때 사용

```java
if (조건1) {
    // 조건1 참
} else if (조건2) {
    // 조건2 참
} else {
    // 위 조건 모두 거짓
}
```

---

### 4) `switch` 문

* 변수의 값에 따라 여러 분기 처리
* `if-else if`보다 가독성 좋음 (특히 정수, 문자열 비교 시)

```java
switch (변수) {
    case 값1:
        // 실행문
        break;
    case 값2:
        // 실행문
        break;
    default:
        // 모든 case 해당 안될 때
}
```

* `case`는 상수값만 가능 (변수, 범위 불가)
* `break`를 통해 빠져나오지 않으면 **fall-through** 현상 발생

---

## 3. 조건식에서 사용할 수 있는 값과 표현식

* **조건식은 반드시 boolean 타입이어야 함**
  (즉, true/false 결과를 내는 식만 가능)
* 자바는 `if(1)` 또는 `if("문자열")` 같은 표현 불가
* 조건식 예:

  * 비교 연산자 (`==`, `!=`, `<`, `>`, `<=`, `>=`)
  * 논리 연산자 (`&&`, `||`, `!`)
  * 메서드 호출 결과가 boolean인 경우 등
0==0.0 true : 두개의 데이터 타입은 다르지만 같다
0.0==-0.0 true : 두개는 완전 다른 데이터지만 같다
---

## 4. 논리 연산자와 단락 평가(short-circuit evaluation)

* `&&`(AND), `||`(OR)는 **단락 평가**를 함 (&&은 1개라도 false 시 연산을 멈춘다)(||연산은 1개라도 true시 연산을 멈춘다)
* 예) `if (a != null && a.isEmpty())`
  → `a != null`이 false면 `a.isEmpty()`는 호출하지 않음 (NullPointerException 방지)
* `!`는 NOT 연산자

---

## 5. 조건문 사용 시 팁

* 조건을 명확하게 작성할 것
* 중첩 if문은 너무 깊지 않게 작성(복잡해짐)
* 가능하면 `switch` 문으로 가독성 개선
* 코드 블록은 항상 `{}`로 감싸는 습관 권장
* 조건식이 복잡하면 별도의 boolean 변수에 결과 저장해 사용 가능

---

## 6. 예외: 삼항 연산자 (조건식 축약)

* 조건에 따라 값을 선택하는 축약 문법

```java
int max = (a > b) ? a : b;
```

* 조건식 ? 참일 때 값 : 거짓일 때 값

---

## 7. 조건문과 관련된 자바 최신 문법

* **Java 14+부터 도입된 switch 표현식**

  * `switch`가 값으로 평가되어 변수에 바로 할당 가능

```java
int result = switch (score) {
    case 90, 100 -> 1;
    case 80 -> 2;
    default -> 0;
};
```

* `case` 뒤에 `->` 화살표 문법 사용

---

## 8. 자주 하는 실수

| 실수              | 설명                              |
| --------------- | ------------------------------- |
| 조건식에 `=`(대입) 사용 | `==` (비교) 와 혼동 주의               |
| 중첩 if문 깊어짐      | 가독성 떨어짐, 리팩토링 필요                |
| break 미사용       | switch에서 의도치 않은 fall-through 발생 |
| 조건식 타입 오류       | boolean 타입 아닌 값 사용 불가           |

---

필요하면 각 조건문의 심화 예제, 모범 코드, 실습 문제도 같이 만들어 드릴 수 있습니다.
더 궁금한 부분 말씀해 주세요!

물론이죠! 자바 조건문(if, switch) 실습 위주 문제 10개 만들어 드릴게요. 난이도는 기본\~중급 수준입니다.

---

# 자바 조건문 실습 문제 10개

---

### 1. 입력한 정수가 짝수인지 홀수인지 판별하시오. (if-else) 답: 홀수

```java
// 예: int a=5; → 출력: 홀수
    int a=5;
    if(a%2==0) {
        System.out.println("a는 짝수입니다");
    }else
        System.out.println("a는 홀수입니다");
    }

}
```

---

### 2. 점수가 90 이상 A, 80 이상 B, 70 이상 C, 60 이상 D, 나머지 F 출력하시오. (if-else if)
int b=99;
            if (b >= 90) {
                System.out.println("A 입니다");
            } else if (b >= 80) {
                System.out.println("B 입니다");
            } else if(b >= 70) {
                System.out.println("C 입니다");
            } else if(b >= 60) {
                System.out.println("D 입니다");
            }else {
                System.out.println("F 입니다");
            }

---


### 3. 주민등록번호(int n=1671333; ) 뒤 7자리를 입력 받아 남자인지 여자인지 출력하시오. (switch)

* 주민번호 뒷자리 첫 숫자: 1,3 남자 / 2,4 여자
        int n=1671333;
        char a =  String.valueOf(n).charAt(0);

        String s=switch  (a){
            case '3'->"남자";
            case '1'->"남자";
            case '2'->"여자";
            case '4'->"여자";
            default -> "없음";

        };

        System.out.println(s);
        }
    }

---

### 4. 월(月)을 입력 받아 해당 월의 마지막 날짜를 출력하시오. (switch)
        int n = 2;
        String p(이건 변경가능) = switch (n) {
            case 1, 3, 5, 7, 8, 10, 12 -> "31";
            case 4, 6, 9, 11 -> "30";
            case 2 -> "28";
            default -> "잘못된 월입니다.";
        };
        System.out.println(n+"월 마지막 날짜는"+p+"입니다");
    }
}


* 예: n=2 → 출력 28 (윤년은 고려하지 않음)

---

### 5. 나이를 입력(age=22;) 받아 13세 미만은 어린이, 13\~19세는 청소년, 20세 이상은 성인 출력하시오. (if-else if)
        int a = 15;
        if(a<13){
            System.out.println("어린이");
        }else if(a>=13 && a<=19 ){
            System.out.println("청소년");
        }else if(a>=20){
            System.out.println("성인");
        }else System.out.println("한국사람아님");

    }
}
---

### 6. 주어진 점수(score=86;), 범위 벗어나면 “잘못된 점수” 출력, 범위 내면 성적 등급 출력 (if)
     int score=60;
     if(score>=90) {
         System.out.println("A");
     }else if(score>=80){
         System.out.println("B");
     }else if(score>=70){
         System.out.println("C");
     }else System.out.println("낙제");

    }
}


---
### 7. 택배 배송 시스템에서 배송 상태 코드를 입력받아 상태 메시지 출력
0: “배송 준비중”
1: “배송 중”
2: “배송 완료”
그 외: “잘못된 상태 코드”
        int n = 1;
        String s = switch (n){
        case 0 -> "배송준비중";
        case 1 -> "배송 중";
        case 2 -> "배송 완료";
        default -> "잘못된 상태 코드";
    };
        System.out.println(s);

    }
}

### 8. 포인트 적립 이벤트에서 회원 등급별 적립률 계산
“골드”: 5%
“실버”: 3%
“브론즈”: 1%
그 외: 0%
        String grade = "골드";
        String point = switch(grade) {
            case "골드" -> "5%";
            case "실버" -> "3%";
            case "브론즈" -> "1%";
            default -> "0%";
        };
        System.out.println(s);


*/
}
