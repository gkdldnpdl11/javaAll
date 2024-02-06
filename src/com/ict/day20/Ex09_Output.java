package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

// ObjectOutputStream : 객체 출력 스트림
// writeObject() : 객체 직렬화 메소드  

public class Ex09_Output {
	public static void main(String[] args) {
		// VO 이용하여 객체 생성
		Ex09_VO vo1=new Ex09_VO("고길동", 27, 79.6, true);
		Ex09_VO vo2=new Ex09_VO("이길동", 19, 46.7, false);
		Ex09_VO vo3=new Ex09_VO("김길동", 22, 70.6, true);
		Ex09_VO vo4=new Ex09_VO("가길동", 10, 79.7, true);
		Ex09_VO vo5=new Ex09_VO("나길동", 35, 39.6, false);
		Ex09_VO vo6=new Ex09_VO("박길동", 39, 42.2, true);
		Ex09_VO vo7=new Ex09_VO("임길동", 30, 54.8, true);
		Ex09_VO vo8=new Ex09_VO("배길동", 13, 32.6, false);
		
		// 직렬화 (현재 네트워크를 안배웠으므로 무임금)
		String pathname = "D:/sh/util/Object01.txt";
		File file = new File(pathname);
		
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		ObjectOutputStream oos=null;
			
		try {
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			oos=new ObjectOutputStream(bos);
			
			// 객체 직렬화
			
			// 1. 하나일 때
//			oos.writeObject(vo1);
//			oos.flush();
			
			// 2. 객체가 여러개 일때는 객체를 컬렉션으로 모은다
			ArrayList<Ex09_VO>list = new ArrayList<Ex09_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			list.add(vo6);
			list.add(vo7);
			list.add(vo8);
			
			// 객체 직렬화
			oos.writeObject(list);;
			oos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fos.close();
				bos.close();
				oos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
