package com.ict.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		// 스캐너를 이용해서 번호, 이름, 주소, 전화번호를 받아서  customer 테이블에 삽입 후 확인
		Scanner sc=new Scanner(System.in);
		System.out.print("번호  : ");
		int custid=sc.nextInt();
		System.out.print("이름 : ");
		String name=sc.next();
		System.out.print("주소 : ");
		String address=sc.next();
		System.out.print("전화번호 : ");
		String phone=sc.next();
		
		// DB처리
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs=null;
		int result=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="c##ictdeu";
			String password="1111";
			
			conn=DriverManager.getConnection(url, user, password);
			String sql="insert into customer(custid, name, address, phone)"
					+ " values("+custid+",'"+name+"','"+address+"','"+phone+"')";
			stmt=conn.createStatement();
			result=stmt.executeUpdate(sql);
			if (result>0) {
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
				sc.close();
			} catch (Exception e2) {

			}
		}
	}
	
}
