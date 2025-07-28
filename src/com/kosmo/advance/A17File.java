package com.kosmo.advance;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class A17File {
    public static void main(String[] args) {
        // 문자열 파일을 작성하고 읽어오는 예제
        // 왠만하면 입출력은 오류를 동반하기 때문에 예외처리 하세요!
        // 입출력은 stresm 을 동반하는데 다 사용하고 나면 close()를 해야합니다.
/*        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter("A17Hello.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally {
            try {
                if(fileWriter!=null)fileWriter.close();
            }

        }*/

        // ./경로 : 현재 위치를 기준으로 해당 파일을 작성
        try (FileWriter fileWriter=new FileWriter("./L17Hello.txt")){
            fileWriter.write("안녕하세요!\n");
            fileWriter.write("자바 고급 수업 입니다!");

        } catch (IOException e) {
            System.out.println("파일 출력중 오류 발생");
            e.printStackTrace();
        } //여기서 자동으로 close(); 해줌


        try (
                FileReader fileReader=new FileReader("./L17Hello.txt");
                BufferedReader bufferedReader=new BufferedReader(fileReader);
        ){
            String line="";
            while ((line=bufferedReader.readLine()) !=null){

            }

        } catch (FileNotFoundException e) {
            System.out.println("찾는파일이 없음");;
        } catch (IOException e) {
            System.out.println("파일 찾는중 오류");
        }

        //java11 이상만 가능
        // files
        Path path= Paths.get("A17Files.txt");
        String txt="안녕!!\n Files로 파일쓰기!"; //getbytes() : byte로 바꾸는데 인코딩 지정후 변경
        try{
            Files.write(path,txt.getBytes());
        }catch (IOException e){
            System.out.println("오류");
        }

        System.out.println("다음");

        try {
            String content=Files.readString(path);
            System.out.println(content);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
