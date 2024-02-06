package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex03 {
	public static void main(String[] args) {
		// customer 테이블에 6, 이강인, 대한민국 제주도, 000-1234-9876을 삽입
		// 접속을 위한 클래스들
		Connection conn=null;	//접속
		Statement stmt=null;		// 구문
		ResultSet rs=null;				// 결과 저장
		int result=0;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");		//접속
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="c##ictdeu";
			String password="1111";	
			
			conn = DriverManager.getConnection(url, user, password);
			String sql="insert into customer(custid, name, address, phone)"
					+ " values(6, '이강인', '대한민국 제주도', '000-1234-9876')";
			stmt=conn.createStatement();
			result=stmt.executeUpdate(sql);
			
			// 삽입이 성공하면 result=1
			if(result>0) {
				System.out.println("success");
				// 성공했을때 select 문을 이용해서 삽입된 내용을 보자
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
