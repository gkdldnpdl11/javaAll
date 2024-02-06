package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex09 {
	public static void main(String[] args) {
		// 삭제 내용받기
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			System.out.print("삭제 할 번호 입력 : ");
			int custid=sc.nextInt();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictdeu";
			String password = "1111";
			conn=DriverManager.getConnection(url, user, password);
			
			String sql="delete from customer where custid=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, custid);
			result=pstmt.executeUpdate();
			if (result>0) {
				sql="select * from customer";
				pstmt=conn.prepareStatement(sql);
				rs=pstmt.executeQuery();
				while (rs.next()) {
					System.out.print(rs.getInt(1)+"\t");
					System.out.print(rs.getString(2)+"\t");
					System.out.print(rs.getString(3)+"\t");
					System.out.print(rs.getString(4)+"\n");
				}
			} else {
				System.out.println("fail");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
				sc.close();
			} catch (Exception e2) {

			}
		}
	}
	
}
