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

// makeup API

public class Ex04 {
	public static void main(String[] args) {
		InputStream is = null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		String pathname = "D:/sh/util/makeup_API01.txt";
		File file = new File(pathname);
		FileWriter fw=null;
		BufferedWriter bw=null;
		
		try {
			URL url=new URL("https://makeup-api.herokuapp.com/");
			URLConnection conn=url.openConnection();
			
			is=conn.getInputStream();
			isr= new InputStreamReader(is);
			br= new BufferedReader(isr);
			
			String msg=null;
			StringBuffer sb=new StringBuffer();
			while ((msg=br.readLine())!=null) {
				sb.append(msg+"\n");
			}
			// 화면 출력
			System.out.println(sb.toString());
			System.out.println("----------------------------------------------------------------");
			
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
