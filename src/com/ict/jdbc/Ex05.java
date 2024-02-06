package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
		// customer 테이블의 장미란을 둘리로 주소는 서울 방학동으로 변경
		
		// 오라클 접속 초기값 지정(클래스)
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		int result=0;
		
		try {
			// 오라클 드라이버 로딩
			Class.forName("oracle.jdbc.driver.OracleDriver");
			// 로그인
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="c##ictdeu";
			String password="1111";
			// 오라클 접속
			conn=DriverManager.getConnection(url, user, password);
			// 구문 작성
			String sql="update customer set name='둘리', address='서울 방학동' where name='장미란'";
			stmt=conn.createStatement();
			// 결과 보내기
			result=stmt.executeUpdate(sql);
			// 결과 출력
			if (result>0) {
				// 출력에 성공하면 customer 테이블의 모든 정보를 자바에서 반환
				sql="select * from customer";
				stmt=conn.createStatement();
				rs=stmt.executeQuery(sql);
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
				stmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
	
}
