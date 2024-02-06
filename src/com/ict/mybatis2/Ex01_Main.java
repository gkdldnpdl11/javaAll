package com.ict.mybatis2;

import java.util.List;
import java.util.Scanner;

public class Ex01_Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		// 메소드를 static으로 받지 않고 자기 자신을 객체 생성해서 받아도됨
		// Ex01_Main m=new Ex01_Main();
		// m.print(list);
		
		// 전체 테이블보기 (여러개 이므로 리스트VO로 받아야함) 
		List<Ex01_VO>list = Ex01_DAO.getList();
		print(list);
		System.out.println();
		
		// 선택창
		System.out.println("선택하세요");
		System.out.println("1. member 테이블 특정 데이터 보기");
		System.out.println("2. member 테이블 데이터 삽입");
		System.out.println("3. member 테이블 특정 데이터 삭제");
		System.out.println("4. member 테이블 특정 데이터 수정");
		System.out.println("5. member 테이블 로그인 하기");
		System.out.print(">>>>>>>>>>>>>>>>>\t");
		
		// 선택창의 번호
		int menu=sc.nextInt();
		switch (menu) {
		case 1 : 
			System.out.print("검색 idx : ");
			String idx=sc.next();
			Ex01_VO vo=Ex01_DAO.getOne(idx);
			print(vo);
			break;
		case 2 : 
			System.out.println("삽입할 정보를 입력하세요");
			System.out.print("idx : ");
			String idx2=sc.next();
			System.out.print("name : ");
			String id=sc.next();
			System.out.print("pw : ");
			String password=sc.next();
			System.out.print("user_ID : ");
			String username=sc.next();
			System.out.print("age : ");
			String age=sc.next();
			System.out.print("date : ");
			String regdate=sc.next();
			
			int result=Ex01_DAO.getIns(new Ex01_VO(idx2, id, password, username, age, regdate));
			if (result>0) {
				// 성공하면 전체 테이블 보여주기
				List<Ex01_VO>list2= Ex01_DAO.getList();
				print(list2);
			} else {
				System.out.println("insert fail");
			}
			
//			Ex01_VO vo2=new Ex01_VO();
//			vo2.setIdx(idx2);
//			vo2.setId(id);
//			vo2.setPassword(password);
//			vo2.setUsername(username);
//			vo2.setAge(age);
//			int res=Ex01_DAO.getIns(vo2);

			break;
		case 3 : 
			System.out.println("삭제할 idx : ");
			String idx3=sc.next();
			
			// 파라미터가 하나 일 때 VO처리
//			Ex01_VO vo2=new Ex01_VO();
//			vo2.setIdx(idx3);
//			int result2=Ex01_DAO.getDel(vo2);
//			if (result2>0) {
//				List<Ex01_VO>list2= Ex01_DAO.getList();
//				print(list2);
//			} else {
//				System.out.println("delete fail");
//			}
			
			// 파라미터가 1개 일 때 String 처리
			int res=Ex01_DAO.getDel(idx3);
			if (res>0) {
				List<Ex01_VO> list3=Ex01_DAO.getList();
				print(list3);
			} else {
				System.out.println("delete fail");
			}
			break;
		case 4 : 
			System.out.println("수정할 정보를 입력하세요");
			System.out.print("idx : ");
			String idx4=sc.next();
			System.out.print("유저 아이디 : ");
			String username2=sc.next();
			System.out.print("나이 : ");
			String age2=sc.next();
			
			Ex01_VO vo2=new Ex01_VO();
			vo2.setIdx(idx4);
			vo2.setUsername(username2);
			vo2.setAge(age2);
			
			int res2=Ex01_DAO.getUp(vo2);
			if (res2>0) {
				List<Ex01_VO>list4= Ex01_DAO.getList();
				print(list4);
			} else {
				System.out.println("update fail");
			}
			break;
		case 5 : 
			System.out.print("name : ");
			String id2=sc.next();
			
			System.out.print("pw : ");
			String password2=sc.next();
			
			Ex01_VO vo3=new Ex01_VO();
			vo3.setId(id2);
			vo3.setPassword(password2);
			
			Ex01_VO vo4= Ex01_DAO.getLogin(vo3);
			if (vo4!=null) {
				System.out.println("login success");
			} else {
				System.out.println("login fail");
			}
			break;
		}
		sc.close();
	}
	
	// 출력 메소드
	// list_VO
	public static void print(List<Ex01_VO>list) {
		System.out.println("번호\t아이디\t비밀번호\t유저아이디\t나이\t날짜");
		for (Ex01_VO k : list) {
			System.out.print(k.getIdx()+"\t");
			System.out.print(k.getId()+"\t");
			System.out.print(k.getPassword()+"\t");
			System.out.print(k.getUsername()+"\t");
			System.out.print(k.getAge()+"\t");
			System.out.print(k.getRegdate().substring(0, 10)+"\n");
		}
	}
	
	// VO
	public static void print(Ex01_VO vo) {
		System.out.println("번호\t아이디\t비밀번호\t유저아이디\t나이\t날짜");
		System.out.print(vo.getIdx()+"\t");
		System.out.print(vo.getId()+"\t");
		System.out.print(vo.getPassword()+"\t");
		System.out.print(vo.getUsername()+"\t");
		System.out.print(vo.getAge()+"\t");
		System.out.print(vo.getRegdate().substring(0, 10)+"\n");
	}
	
}
