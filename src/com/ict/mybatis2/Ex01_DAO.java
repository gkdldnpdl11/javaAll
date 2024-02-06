package com.ict.mybatis2;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class Ex01_DAO {
	private static SqlSession ss;
	// 동기화=synchronized 및 접속 (DBS에서 만든 데이터를 가지고 접속함)
	private synchronized static SqlSession getSession() {
		if (ss==null) {
			ss=Ex01_DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB 처리하는 메소드들
	
	// 전체보기 , 여러개를 보기 때문에 selectList 사용
	public static List<Ex01_VO> getList(){
		List<Ex01_VO> list=null;
		list = getSession().selectList("member.getSelectAll");
		return list;
	}
	
	// idx를 받아서 한개의 특정 데이터 보기(하나만 고르기 때문에 selectOne() 사용)
	public static Ex01_VO getOne(String idx) {
		Ex01_VO vo=null;
		vo=getSession().selectOne("member.getSelectOne", idx);
		return vo;
	}
	
	// 카운트, 하나만 고르기 때문에 selectOne() 사용
	public static int getCnt() {
		int result=0;
		result=getSession().selectOne("member.getConunt");
		return result;
	}
	
	// 삽입하기
	public static int getIns(Ex01_VO vo) {
		int result=0;
		result=getSession().insert("member.getInsert", vo);
		if (result>0) {
			ss.commit();
		}
		return result;
	}
	
	// 삭제하기
	public static int getDel(String idx) {
		int result=0;
		result=getSession().delete("member.getDelete", idx);
		if (result>0) {
			ss.commit();
		}
		return result;
	}
	
	// 수정하기
	public static int getUp(Ex01_VO vo) {
		int result=0;
		result=getSession().update("member.getUpdate", vo);
		if (result>0) {
			ss.commit();
		}
		return result;
	}

	public static Ex01_VO getLogin(Ex01_VO vo3) {
		Ex01_VO vo= null;
		vo=getSession().selectOne("member.login", vo3);
		
		if (vo != null) {
			// password 얻어내자 (데이터베이스에 암호화가 되어있다)
			// String password = vo.getPassword();

			// 우리가 입력한 패스워드를 암호화하자 (나중에)
			// String s_pw = vo3.getPassword().암호화메소드 사용

			// 데이터베이스에서 꺼낸 패스워드와 암호화된 패스워드를 비교하자(나중에)
			// 이것이 true 이면 성공, false 이면 실패
			
			// boolean을 true로 만들어놔서 아이디가 같으면 무조건 성공
			// 아이디가 맞으면 무조건 맞는걸로 되어있는 상태임
			boolean res = true;

			if (res) {
				return vo;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}
	
}










