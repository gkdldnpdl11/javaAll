package com.ict.day19;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 스트림은 지연이 될 수 있으므로 Buffer(임시기억)을 이용해서 지연 현상을 해결한다
// BufferedOutputStream 사용 (혼자서 사용X) / 항상 OutputStream과 같이 사용한다 

public class Ex09 {
	public static void main(String[] args) {
		String pathname="D:/sh/util/test01.txt";
		File file=new File(pathname);
		FileOutputStream fos= null;
		BufferedOutputStream bos= null;
		try {
			// true가 있으면 이어쓰기가 된다. 없으면 덮어쓰기
			fos=new FileOutputStream(file, true);		// 계속 실행시키면 계속 이어쓰기가 된다
			bos=new BufferedOutputStream(fos);		// 위에것이 아래것과 묶여있다 체인스트림
			String msg="한국 ICT 인재 개발원 \n5강의장 \n자바 실습 중\n";
			byte b []=msg.getBytes();
			bos.write(b);
			bos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bos.close();		// fos가 bos에 들어와있으므로 바깥쪽 먼저 닫고 안쪽을 닫아야함
				fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
