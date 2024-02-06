package com.ict.day19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex10 {
	public static void main(String[] args) {
		// 바이트 출력 스트림 : InputStream 자식 클래스 FileInputStream 사용
		//								FileInputStream : 해당 파일에 내용을 1byte 읽기(입력)
		//				주요 메소드 : read() : int => 숫자(아스키코드(0~255), 한글자)
		//															해당 숫자를 문자로 보려면 char 형변환 해야한다
		//															만약에 읽을 수 없으면 -1이 나온다		// 무한루프하면서 -1이 나올때까지 돌리다가 -1이 나오면 종료한다
		// 							read(byte b[] ) : 배열에 존재하는 아스키코드 읽기
		
		// 파일 만들 위치 지정
		String pathname = "D:/sh/util/test02.txt";
		File file = new File(pathname);
		FileInputStream fis= null;
		try {
			fis=new FileInputStream(file);
			
			// 1byte 읽기(영어, 숫자, 소문자, 대문자, 일부 특수 문자 = 1글자만 읽음(숫자로 반환함) )
			// int b =fis.read();
			// System.out.println(b);					// 형변환 하지않아 아스키코드(0~255)의 숫자로 반환함
			// System.out.println((char)(b));		// char 형변환하여 숫자로 반환하지 않고 문자로 반환함
			
			// 모든 글자 읽기 : 한글, 한자 안됨
			// int b=0;
			// while (true) {
			// 	b=fis.read();
			// 	if(b==-1) break;
			// 	System.out.println(b+" : " +" 문자형 "+(char)(b));
			// }
			
			// int b=0;
			// b 읽고 b=-1이 아니면 계속 실행하세요 라는 뜻 
			// while( (b = fis.read() ) != -1 ) {
			// 	System.out.println(b+"\t: " +"문자형\t"+(char)(b));
			// }
			
			byte b[]=new byte[(int) file.length()];
			// fis가 지정하는 파일의 내용을 byte b[]에 모두 넣어준다
			fis.read(b);
			// 한글, 한자 못읽음
			// for (byte k : b) {
			// 	System.out.println(k+"\t: " +"문자형\t"+(char)(k));
			// }
			
			// String 사용 = 한글, 한자 읽을 수 있음 (문자열이기때문에)
			String str=new String(b);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
