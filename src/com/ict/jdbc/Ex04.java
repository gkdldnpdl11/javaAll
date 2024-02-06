package com.ict.jdbc;

// sqldeveloper는 commit을 하지 않으면 DB에 저장되지 않는다
// 그러나 자바에서는 자동으로 commit이 되기때문에 조심해서 사용 > 나중에 auto commit off 적용
// sqldeveloper에서 commit은 작동이 잘 되는지 확인하고 commit을 해야함
// 실수하면 rollback을 해야되는데 commit이 되버리면 롤백을 못하기 때문임

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		// customer 이강인 삭제 후 출력
		// 오라클 접속 초기값
		Connection conn=null;
		Statement stmt=null;
		ResultSet rs= null;
		int result=0;
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:xe";
			String user="c##ictdeu";
			String password="1111";
			
			conn=DriverManager.getConnection(url, user, password);
			String sql="delete from customer where name='이강인'";
			stmt=conn.createStatement();
			// 여기서 종료되는것이 맞음
			result=stmt.executeUpdate(sql);
			// 자바 내에서 확인하기 위해서 if 사용
			if (result>0) {			// 0값을 주는 이유는 행이 삭제되거나 삽입되면 결과값이 숫자로 나오기 때문에 0보다 크면 성공이라는 뜻과 동일하다
				// 내용이 삭제되면 customer의 내용이 반환됨
				System.out.println("success");
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
		}finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {

			}
		}
	}
	
}
