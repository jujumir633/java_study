package com.kosmo;

import java.util.*;


public class L39Map {
    public static void main(String[] args) {
        // Map : Collections 인터페이스로 구현된 타입이 아님
        // Collection (유용한 자료) Framework
        // Framework : 여러 라이브러리의 집합으로 새로운 규칙을 생성, 유용, 어렵다
        // 컬렉션 프레임워크가 무엇인가요?
        // 개발자를 위한 유용한 자료들에 집합!!
        // {key:value, key:value}

        Map<String,Object> person=new HashMap<>();
        //HashSet key로 사용되고 있어서 이름이 HashMap
        person.put("name","경민"); //key="name", value="경민"
        person.put("age",39);
        person.put("isMarryed",true); //{isMarryed=true, name=경민, age=39}
        System.out.println(person);
        //Map 데이터도 순서가 없다
        person.put("name","최경만");
        System.out.println(person);  //key="name", value="경민" key가 Set 타입이라 중복데이터를 허용하지 않는다

        Set keys=person.keySet(); //keySet(); key들만 변환
        System.out.println(keys);

        System.out.println(person.get("name"));
        System.out.println(person.get("isMarryed"));
        System.out.println(person.get("age"));
        //Map과 필드가 key와 같은 인스턴트는 아주 유사한 데이터다
        //자바는 유사하지만 구분해서 사용
        //Map과 class를 구분없이 사용하는 언어도 존재 => javaScript
        //Map 은 생성자와

        Iterator<String> keysIt=person.keySet().iterator();
        while (keysIt.hasNext()){
            String key = keysIt.next();
            Object value=person.get(key);
            System.out.println(key+":"+value);
        }


        for (String key:person.keySet()){
            Object value=person.get(key);
            System.out.println(key+"::"+value);
        }

        System.out.println("entry Set");

        for (Map.Entry<String,Object> entry:person.entrySet()){
            String key=entry.getKey();
            Object value=entry.getValue();
            System.out.println(key+":::"+value);
        }




    }
}
