package com.ict.day20;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// DataInputStream, DateOutputStream
// 기본 자료형 데이터를 주고 받을때 사용한다
// ** 반드시 입력 순서와 출력 순서를 맞춰야 한다. 순서를 바꾸게되면 오류는 아니지만 읽지를 못한다
// 기본 생성자가 없어서 BufferedStream 처럼 FileStream  이용
// DataInputStream을 사용해야 읽을 수 있다

public class Ex01 {
	public static void main(String[] args) {
		String pathname = "D:/sh/util/test03.txt";
		File file =new File(pathname);
		
		FileOutputStream fos=null;
		DataOutputStream dos=null;
		
		FileInputStream fis=null;
		DataInputStream dis=null;
		
		try {
			// 출력 준비, 읽을 준비를 하지않으면 새로 생성은 되지만 읽지를 못한다
			fos=new FileOutputStream(file);
			dos=new DataOutputStream(fos);
			
			// writeXXX() : XXX = 기본자료형
			dos.writeChar(97);
			dos.writeChar('D');
			dos.writeBoolean(true);
			dos.writeDouble(178.95);
			dos.writeInt(84);
			dos.writeChar('가');
			dos.flush();
			
			fis=new FileInputStream(file);
			dis=new DataInputStream(fis);
			
			// readXXX() : XXX = 기본 자료형
			// 출력과 입력의 순서가 같아야함. 출력의 첫번째가 char 일 때, 읽는것도 첫번째는 char 이다
			System.out.println(dis.readChar());
			System.out.println(dis.readChar());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readDouble());
			System.out.println(dis.readInt());
			System.out.println(dis.readChar());
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				dis.close();
				fis.close();
				dos.close();
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
