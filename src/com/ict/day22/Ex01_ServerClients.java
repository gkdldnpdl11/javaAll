package com.ict.day22;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Ex01_ServerClients implements Runnable {
	Socket s;
	Ex01_Server server;
	
	// 직렬화 (대상클래스(vo), ObjectInputStream, ObjectOutputStream)
	ObjectInputStream in;
	ObjectOutputStream out;
	String nickName;
	
	public Ex01_ServerClients(Socket s, Ex01_Server server) {
		this.s= s;
		this.server=server;
		try {
			in=new ObjectInputStream(s.getInputStream());
			out=new ObjectOutputStream(s.getOutputStream());
		} catch (Exception e) {

		}
	}
	
	// 클라이언트가 보낸 프로토콜이나 메세지 받기
	// 받는 역할은 run()에서 받는다
	@Override
	public void run() {
		esc : while (true) {
			try {
				// **역직렬화
				Object obj= in.readObject();
				if (obj != null) {
					Ex01_Protocol p=(Ex01_Protocol) obj;
					switch (p.getCmd()) {
					// 스위치 문의 브레이크는 스위치문을 빠져나가기 때문에 레이블 추가함
					case 0 : // 접속해제 (while문 밖에서 처리)
						// 받은 정보를 자신에게 그대로 보냄
						out.writeObject(p);
							break esc;	
					case 1 : 	// 대화명 (닉네임) 받기
						nickName=p.getMsg();
						// 메세지 전달(2번) 
						p.setCmd(2);
						p.setMsg(nickName+" 님 입장");
						server.sendMsg(p);
							break;
					case 2 :
						p.setMsg(nickName+" : "+p.getMsg());
						server.sendMsg(p);
							break;
					}
				} 
			} catch (Exception e) {
				
			}
		}
		
		try {
			// cmd=0 이면 접속 해제이므로 아래 코딩 실행 필요
			out.close();
			in.close();
			s.close();
			// 자기 자신은 리스트에서 제외시킴 
			server.removeClient(this);
			// cmd가 2번인 이유는 다른사람에게 보내기 때문임 (0번은 내입장임)
			// 자신을 제외한 사람들에게 메세지 전달
			Ex01_Protocol p=new Ex01_Protocol(2, nickName + " 님 퇴장");
			// 본인을 제외시킨 다음에 남아있는 사람들에게 메세지 전달
			server.sendMsg(p);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
