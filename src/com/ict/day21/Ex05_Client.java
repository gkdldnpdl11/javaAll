package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class Ex05_Client {
	public static void main(String[] args) {
		Socket socket = null;
		// 출력스트림 얻을 준비
		OutputStream os =null;
		OutputStreamWriter osw=null;
		BufferedWriter bw=null;
		
		// 입력스트림 얻을 준비
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br=null;
		
		Scanner scan=new Scanner(System.in);
		try {
			// 스캐너 이용해서 정보 입력하는 방법
			System.out.print("데이터 입력 : ");
			String msg=scan.next();
			// 서버 접속
			socket=new Socket("192.168.0.27", 7000);
			
			// 출력 스트림 얻고 문자열 보내기
			os=socket.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			// bw.write("Hello ^^");
			bw.write(msg+"\n");		// \n을 넣어줌으로써 줄넘김을 하고 문장 종료(문장이 끝났다는걸 알려줌)
			bw.flush();
			
			// 입력스트림 얻고 서버에서 보낸 정보 받기
			is=socket.getInputStream();
			isr=new InputStreamReader(is);
			br=new BufferedReader(isr);
			String re_msg=br.readLine();
			System.out.println("받은 정보 : "+re_msg);
			
		} catch (Exception e) {
			System.out.println("client err");
		} finally {
			try {
				br.close();
				isr.close();
				is.close();
				bw.close();
				osw.close();
				os.close();
				socket.close();
				scan.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
}
