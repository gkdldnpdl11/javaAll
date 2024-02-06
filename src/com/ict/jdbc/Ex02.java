package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		Connection conn=null;	// 오라클접속 클래스
		Statement stmt=null;		// sql 구문 저장
		ResultSet rs=null;				// 결과 저장
		// int result=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");			// 접속 드라이버 로딩
			String url = "jdbc:oracle:thin:@localhost:1521:xe";		// 접속 정보 저장
			String user ="c##ictdeu";												// 접속하는 곳의 아이디
			String password ="1111";												// 접속하는 곳의 비밀번호
			
			conn = DriverManager.getConnection(url, user, password);	// 접속
			// String sql="select * from book3";	// 구문 작성
			String sql="select * from book3 where bookname like '축구%'";	// 구문 작성
			stmt = conn.createStatement();		// sql에 보내기 위해서 구문 생성
			rs=stmt.executeQuery(sql);				// 구문 보내고 결과 받기
			
			while (rs.next()) {
				// 화면에 출력
				System.out.print(rs.getInt("bookid")+"\t");
				System.out.print(rs.getString("bookname")+"\t");
				System.out.print(rs.getString("publisher")+"\t");
				System.out.print(rs.getInt("price")+"\n");
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	
}
