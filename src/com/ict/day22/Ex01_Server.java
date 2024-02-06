package com.ict.day22;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Ex01_Server {
	// 서버에 넣을 리스트 생성 및 소켓(클라이언트와 연동) 생성
	ArrayList<Ex01_ServerClients> list =null;
	ServerSocket ss=null;
	
	public Ex01_Server() {
		try {
			list = new ArrayList<Ex01_ServerClients>();
			ss = new ServerSocket(7009);
			System.out.println("Server Start");

			play();
		} catch (Exception e) {
		}
	}
	
	public void play() {
		while (true) {
			try {
				// 전역변수 소켓을 지역변수에 생성하여 전역변수 소켓에서 여러개 동시생성 할수있게 만들어줌
				Socket s=ss.accept();
				Ex01_ServerClients clients = new Ex01_ServerClients(s, this);
				new Thread(clients).start();
				list.add(clients);
				
			} catch (Exception e) {
				
			}
		}
	}
	
	// 모든 리스트에 있는 사람에게 메세지 전달
	public void sendMsg (Ex01_Protocol p) {
		for (Ex01_ServerClients k : list) {
			try {
				k.out.writeObject(p);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	// 리스트에서 자기 자신을 삭제하는 메소드
	public void removeClient(Ex01_ServerClients sc) {
		list.remove(sc);
	}
	
	public static void main(String[] args) {
		new Ex01_Server();
	}
}
