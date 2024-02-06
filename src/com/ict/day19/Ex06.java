package com.ict.day19;

import java.io.File;

/*
 	File class : 특정 위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스
 		- 주요 생성자 : File(String 경로), File(String 상위경로, String 하위경로), File(File 상위경로, String 하위경로)
 		- 주요 메소드 : createNewFile() : 파일 생성
 								mkdir() , mkdirs() : 디렉토리 생성 / 둘의 차이는 상위경로의 존재유무로 생성 가능/불가능으로 나뉨
 								delete()					: 삭제
 								isFile()						: 파일이면 T/F
 								isDirectory()			: 디렉토리면 T/F
 								exists() 					: 있으면 T/F
 								getName()				: 이름 반환
 								length() 					: 파일의 크기를 byte 반환(디렉토리는 크기가 없음)
 								list()							: 특정 위치의 내용을 String 배열로 만들어서 저장
 								getAbsolutePath() : 절대주소
 								getPath()				: 상대주소
 */

public class Ex06 {
	public static void main(String[] args) {
		// 본인 환경에 맞게 (=본인의 디렉토리 위치에 따라 다름)
		// String pathname="D:\\sh\\javastudy";
		String pathname="D:/sh/javastudy";
		File file=new File(pathname);
		String arr[]= file.list();
		for (String k : arr) {
			// System.out.println(k);
			File file2=new File(pathname, k);
			// System.out.println(file2);
			if (file2.isDirectory()) {
				System.out.println("Directory : "+k);
			} else {
				// 각 1024배씩(2^10)
				// B > KB > MB > GB > TB > PB 
				System.out.println("File : "+k+ ", "+k.length()+ "Byte");
				System.out.println("File : "+k+ ", "+Math.ceil(k.length()*1.0/1024)+ "KB");
			}
		}
	}
	
}
