package com.kosmo.jdbc;
import java.sql.*;

public class L02EmpList {
    public static void main(String[] args) {
        int param=30; //30번 부서의 사원을 조회
        int param2=1500; // 30번 이면서 급여가 1500이상인 사원을 조회

        String url="jdbc:oracle:thin:@//localhost:1521/XEPDB1";
        String  user="scott";
        String pw="tiger";
        String drive="oracle.jdbc.OracleConnection";
        String sql = "SELECT * FROM EMP WHERE DEPTNO=? AND SAL>?";

        Connection conn=null;
        PreparedStatement pstmt=null;
        ResultSet rs=null;

        try {
            Class.forName(drive);
            conn=DriverManager.getConnection(url,user,pw);
            pstmt=conn.prepareStatement(sql);
            pstmt.setInt(1,param);
            pstmt.setInt(2,param2);
            rs=pstmt.executeQuery();
            while (rs.next()){
                int no=rs.getInt("EMPNO");
                String name=rs.getNString("ENAME");
                double sal=rs.getDouble("SAL");
                System.out.println(no+"/"+name+"/"+sal);

            }

        }catch (Exception e){
            e.printStackTrace();
        }finally {
            try {
                rs.close();
                pstmt.close();
                conn.close();
            }catch (Exception e){
                e.printStackTrace();
            }
        }





    }
}
