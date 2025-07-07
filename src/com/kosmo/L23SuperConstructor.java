package com.kosmo;

class 슈퍼{
    int a;
    슈퍼(int a){
        this.a=a;
    }
}


class  아들 extends 슈퍼{
    /*아들(){
        super(10);
    }*/
    아들(int a){
        super(a);} //new 슈퍼(10);
    //자식 객체가 생성될 때 부모도 객체를

}








public class L23SuperConstructor {
    public static void main(String[] args) {
        슈퍼 s=new 슈퍼(10);
    }
}
