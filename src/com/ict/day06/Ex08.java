package com.ict.day06;

public class Ex08 {
	public static void main(String[] args) {
		String str="ICT 인재개발원 5강의장";
		
		// 1. charAt(int index) : char
		// 위치정보((index) : 0부터 시작)가 숫자로 들어오면 해당 위치에 존재하는 문자를 반환한다.
		// 잘안씀
		char c1= str.charAt(7);
		System.out.println(c1);
		
		str="대한민국 I Love You 1004 ♥";
		// str의 모든 글자를 대문자로 만들자 ( 소문자 = 대문자 - 32 )
		
		// 해당 문자의 위치정보를 가지고 하나씩 꺼내어 검사할 수 있다
		for (int i = 0; i < str.length(); i++) {
			char c2 = str.charAt(i);
			if (c2>='a'&&c2<='z') {
				c2=(char)(c2-32);
			}
		System.out.print(c2);
		}
		System.out.println();
		
		// 2. concat(String str) : String
		// 입력된 문자열을 현재 문자열과 합친다. ("문자열" + "문자열"과 같은 결과값)
		String s1="대한민국";
		String s2=s1.concat("KOREA");
		System.out.println(s2);
		
		String s3=" KOREA";
		String s4=s1.concat(s3);
		System.out.println(s4);
		
		// 3. contains(CharSequence s) : boolean
		// CharSequence는 char 값을 순서대로 읽을 수 있다.
		//	지금은 String 이라고 생각 (아직안배움)
		// String을 넣어주면 해당 문자열에 입력된 String이 존재하면 true, 존재하지 않으면 false
		String s5="gkdldnpdl11@gmail.com";
		boolean res=s5.contains("@");
		// boolean res=s5.contains('@');										// char 사용불가 ('')	
		System.out.println("결과 = "+res);
		System.out.println("결과 = "+s5.contains(".com"));
		System.out.println("결과 = "+s5.contains(".COM"));		// 대소문자 구분;
		
		// 4. equals(Object anObject) : boolean
		//		입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구분)
		// 5. equalsIgnoreCase(String anotherString) : boolean
		//		입력된 문자열과 현재 문자열이 같으면 true, 다르면 false (대소문자 구분하지 않는다)
		// ** 문자열과 문자열을 같다고 비교할때는 ==를 사용하지 않는다
		String s6="korea";
		String s7="KOREA";
		
		if (s6.equals(s7)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (s6.equalsIgnoreCase(s7)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		// 6. format(String format, Object... args) : static String
		// 	형식을 지정하고 형식에 맞춰서 문자열 생성
		String s8="한국 ICT 인재 개발원";
		
		// %s 문자열 (규격에 맞춰 출력할때)
		String s9=String.format("@@ %s !! 화이팅", s8);	// s8에 저장된 문자열을 %s로 저장함
		System.out.println(s9);											// 저장된 s8의 문자열을 ""안에 포함된 문자들과 함께 출력
		
		// %30s 30자리 차지하는 문자열 (남은 자리는 비워둔다.) 오른쪽 정렬
		String s10= String.format("%30s", s8);
		System.out.println(s10);
		
		// 마이너스는 왼쪽 정렬이 된다.
		String s11= String.format("%-30s", s8);
		System.out.println(s11);
		
		String s12= String.format("%20s !!", s8);
		System.out.println(s12);
		
		// %d 정수형식 (문자열을 사용하면서 정수와 문자를 동시에 출력 가능하다. String을 사용하기 때문)
		// 잘 안씀
		int k1=2134;
		String s13=String.format("%d &&", k1);
		System.out.println(s13);
		
		String s14=String.format("%10d @@", k1);
		System.out.println(s14);
		
		String s15=String.format("%-10d @@", k1);
		System.out.println(s15);
		
		// %f 실수형식 지정 
		// 지정한 소수점 자리에서 반올림이 되기 때문에 정확한 값을 구할때는 사용하면 안됨
		// ex) 1.1456 -> 1.1 -> 1.5 -> 1.6
		double s16=123.445678;
		String s17=String.format("%f", s16);
		System.out.println(s17);
		
		String s18=String.format("%.2f", s16);			// 소수점 둘째자리에서 반올림
		System.out.println(s18);
		
		String s19=String.format("%.4f", s16);			// 소수점 넷째자리에서 반올림
		System.out.println(s19);
		
		// %s, %f 2개가 사용된다
		
		// 7. getByte() : byte[]
		// 해당 문자열을 byte[]로 변환시킨다.
		// 보통 입출력할때 사용한다. (대소문자, 숫자 가능, 영어 이외의 글자는 불가능)
		// 나중에 배열[]을 배운 후에 한다
		
		// 8. indexOf(int ch), indexOf(String str) : int
		// 					ch=char						str=String
		// 	입력된 문자(ch), 문자열(str)의 위치값을 (숫자로)알려준다.
		// 	문자나 문자열이 없으면 -1을 반환
		// charAt(int index)과 반대 개념
		String h1="BufferedReader";
		int h2=h1.indexOf('f');			// 첫번째 문자만 찾을 수 있다. (중복되는 문자는 찾을 수 없다)
		System.out.println(h2);
		
		h2=h1.indexOf("er");
		System.out.println(h2);
		
		h2=h1.indexOf("err");			// 기준값에 없는 문자를 넣으면 -1 도출
		System.out.println(h2);			// -1이 도출되면 기준값에 없다는 뜻
		
		// 9. indexOf(int ch, int formIndex), indexOf(String str, int formIndex) : int
		// 		fromIndex는 시작 위치를 뜻한다
		// 2번째, 3번째 문자나 글자를 찾기 위함
		
		// 두번째 e를 찾아라 (우선 첫번째 e를 찾아라)
		int h3=h1.indexOf('e');
		System.out.println(h3);					// 결과 : 4
		
		int h4=h1.indexOf('e',h3+1);			// 첫번째 'e'의 위치값 4 -> 4+1하여 5부터 재검색 
		System.out.println(h4);					// 결과 : 6
		
		// 10. lastIndexOf(int ch), lastIndexOf(String str) : int
		// 마지막 문자나 문자열을 찾을 때 사용
		int h5=h1.lastIndexOf('e');
		System.out.println(h5);
		
		// 11. length() : int 
		// 문자열의 길이를 구한다. (1부터 시작한다)
		// index와 length는 항상 1의 차이가 존재한다
		String str1="Hello";
		System.out.println("길이 : "+str1.length());
		
		// 12. replace(char oldChar, char newChar) : String
		// 	   replace(CharSequence target, CharSequence replacment) : String
		//	지금은 replace(String oldString, String newString) : String : String
		// 새로운 문자나 문자열을 받아서 치환한다 (위치 변환)
		String str2="대한민국";
		String str3=str2.replace('민', '民');
		System.out.println(str3);
		
		String str4=str2.replace("한", "한 ♥ ");
		System.out.println(str4);
		
		String q1=str2.replace("한솔", "한 ♥ "); 		// 찾는 문자열이 없으므로 변경되지않고 기준값 그대로 출력됨
		System.out.println(q1);
		
		// 13. isEmpty() : boolean
		// 해당 문자열이 비어있으면 true, 내용이 있으면 false
		String str5="대한민국";
		System.out.println(str5.isEmpty());
		
		String str6="";
		System.out.println(str6.isEmpty());
		
		// 오류 발생 : Exception
		// String str7=null;
		// System.out.println(str7.isEmpty());
		
		// 14. split(String regex) 			     : String[]
		// 	   split(String regex, int limit) : String[]
		// 배열 배운 이후에 함
		
		// 15. substring(int beginIndex) 						: String
		//			입력된 시작 위치부터 끝까지 문자열 추출
		
		// 	  substring(int beginIndex, int endIndex) : String
		//			입력된 시작 위치부터 입력된 끝 위치 전까지의 문자열 추출(끝 위치의 문자는 포함하지 않음)
		//				endIndex - beginIndex = 추출할 문자의 갯수
		String t1="010-6522-0670";
		String t2=t1.substring(4);
		System.out.println(t2);			// 6522-0670
		
		t2=t1.substring(9);
		System.out.println(t2);			// 0670
		t2=t1.substring(t1.indexOf('-')+1);			// 첫번째 '-'를 찾음
		System.out.println(t2);			// 0670
		
		String t3=t1.substring(4, 8);  					// 지정한 끝 문자는 포함하지 않기 때문에 8
		System.out.println(t3);			// 6522
		
		// 010-7777-9999 => 010-7777-****, 010-****-9999
		String t4="010-7777-9999";
		String t5="****";
		System.out.println(t4.replace(t4.substring(9), t5));
		System.out.println(t4.replace(t4.substring(4,8), t5));
		
		// 16. toLowerCase() : String => 해당 문자열을 소문자로 변경
		//	17. toUpperCase() : String => 해당 문자열을 대문자로 변경
		String t6= "대한민국 I Love You @ 1004";
		System.out.println(t6.toUpperCase());
		System.out.println(t6.toLowerCase());
		
		// 18. toString : String
		// 모든 클래스의 toString : 모든 객체(클래스)에서 사용 가능
		// 										객체(클래스)가 가지고 있는 정보나 값(데이터)들을 
		//											문자열로 만들어서 변환하는 메서드
		// String 의 toString은 문자열 자체를 반환한다
		String t7="Java 17 자바 17";
		String t8=t7.toString();
		System.out.println(t7);
		System.out.println(t8);
		
		// 19. trim() : String;
		// 		해당 문자열의 앞, 뒤 공백 제거, 중간 공백은 제거하지 않는다.
		String t9="  Java 자바 JAVA  ";
		String t10=t9.trim();
		
		System.out.println(t9);						//   'Java 자바 JAVA  '
		System.out.println(t9.length());			// 문자열의 앞뒤 공백이 있음(길이 16)
		System.out.println(t10);						// 'Java 자바 JAVA'
		System.out.println(t10.length());		// 문자열의 앞뒤 공백을 지움(길이 12)
		
		// 20. startsWith(String prefix) : boolean; => 주어진 문자열로 시작하는지 검색
		// 		startsWith(String prefix, int toffset) : boolean; => 주어진 문자열로 시작하는지 검색
		//																		toffset;    => 시작 위치
		// 		endswith (String suffix) : boolean; => 주어진 문자열로 끝나는지 검색
		
		boolean b1=t10.startsWith("Java");		// t10이 Java로 시작하는지 확인 (true)
		System.out.println(b1);
		
		boolean b2=t10.startsWith("JAVA");		// t10이 JAVA로 시작하는지 확인(false)
		System.out.println(b2);								// JAVA가 포함되어있지만 시작은 Java로 하기 때문
		
		boolean b3=t10.startsWith("자바", 5);		// 위치값(index)은 0부터 시작함
		System.out.println(b3);								// 길이값은 1부터 시작
		
		boolean b4=t10.endsWith("JAVA"); 		// t10이 JAVA로 끝나는지 확인(true)
		System.out.println(b4);
		
		boolean b5=t10.endsWith("Java");			// t10이 Java로 끝나는지 확인(false)
		System.out.println(b5);								// Java가 포함되어있지만 JAVA로 끝나기때문
		System.out.println();
		
		// 21. valueOf(기본자료형) : static String
		// 어떤 기본 자료형이든지 String으로 변경 시킴 = (기본자료형 +"String")
		boolean bo1=true;
		char ch1='c';
		int num1=34;
		long num2=37L;
		float num3=3.1572f;
		double num4=3654.1241;
		
		// 자료형 +1
		System.out.println(bo1);						// true, false만 반환하기 때문에 +1안됨
		System.out.println(ch1+1);					// int에 포함되어 숫자로 반환
		System.out.println((char)(ch1+1));		// char 형 변환으로 문자로 반환
		System.out.println(num1+1);
		System.out.println(num2+1);
		System.out.println(num3+1);
		System.out.println(num4+1);
		System.out.println();
		
		System.out.println(String.valueOf(bo1)+1);		// true1 =>String으로 변환
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println(String.valueOf(num4)+1);
		System.out.println();
		
		System.out.println(bo1+"1");							// 위에것과 동일한 결과값 반환
		System.out.println(ch1+"1");							// 용량의 차이가 있기 때문
		System.out.println(num1+"1");							// valueOf가 더 작은 용량 차지하기 때문
		System.out.println(num2+"1");
		System.out.println(num3+"1");
		System.out.println(num4+"1");
		System.out.println();
		
		// 22. Wrapper 클래스
		// 		기본 자료형의 형태를 가진 문자열을 해당 자료형으로 변경 시키는 클래스들
		// 		기본 자료형을 객체로 만들 때 사용하는 클래스
		
		// 22-1. "true", "false" 문자열을 기본자료형 boolean형으로 변경
		// 												=> Boolean.parseBoolean (String) ;
		// 		  "true", "false" => true, false로 변경
		// 		  "true"를 제외한 문자열 => false		
		String msg="true";														// String => boolean으로 변경
		boolean msg2=Boolean.parseBoolean(msg);			// "true" => true 변경
		System.out.println(msg+1);										// String
		System.out.println(msg2);											// boolean으로 형변환 하였기 때문
		
		msg2=Boolean.parseBoolean("가나다");
		System.out.println(msg2);
		
		// 22-2. "10", "124" 문자열을 기본자료형 int형으로 변경 : Integer.parseInt(String s);
		msg="124";
		int msg3=Integer.parseInt(msg);
		System.out.println(msg+10);									// String이므로 124+10=12410 이 된다
		System.out.println(msg3+10);									// int로 형변환 하였으므로 124+10=134
		System.out.println();
		
		// 22-3. 문자열을 기본자료형인 long형으로 변경 : Long.parseLong(String l);
		// 	"숫자" => ok, "숫자L" => err
		msg = "12345612312";	
		// msg = "12345612312L";						// String 이기 때문에 L 제외 가능
			
		// int 자료형 범위를 벗어났기 때문에 long형의 L을 붙여야된다
		long msg4=12345612312L;	
		// long msg5=1234L;
		System.out.println(msg4+1);
		
		// int형의 범위를 벗어나지 않았기 때문에 L을 붙이지 않아도 된다.
		// long msg6=1234;
		
		long msg5=Long.parseLong(msg);		// L이 붙어있기 때문에 숫자 변환 불가
		System.out.println(msg5+1);				// String에서 L을 제외하면 숫자 값 반환 가능
		System.out.println();
		
		// 22-4. 문자열을 float로 변경 : Float.parseFloat();
		// "숫자f" => ok; (long형은 "숫자L" => err)
		// 가능하면 double 사용
		msg = "32.14f";
		float msg6= Float.parseFloat(msg);
		System.out.println(msg6+10);
		
		// 22-5. 문자열을 double 변경 : Double.parseDouble();
		msg="3.17598";
		double msg7=Double.parseDouble(msg);
		System.out.println(msg7+10);
		
		// 22-6. character.parseCharacter(); 는 존재하지 않는다
		//				즉, 문자열을 char로 변경하는 클래스는 존재하지 않는다.
		// 			그러나, String의 charAt()을 사용하면 char로 만들 수 있다.
		msg = "A";				// char로 형변환을 하려면 한글자만 들어가야지 char형으로 변환 가능하다
		char msg8=msg.charAt(0);					// char형에서의 index(위치값)는 무조건 0이 들어간다
		System.out.println(msg+1);					// String형이기 때문에 A1로 결과 반환
		System.out.println(msg8+1);				// char형이기 때문에 A의 숫자값(65)+1이 된다.
		System.out.println((char)(msg8+1));	// char 형변환 => A+1이기에 B 결과값 반환
		
		// 23. 배열을 배운 후 하자 (1차원 배열)
		//			String.getByte() : byte[]
		// 		String.toCharArray() : char[]
		// 		split (String regex) 				   : String[]
		//			split (String regex, int limit) : String[]
		
	}
}
