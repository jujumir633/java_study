package com.kosmo.ex;

public class S10Array {
    /*자바 배열 수업용으로 좋은 예제 코드와 설명이네요!
이 내용을 중심으로 배열 개념, 특징, 예외 처리까지 포함해 정리해드릴게요.

---

# 자바 배열(Array) 수업 내용 정리

---

## 1. 배열이란?

* **여러 개의 같은 타입 데이터를 순서대로 저장하는 자료구조**
* 길이(크기)가 고정되어 있으며, 한 번 생성 후 변경 불가
* 각 데이터는 인덱스(순서)를 통해 접근하며 인덱스는 0부터 시작

---

## 2. 자바 배열 선언과 생성

```java
int[] nums = new int[5];      // int형 배열 5개 생성, 초기값 0
String[] strs = new String[3]; // String 배열 3개 생성, 초기값 null
```

* 배열 생성 시 반드시 `new` 연산자 사용
* 생성된 배열은 객체(Object)로 힙(heap) 메모리에 저장됨

---

## 3. 배열 초기값

* 기본형(int, double 등): 0, 0.0, false 등 타입별 기본값
* 참조형(String 등): `null`로 초기화됨

---

## 4. 배열 요소 접근과 대입

```java
nums[0] = 1;         // 첫번째 요소에 1 대입
System.out.println(nums[3]);  // 네번째 요소 출력
```

* 인덱스는 0부터 `length - 1` 까지 사용 가능

---

## 5. 배열 길이 (수업하지 않음!)

* `array.length`를 통해 배열 크기 확인 가능
* 배열 크기는 **생성 시 고정**되며, 이후 변경 불가

---

## 6. 배열 출력

* 배열 자체를 `System.out.println()` 하면 메모리 주소값 같은 해시코드가 출력됨
* 배열 내용을 보기 위해선 `Arrays.toString(array)` 메서드 사용

```java
System.out.println(Arrays.toString(nums));
```

---

## 7. 예외: `ArrayIndexOutOfBoundsException`

* 존재하지 않는 인덱스를 참조하면 런타임 오류 발생
* 예:

```java
System.out.println(strs[3]); // strs는 크기 3, 인덱스 0~2만 가능 → 오류
```

---

## 8. 배열 특징 요약

| 특징         | 설명                              |
| ---------- | ------------------------------- |
| 고정 길이      | 생성 후 크기 변경 불가                   |
| 동일 타입 저장   | 배열 내 모든 요소는 같은 타입이어야 함          |
| 메모리 연속 저장  | 힙 메모리에 순차적으로 저장됨                |
| 인덱스 0부터 시작 | 첫 번째 요소 인덱스는 항상 0               |
| 초기값 부여     | 기본형은 타입별 기본값, 참조형은 null로 초기화    |
| 참조형 타입 배열  | 참조형 배열은 각 요소가 객체 참조(null 또는 주소) |

---

## 9. 자바 배열 관련 유틸 클래스: `java.util.Arrays`

* 배열 복사, 정렬, 탐색, 출력 등 지원
* 예:

```java
Arrays.sort(nums);                      // 정렬
int idx = Arrays.binarySearch(nums, 10); // 탐색
System.out.println(Arrays.toString(nums)); // 출력
```

---
# 자바 배열 실습 문제 4개

---

### 1. 다음 코드에서 `nums` 길이가 3인 배열을 생성하고 초기값을 출력하는 코드를 작성하세요.
   int [] nums =new int[3];
   nums[0]=1;
   nums[1]=2;
   nums[2]=3;

   또는
   int[]nums={1,2,3}

---

### 2. `nums` 배열의 1번째와 2번째 요소에 저장된 값을 출력하는 코드를 작성하세요.
        System.out.println(nums[0]);
        System.out.println(nums[1]);

---

### 3. `fruit` 길이가 4인 배열을 선언하고 “사과”, “딸기”, “수박”, "배"를 각각 저장하는 코드를 완성하세요.
        String[] fruit = new String[4];
                fruit[0]="사과";
                fruit[1]="딸기";
                fruit[2]="수박";
                fruit[3]="배";
        System.out.println(fruit[3]);

        String[] fruit={"사과","딸기",수박","배"}


---

### 4. `fruit` 배열의 5번째 요소를 출력하려고 하면 어떤 오류가 발생하며, 왜 발생하는지 설명하세요.
      존재하지 않는 인덱스

---


*/
}
