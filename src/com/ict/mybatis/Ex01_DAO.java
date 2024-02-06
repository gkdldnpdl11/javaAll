package com.ict.mybatis;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

// DB 처리하는 메소드들을 가지고 있는 클래스

public class Ex01_DAO {
	// MyBatis에서 실제 사용하는 클래스 : SqlSession
	private static SqlSession ss;
	
	// 싱글턴 패턴(동기화 처리까지)
	private synchronized static SqlSession getSession() {
		if (ss==null) {
			// 수동 커밋을 해야함 (자바에서는 기본적으로 오토커밋이기 때문에 롤백을 못함. 그래서 수동 커밋을 사용해야함)
			ss = Ex01_DBService.getFactory().openSession();
		}
		return ss;
	}
	
	// DB 처리하는 메소드들 > mapper.xml을 호출하는 메소드
	// select : 결과(resultType) = 여러개, 하나 구분
	//				파라미터(parameterType)가 없는지, 하나인지, 두개이상인지 구분
	
	// customer 테이블 전체 내용 보기 : 결과 - 여러개(한번이라도 여러개가 나오면 무조건 여러개임) - List<VO>
	// 													파라미터는 없음
	public static List<Ex01_VO> getList() {
		List<Ex01_VO> list = null;
		// getSession().selectList(mapper.xml 의 namespace.id);
		// select는 커밋을 안해도되서 바로 return을 해도됨. 그러나 insert, delete, update는 커밋을 해야되기 때문에 변수 생성하여 리턴한다
		// return = getSession().selectList("customer.getSelectAll");
		list = getSession().selectList("customer.getSelectAll");
		return list;
	}
	
	// customer 테이블의 특정 데이터 보기
	// select : 결과(resultType) = 한개 (VO, int, String... 가능)
	// 			파라미터가 있음
	public static Ex01_VO getOne(String custid) {
		Ex01_VO vo=null;
		vo = getSession().selectOne("customer.getSelectOne", custid);
		return vo;
	}
	
	public static int getCnt() {
		int result=0;
		result = getSession().selectOne("customer.getCount");
		return result;
	}
	
	// insert, update, delete 는 결과가 무조건 int
	// insert, update, delete 는 결과 커밋도 해야한다 (커밋을 안하면 적용이 안됨)
	// insert, update, delete 의 파라미터 타입은 하나 일 때 (VO, String, int), 와 2개 이상일 때는 무조건 VO를 만들어서 넣어야 한다 
	public static int getIns(Ex01_VO vo) {
		int result=0;
		result=getSession().insert("customer.getInsert", vo);
		if (result>0) {
			ss.commit();
		} 
		return result;
	}
	
	public static int getDel(Ex01_VO vo) {
		int result=0;
		result = getSession().delete("customer.getDelete", vo);
		if (result>0) {
			ss.commit();
		}
		return result;
	}
	
	public static int getUp(Ex01_VO vo) {
		int result=0;
		result = getSession().update("customer.getUpdate", vo);
		if (result>0) {
			ss.commit();
		}
		return result;
	}
	
}
