package test;

public class Exam_01 {
	public static void main(String[] args) {

		// int k1=10 홀짝구분
		int k1=10;
		if (k1%2==0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		System.out.println();
		
		// char k2=대문자,소문자,숫자, 기타문자 구분 / 다중if문 사용
		char k2='0';
		if (k2>='a'&& k2<='z') {
			System.out.println("소문자");
		} else if (k2>='A'&&k2<='Z') {
			System.out.println("대문자");
		} else if (k2>='0'&&k2<='9') {
			System.out.println("숫자");
		} else {
			System.out.println("기타문자");
		}
		System.out.println();
		
		// 1-10 홀수 for문이용 출력
		for (int i = 1; i < 11; i++) {
			if (i%2==1) {
				System.out.println(i);
			}
		}
		System.out.println();
		
		// 이중 for문 구구단 출력
		for (int i = 2; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.println(i +"*"+ j+ "="+(i*j));
			}
		}
		System.out.println();
		
		// char k3=A,a 아프리카, B,b=브라질, C,c=캐나다, 나머지 한국 switch~case
		char k3='g';
		switch (k3) {
		case 'A' : 
		case 'a' : System.out.println("아프리카");	break;
		case 'B' : 	
		case 'b' : System.out.println("브라질");	break;
		case 'C' : 	
		case 'c' :  System.out.println("캐나다");	break;
		default : System.out.println("한국");	break;
		}
		
	}
}
