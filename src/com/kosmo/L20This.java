package com.kosmo;

class Stu{ //학교 어플에서 학생관리 =>자료형(Stu)
    //"A06301"
    String 학번="A2401231"; //한글이름의 변수나 필드를 작성할수 있지만 권장하지 않음!!
    String 이름="송영주";
    int 탄생=1986;
    // 눈에 보이지않는 기본생성자 가 자동으로 생성 public Stu(){}
}

class Stu2{
    String 학번="A2346";
    String 이름="채정호";
    int 탄생=2003;
    // 눈에 보이지않는 기본생성자 가 자동으로 생성 public Stu2(){}
    // 다른 생성자를 작성하면 기본 생성자를 작성하지 않는다 => 만든 생성자를 실행하도록 강제한다.
}

class Stu3{  //개발자는 같은 배경을 갖는 다른 자료를 만들기 위해 타입을 매번 지정하는 것을 멍청하다 생각
    String 학번;
    String 이름;
    int 탄생;
    //생성자 : 처음 만들 때 주는 데이터로 객체를 만들거야!

    Stu3(String 학번,String 이름,int 탄생) {//생성자가 실행(호출)될때 주는 데이터==파라미터(매개변수)
        this.학번=학번;
        this.이름=이름;
        this.탄생=탄생;

        //개발자습관(약속)
        //1. 필드는 this 로 접근하자
        //2. 필드값을 바꾸는 변수의 이름은 필드와 똑같이 하자
        //생성자가 실행할때 주는 데이터==파라미터(매개번수,전달값)
        //this== new Stu3() 객체와 같다
        //this : 객체 자신, 필드접근자(필드,함수,생성자)
        System.out.println(this.toString());

    }
    public String toString(){
        return "학생 이름은 :"+this.이름+", 학번은"+this.학번+", 탄생은"+this.탄생;
    }
}




public class L20This {
    public static void main(String[] args) {
        //일을 시키는 곳
        // ...학생을 저장 관리!!

        Stu 경민 = new Stu();
        System.out.println(경민.학번);
        System.out.println(경민.이름);
        System.out.println(경민.탄생);
        경민.이름="최경만";
        System.out.println(경민.이름);
        System.out.println();

        Stu2 정호=new Stu2();
        System.out.println(정호.이름);
        System.out.println(정호.학번);
        System.out.println(정호.탄생);

        Stu3 영주=new Stu3("a23","송영주",1981);
        System.out.println(영주.이름);
        System.out.println(영주.학번);
        System.out.println(영주.탄생);
        System.out.println(영주);






    }
}
