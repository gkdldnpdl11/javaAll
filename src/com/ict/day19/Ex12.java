package com.ict.day19;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// D:/sh/util/image01.jpg 파일을 D:/sh/image01.jpg 로 복사

public class Ex12 {
	public static void main(String[] args) {
		String inputPath = "D:/sh/util/image01.jpg";
		String outputPath = "D:/sh/img-2000.jpg";
		
		File in_file=new File(inputPath);
		FileInputStream fis=null;
		BufferedInputStream bis=null;
		
		File out_file=new File(outputPath);
		FileOutputStream fos=null;
		BufferedOutputStream bos=null;
		
		try {
			fis = new FileInputStream(in_file);
			bis= new BufferedInputStream(fis);
			
			fos=new FileOutputStream(out_file);
			bos=new BufferedOutputStream(fos);

			// 모든 복사나 이동은 이 형식을 사용함
			int b=0;
			while ((b=bis.read())!=-1 ) {
				bos.write(b);
				bos.flush();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		// 원본 삭제 = 이동
		if (in_file.delete()) {
			System.out.println("succesful");
		} else {
			System.out.println("fail");
		}
	}
	
}
