package com.kosmo.jdbc;
import java.sql.*;
//java.sql 패키지 : JDBC패키지



public class L01JDBCconnTest {
    public static void main(String[] args) {
        System.out.println("안녕!");
        String url="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        String user="scott";
        String pw="tiger";
        String sql="SELECT 1+1 as result FROM DUAL";

        try {
            Class.forName("oracle.jdbc.OracleDriver");
            Connection conn =DriverManager.getConnection(url,user,pw);
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);
            //excute : dml ddl, executeQuery : dql 을 실행
            while (rs.next()){
                int result=rs.getInt("result");
                System.out.println(result);
            }


        }catch (ClassNotFoundException e){
            e.printStackTrace();
        }catch (SQLException e){
            e.printStackTrace();
        }


    }
}
