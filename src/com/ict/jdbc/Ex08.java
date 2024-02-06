package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex08 {
	public static void main(String[] args) {
		// 스캐너로 번호, 이름, 주소, 전화번호 받아서 customer 테이블에 삽입하기
		Scanner sc = new Scanner(System.in);
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int result = 0;

		try {
			System.out.print("번호 입력 : ");
			int custid=sc.nextInt();
			sc.nextLine();
			System.out.print("이름 입력 : ");
			String name=sc.next();
			sc.nextLine();
			System.out.print("주소 입력 : ");
			String address=sc.next();
			sc.nextLine();
			System.out.print("전화번호 입력 : ");
			String phone=sc.next();
			sc.nextLine();
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "c##ictdeu";
			String password = "1111";
			conn=DriverManager.getConnection(url, user, password);
			String sql="insert into customer(custid, name, address, phone) values(?, ?, ?, ?)";
			pstmt=conn.prepareStatement(sql);
			// 보내기 전에 ? 해결위치
			pstmt.setInt(1, custid);
			pstmt.setString(2, name);
			pstmt.setString(3, address);
			pstmt.setString(4, phone);
			// 보내고 결과 받기
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
