package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex05_Server {
	public static void main(String[] args) {
		// 서버 소켓 생성
		ServerSocket server=null;
		Socket socket=null;
		
		// 입력스트림 얻을 준비
		InputStream is=null;
		InputStreamReader isr=null;
		BufferedReader br=null;
		
		// 출력스트림
		 OutputStream os=null;
		 OutputStreamWriter osw=null;
		 BufferedWriter bw= null;
		 
		try {
			server=new ServerSocket(7000);		// port 번호 생성
			System.out.println("서버 대기중...");
			// 클라이언트가 요청하기 전 까지는 블록킹된다
			socket = server.accept();		// 요청 대기상태
			
			// 클라이언트가 보낸 정보를 받기 위한 입력 스트림 얻기 
			is=socket.getInputStream();
			isr= new InputStreamReader(is);
			br= new BufferedReader(isr);
			
			// 서버에 접속한 ip 주소 얻기
			String ip=socket.getInetAddress().getHostAddress();
			String msg=br.readLine();
			
			// 들어온 문자 출력
			System.out.println(ip+" : "+msg);
			
			// 클라이언트에게 보낼 출력스트림 얻기
			os=socket.getOutputStream();
			osw=new OutputStreamWriter(os);
			bw=new BufferedWriter(osw);
			bw.write(msg);
			bw.flush();
			
		} catch (IOException e) {
			System.out.println("server err");
			e.printStackTrace();
		} finally {
			try {
				// 보통 서버는 close 잘 안씀
				bw.close();
				osw.close();
				os.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e2) {
				
			}
		}
	}
	
}
