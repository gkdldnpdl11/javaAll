package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt=null;
		ResultSet rs = null;
		// int result = 0;
		Scanner scan=new Scanner(System.in);
		
		try {
			System.out.print("검색번호 받기 : ");
			int custid=scan.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictdeu";
			String password = "1111";

			conn = DriverManager.getConnection(url, user, password);
			// String sql = "select * from customer";
			// ? = 동적바인딩 변수 : 현재는 값을 모르고 실행할 때 값을 알 수 있다 
			String sql = "select * from customer where custid=?";
			
			// stmt=conn.createStatement();
			pstmt = conn.prepareStatement(sql);
			
			// ? 를 처리하는 수식
			pstmt.setInt(1, custid);
			
			// rs = stmt.executeQuery(sql);
			rs = pstmt.executeQuery();
			
			// insert, delete, update 에서 사용
			// result=pstmt.executeUpdate();
			
			while (rs.next()) {
				System.out.print(rs.getInt(1) + "\t");
				System.out.print(rs.getString(2) + "\t");
				System.out.print(rs.getString(3) + "\t");
				System.out.print(rs.getString(4) + "\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				scan.close();
			} catch (Exception e2) {

			}
		}
	}
	
}
