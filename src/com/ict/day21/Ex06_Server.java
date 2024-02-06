package com.ict.day21;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Ex06_Server implements Runnable {
	ServerSocket server = null;
	Socket socket = null;
	
	InputStreamReader isr=null;
	BufferedReader br=null;
	
	OutputStreamWriter osw= null;
	BufferedWriter bw=null;
	
	public Ex06_Server() {
		try {
			server=new ServerSocket(7001);
			System.out.println("waiting....");
			
			new Thread(this).start();
		} catch (Exception e) {

		}
	}

	@Override
	public void run() {
		try {
			while (true) {
				socket=server.accept();
				
				// 클라이언트가 보낸 정보를 받기 위해 입력 스트림 얻기
				isr=new InputStreamReader(socket.getInputStream());
				br= new BufferedReader(isr);
				String msg=br.readLine();
				
				String ip=socket.getInetAddress().getHostAddress();
				System.out.println(ip+ " : " + " 님 접속");
				
				// 클라이언트에게 보내기
				osw=new OutputStreamWriter(socket.getOutputStream());
				bw=new BufferedWriter(osw);
				msg+=System.lineSeparator();
				bw.write(msg+System.lineSeparator());
				bw.flush();
				
			}
		} catch (Exception e) {
			System.out.println("fail");
		} try {
			socket.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		new Ex06_Server();
	}
	
}
