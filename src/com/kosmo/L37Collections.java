package com.kosmo;

import java.util.*;

//콜렉션 대표적 인터페이스 : List, Queue, Set
public class L37Collections {
    public static void main(String[] args) {
        int [] arr = new int[4];
        System.out.println(Arrays.toString(arr));
        //arr[4]=1; //{0,0,0,0,1} 기대 하지만 오류
        //배열 : 순서와 길이가 있는 데이터
        //Array [] : 처음 만들어진 길이 고정

        List list=new ArrayList();  //List : 길이가 변경되는 배열
        list.add(10);//다른언어에서는 push(10)라는 함수
        list.add(20.0);
        list.add(30.0f);
        list.add(40l);
        System.out.println(list);
        System.out.println(list.get(3)); // list의 인덱스 참조, arr[3]
        //System.out.println(list.get(4)); //오류 배열값 오버
        list.add("50");
        System.out.println(list.get(4));
        System.out.println(list); // 배열을 모두 보여줌
        System.out.println(list.size()); //길이 배열 내부 갯수
        System.out.println(list.remove("50")); //특정 숫자를 지정해서 지움 true 혹은 false로 나타냄, ""요걸로 지정해야됨
        System.out.println(list);
        System.out.println(list.contains(10));  //배열내부 특정 수를 지정 있나없나 확인 true,false 로 나타냄
        System.out.println(list.contains(11));  // false

        Object [] objArr={10,20.0,30.0f,40l};
        //10.0
        //objArr.contains(20.0); 불가능 => 직접탐색
        boolean result=false;
        for(int i=0;i< objArr.length;i++){
            if((objArr[i] instanceof Double)&&20.0==(Double) objArr[i]){
                result=(true);
                break;
            }
        }
        //Array 사용이유 : 메모리가 절약되서!!(고급언어일수록 Array가 없는 경우가 존재함)

        List<Integer> listint=new ArrayList<>();
        listint.add(10);
        //listint.add("20");  문자열 안됨 Integer 만가능
        listint.add(99);
        listint.add(20);
        listint.add(-100);
        System.out.println(listint);
        listint.sort(null);  //기본적으로 오름차순 정렬 해줌 [작은수 -> 큰수]
        System.out.println(listint);
        listint.sort(Comparator.reverseOrder()); //내림차순 정렬
        System.out.println(listint);

        List<String> listStr = new ArrayList<>();
        listStr.add("Apple"); //대문자가 앞번호 소문자가 뒷번호
        listStr.add("apple");
        listStr.add("Banana");
        listStr.add("사과");
        listStr.add("Lemon");
        System.out.println(listStr); // 구성 모두 보기
        listStr.sort(null); // 오름차순 정렬
        System.out.println(listStr);
        listStr.sort(Comparator.reverseOrder()); //내림차순 정렬
        System.out.println(listStr);
        // List 의 유용한 함수 : contains, sort, remove, add

        List song = new ArrayList<>();
        song.addAll(Arrays.asList(100,200,300,400));  //한번에 배열 값을 넣을때
        System.out.println(song);



        for(String s : listStr){
            System.out.println(s);
        }
        System.out.println("향상된 for 반복문(iterator)종료");

        for (String s : listStr){
            System.out.println(s);
        }

        System.out.println("향상된 for 반복문은 iterator를 초기화하고 다시사용");

        Iterator<String> it=listStr.iterator();
        while(it.hasNext()){
            String s=it.next();
            System.out.println(s);

        }








    }
}
