package com.ict.day20;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class Ex10_Output {
	public static void main(String[] args) {
		// VO 이용하여 객체 생성
		Ex10_VO vo1 = new Ex10_VO("고자바", 27, 79.6, true);
		Ex10_VO vo2 = new Ex10_VO("이자바", 19, 46.7, false);
		Ex10_VO vo3 = new Ex10_VO("김자바", 22, 70.6, true);
		Ex10_VO vo4 = new Ex10_VO("가자바", 10, 79.7, true);
		Ex10_VO vo5 = new Ex10_VO("나자바", 35, 39.6, false);
		Ex10_VO vo6 = new Ex10_VO("박자바", 39, 42.2, true);
		Ex10_VO vo7 = new Ex10_VO("임자바", 30, 54.8, true);
		Ex10_VO vo8 = new Ex10_VO("배자바", 13, 32.6, false);

		// 직렬화 : 파일에 저장
		String pathname = "D:/sh/util/object02.txt";
		File file = new File(pathname);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			fos=new FileOutputStream(file);
			bos=new BufferedOutputStream(fos);
			oos=new ObjectOutputStream(bos);
			
			// 객체 직렬화
			// 객체가 여러개 일때는 컬렉션으로
			ArrayList<Ex10_VO>list=new ArrayList<Ex10_VO>();
			list.add(vo1);
			list.add(vo2);
			list.add(vo3);
			list.add(vo4);
			list.add(vo5);
			list.add(vo6);
			list.add(vo7);
			list.add(vo8);
			
			// 객체 직렬화
			oos.writeObject(list);
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
