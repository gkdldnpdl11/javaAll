package com.ict.day21;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

// URLConnection class : 원격지 서버 자원의 결과와 원격지 서버의 헤더 정보를 가져올 수 있다

public class Ex01 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr=null;
		BufferedReader br=null;
				
		try {
			URL url=new URL("https://comic.naver.com/index");
			URLConnection conn= url.openConnection();
			
			is=conn.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			
			String msg=null;
			StringBuffer sb=new StringBuffer();
			while ((msg=br.readLine()) !=null) {
				sb.append(msg+"\n");
			}
			System.out.println(sb.toString());
			System.out.println("------------------------------------------------");
			
			// 헤더 정보를 가지고 웹 브라우저가 해석하고 실행한다
			// 헤더 정보를 얻어내기
			Map<String, List<String>> map= conn.getHeaderFields();
			// map은 keyset을 사용해서 key값을 관리
			for (String k : map.keySet()) {
				System.out.println(k+" : " + map.get(k));
			}
			
			
		} catch (Exception e) {

		} finally {
			try {
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
		
			}
		}
	}
	
}
