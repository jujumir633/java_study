package com.kosmo.ex;

import java.util.Arrays;

public class Song {
    public static void main(String[] args)throws InterruptedException {
      int a=1;
      String b=switch(a) {
          case 0 -> "일요일";
          case 1 -> "월요일";
          default -> "몰라";
      };
          System.out.println(b);

int[] nums={11,22,33,44,55};
int c=0;
while (c<nums.length){
    System.out.println(nums[c]);
    c++;
}

if(b=="일요일"){
    System.out.println("11시에 일어나");
}else{
    System.out.println("8시에 일어나");
}

for(int d=0;d<5;d++){
    System.out.println(d);
}

int[][]arr={
        {1,2,3},
        {4,5,6},
        {7,8,9}
};
        System.out.println(arr[0][0]);
        int[] row= arr[0];
        System.out.println(Arrays.toString(row));












    }
}
