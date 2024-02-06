package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Ex10 {
	public static void main(String[] args) {
		// 10= 변경 내용받기(내용을 다 받고 변경)
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;
		
		try {
			System.out.print("변경 할 번호 : ");
			int custid=sc.nextInt();
			
			System.out.print("이름 입력 : ");
			String name=sc.next();
			
			System.out.print("주소 입력 : ");
			String address=sc.next();
			sc.nextLine();
			
			System.out.print("전화번호 입력 : ");
			String phone=sc.next();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictdeu";
			String password = "1111";
			conn=DriverManager.getConnection(url, user, password);
			
			String sql="update customer set name=?, address=?, phone=? where custid=?";
			pstmt=conn.prepareStatement(sql);
			
			pstmt.setString(1, name);
			pstmt.setString(2, address);
			pstmt.setString(3, phone);
			pstmt.setInt(4, custid);
			
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
