package com.ict.day20;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class Ex10_Input {
	public static void main(String[] args) {
		String pathname = "D:/sh/util/Object02.txt";
		File file = new File(pathname);

		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInput ois = null;
		
		try {
			fis=new FileInputStream(file);
			bis=new BufferedInputStream(fis);
			ois=new ObjectInputStream(bis);
			
			// 대상이 여러개일때 역직렬화
			ArrayList<Ex10_VO>list=(ArrayList<Ex10_VO>)ois.readObject();
			System.out.println("이름\t나이\t몸무게\t성별");
			for (Ex10_VO k : list) {
				System.out.print(k.getName()+"\t");
				System.out.print(k.getAge()+"\t");
				System.out.print(k.getWeight()+"\t");
				if (k.isGender()) {
					System.out.println("\t"+"male");
				} else {
					System.out.println("\t"+"female");
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				fis.close();
				bis.close();
				ois.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
