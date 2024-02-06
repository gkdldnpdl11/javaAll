package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

// 기상청 날짜

public class Ex02 {
	public static void main(String[] args) {
		// 읽을 준비
		InputStream is=null;
		// 바이트스트림을 문자스트림과 연결해주는 스트림
		InputStreamReader isr=null;
		BufferedReader br=null;	
		
		// 쓸 준비
		String pathname = "D:/sh/util/weather.txt";
		File file = new File(pathname);
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			URL url=new URL("https://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn=url.openConnection();

			is=conn.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			String msg=null;
			StringBuffer sb=new StringBuffer();
			while ((msg=br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			// 화면 출력
			System.out.println(sb.toString());
			System.out.println("---------------------------------");
			
			// 파일에 저장
			fw= new FileWriter(file);
			bw= new BufferedWriter(fw);
			bw.write(sb.toString());
			bw.flush();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
