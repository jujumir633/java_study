package com.kosmo.advance;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

public class A20ChattingServer {
    public static List<Socket> clients=new ArrayList<>();

    public static void main(String[] args) {
        try (ServerSocket server=new ServerSocket(3333)){
            while (true){
                Socket client=server.accept(); //Socket 으로 서버에 접속하면 반환
                clients.add(client);
                String clientAddress=client.getInetAddress().toString();
                System.out.println(clientAddress+"님 서버접속");

                InputStream in=client.getInputStream(); //클라이언트가 서버로 보내는 메세지를 받는 통로
                //InputStreamReader ,BufferdReader, Scanner 모두 가능
                InputStreamReader inputStreamReader=new InputStreamReader(in);
                BufferedReader reader=new BufferedReader(inputStreamReader);

                new Thread(()->{
                    while (true){
                        try {
                            String msg=clientAddress+":"+reader.readLine();
                            for(Socket c: clients){
                                BufferedWriter writer=new BufferedWriter(new OutputStreamWriter(c.getOutputStream()));
                                writer.write(msg);
                                writer.flush(); //버퍼는 사용하고 비워야함
            //                    OutputStream out=c.getOutputStream();
            //                    OutputStreamWriter writer=new OutputStreamWriter(out);
            //                    BufferedWriter bufferedWriter=new BufferedWriter(writer);
                            }
                        }catch (IOException e){
                            System.out.println("클라언트가 보낸 메세지를 받는 중 오류");
                            e.printStackTrace();
                        }
                    }
                }).start();

            }

        }catch (IOException e){
            System.out.println("서버문제 종료!");
        }



    }
}
