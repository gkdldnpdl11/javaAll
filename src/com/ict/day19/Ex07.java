package com.ict.day19;

import java.io.File;
import java.io.IOException;

public class Ex07 {
	public static void main(String[] args) {
		String pathname="D:/sh/util";
		File file = new File(pathname);
		try {
			boolean b1=file.createNewFile();
			if (b1) {
				System.out.println("파일 생성 성공");
			} else {
				System.out.println("파일 생성 실패");
			}
			
			File file3 = new File("D:/sh/util/kkk/yyy");
			boolean b2= file3.mkdir();
					if (b2) {
						System.out.println("make Directory");
					} else {
						System.out.println("fail");
					}
					
			boolean b3=file3.mkdirs();
			if (b3) {
				System.out.println("make Directory");
			} else {
				System.out.println("fail");
			}
			
			// 삭제 대상
			String pathname2="D:/sh/util/exam01.txt";
			File file4=new File(pathname2);
			boolean b4= file4.delete();
			if (b4) {
				System.out.println("Flie deleted");
			} else {
				System.out.println("fail");
			}
			
			// 삭제 대상 (대상 폴더 안에 내용이 있으면 삭제 불가)
			String pathname3="D:/sh/util/kkk";
			File file5=new File(pathname3);
			boolean b5= file5.delete();
			if (b5) {
				System.out.println("Directory deleted");
			} else {
				System.out.println("fail");
			}
			
			// 삭제대상 (가장 하위 디렉토리를 삭제)
			String pathname4="D:/sh/util/kkk/yyy";
			File file6=new File(pathname4);
			boolean b6= file6.delete();
			if (b6) {
				System.out.println("Directory deleted");
			} else {
				System.out.println("fail");
			}
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
