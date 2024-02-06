package com.ict.day20;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

// URL(Uniform Resource Locator) : 인터넷에서 접근 가능한 자원의 주소
// URL 클래스 : 해당 위치에 자원의 결과만 가져온다
//						final 클래스이다(상속 안됨) 멤버필드->상수 , 메소드->오버라이딩X, 클래스 -> 상속X

public class Ex12 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		// 내컴퓨터에 저장
		String pathname = "D:/sh/util/webPage01.txt";
		File file = new File(pathname);
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			URL url=new URL("https://comic.naver.com/index");
			
			is=url.openStream();		// 크롤링
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			String msg=null;
			// String에 여러번 "+" 를 사용하면 메모리에 쓸데없는 공간들이 만들어진다
			// 그것을 해결하기 위해서 StringBuffer 나 StringBuilder 사용한다
			// "+" 대신에 append() 를 사용해서 추가한다
			StringBuffer sb=new StringBuffer();
			// StringBuilder sb= new StringBuilder();
			while ((msg=br.readLine()) != null) {
				// 화면에 출력
				// System.out.println(msg+"\n");
				
				// append() 사용하면 msg라는 객체에 String이 계속 쌓인다 (+ 와 동일한 효과)
				sb.append(msg+"\n");
			}
			// sb.toString() => 자료형을 String으로 만들어줌
			// System.out.println(sb.toString());
			
			// 파일에 저장하기
			fw=new FileWriter(file);
			bw=new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (Exception e) {
			
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
}
