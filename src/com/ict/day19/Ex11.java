package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

//스트림은 지연이 될 수 있으므로 Buffer(임시기억)을 이용해서 지연 현상을 해결한다
//BufferedInputStream 사용 (혼자서 사용X) / 항상 InputStream과 같이 사용한다 

public class Ex11 {
	public static void main(String[] args) {
		// 파일 만들 위치 지정
		String pathname = "D:/sh/util/test02.txt";
		File file = new File(pathname);
		FileInputStream fis= null;
		BufferedInputStream bis= null;
		
		try {
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			
			byte b[]= new byte [(int) file.length()];
			fis.read(b);
			String str=new String(b);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bis.close();
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
