package com.ict.day19;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 	스트림 : 데이터를 원하는 목적지까지 입/출력하는 방법
 	종류 : 바이트 스트림, 문자 스트림, 결합 스트림, 객체 스트림(Object Stream)
 	
 	1. 바이트 스트림 : 모든 처리를 1byte 처리
 					대상 : 바이트로 이루어진 모든 파일 (사진, 동영상, 소리 등)
 		최상위 클래스 : InputStream(입력), OutputStream(출력)
 	
 	1-2. 결합 스트림 : 바이트 스트림 => 문자스트림 사이에 존재 (바이트스트림을 문자스트림으로 넘겨주는 사이에있음)
 								기계를 통해 입/출력된 정보를 사람이 알아볼 수 있도록 입/출력 한다
 		최상위 클래스 : InputStreamReader(입력), OutputStreamWriter(출력)
 			
 	2. 문자 스트림 : 모든 처리를 2byte 처리 (사람위주)
 				대상 : 세계 모든 문자로 구성된 파일 입/출력에 적합
 	 	최상위 클래스 : Reader(입력), Writer(출력)
 	 	
 	3. 오브젝트 스트림 : 객체 직렬화 후 객체 단위로 입/출력한다
 						대상 : 객체
 			최상위클래스 : ObjectInputStream(readObject() : 객체 역직렬화), ObjectOutputStream(writeObject() : 객체 직렬화)
*/

public class Ex08 {
	public static void main(String[] args) {
		// 바이트 출력 스트림 : OutputStream 자식 클래스 FileOutputStream 사용
		//								FileOutputStream : 해당 파일에 내용을 1byte 쓰기(출력) // 1byte=한글,한자 안됨. 오직 영문만 가능
		//				주요 메소드 : write(int b) : int => 숫자(아스키코드(0~255), 한글자)
		//																		** 아스키코드 : 숫자, 소문자, 대문자, 일부 특수문자만 가능
		//									write(byte b[] ) : 배열 b에 존재하는 아스키코드 출력
		//																** String 클래스에 getBytes() 이용하면 byte[] 생성 (String > byte[] )
		//									flush() : 출력 버퍼 용량이 다 차지 않아도 바로 출력하게 만드는 메소드
		// 								close() : 출력 스트림 닫기
		
		// 파일 만들 위치 지정
		String pathname="D:/sh/util/test01.txt";
		File file=new File(pathname);
		FileOutputStream fos= null;		// 아래에서 close() 를 사용하기 위해서 fos 선언
		try {
			// {} 안의 fos는 지역변수 이므로 블록이 종료되면 fos를 사용할 수 없다
			// 파일이 있으면 덮어쓰기가 된다. 파일이 없으면 생성된다 
			fos= new FileOutputStream(file);
			fos.write(106);	// j
			fos.write(97);		// a
			fos.write(118);	// v
			fos.write(97);		// a
			fos.write(13);		// 줄 바꿈
			
			fos.write('H');
			fos.write('e');
			fos.write('l');
			fos.write('l');
			fos.write('o');
			fos.write(13);		// 줄 바꿈
			
			// String.getBytes() 여러글자 사용가능
			// byte[] 을 사용하기 위해서 String.getBytes()를 만듬. > 여러글자를 출력하기 위해서 사용함
			// 바이트 스트림은 1byte만 허용하기 때문에 byte[]을 사용해서 여러글자를 출력
			String msg="Hello !\n안녕\n大韓民國\nBYE~";
			byte b[]= msg.getBytes();
			fos.write(b);
			
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				// fos 출력스트림을 닫기 위해서 위에서 null로 fos 선언
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
