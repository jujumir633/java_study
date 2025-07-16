package com.kosmo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class L38Set {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();  //Hash 알고리즘으로 구현된 Set
        // hashcode()로 같은 아이템을(중복)을 제거 HashSet
        // 자료형 데이터는 equals 로 같은 데이터를 제거
        set.add(5);
        set.add(5);
        set.add(10);
        set.add(5);
        set.add(20);
        set.add(30);
        set.add(5);

        System.out.println(set);  //[20, 5, 10, 30]
        // set 인덱스가 없다(순서)
        // set.get(1); 오류뜸
        System.out.println(set.contains(21));
        System.out.println(set.contains(20));
        System.out.println(set.remove(10)); //remove(index) : 없다 true, false 로 나타냄

        //반복자
        Iterator<Integer> it=set.iterator();
        //it.pointer => *[20, 5, 10, 30]
        //it.hasNext() : 포인터 다음에 아이템이 있냐?
        //it.next() : 이동하고 아이템 반환
        while (it.hasNext()){
            int i=it.next();
            System.out.println(i);
        }

        for(int i:set){
            System.out.println(i);
        }
        System.out.println(set.size()+"개 가지고 있어");

        //Set 은 : add(), remove(), contains(), size(), clear(), isEmpty(), iterator 를 가지고 있음
        //Set 없는것 : get(i), remove(i)

        Set<String> setStr=new HashSet<>();
        setStr.add("안녕");
        setStr.add("안녕");
        setStr.add(new String("안녕"));
        System.out.println(setStr);

        setStr.add("잘가");
        setStr.add("식사맛있게하세요");
        System.out.println(setStr);

        //Map





    }
}
