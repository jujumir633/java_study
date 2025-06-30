package com.kosmo;

import java.util.Arrays;

public class L15TowDimeArray {
    public static void main(String[] args) {
        String[] strs={"안녕","잘가","잘자"};
        char[][] chartows={{'안','녕'},{'잘','가'},{'잘','자'}};
        int[][] scoreTows={{88,77,99},{100,66,89},{81,100,100}};
        //3명의 학생의 3과목씩 저장된 배열
        int[][] arr=new int[2][3]; //총2개, 1개에 3개  배열만듬
        System.out.println(Arrays.deepToString(arr));

        //{{88,77,99},{100,66,89},{81,100,100}}
        //2차원 배열 탐색은 반복문을 중복해서 2개 사용
        int sum=0;
        for(int i=0;i< scoreTows.length;i++){
            //i==0 {88,77,99}
            //i==1 {100,66,89}
            //i==2 {81,100,100}
            for(int j=0;j<scoreTows[i].length;j++){
                sum += scoreTows[i][j];
            }
        }
        System.out.println("총합은"+sum);


        for(int i=0;i<chartows.length;i++){  //1. 요걸먼저 진행 후
            for(int j=0;j<chartows[i].length;j++){ //2. 두번째 진행
                System.out.print(chartows[i][j]);
            }
        }




    }
}
