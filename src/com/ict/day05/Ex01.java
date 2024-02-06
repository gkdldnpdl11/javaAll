package com.ict.day05;

public class Ex01 {
	public static void main(String[] args) {
		// switch case : 다중 if ~ else문과 같은 조건문
		// if 조건식 boolean형, 즉 비교연산, 논리연산, boolean형 일때
		// switch문 : 인자값이 int 이하, char, String 일 때 사용
		//						 long, 실수형 일 때 사용 불가
		// 형식) switch(인자값=int, char, String){
		// 			case 조건값1 : 인자값과 조건값1이 같을 때 수행할 문장; break;
		// 			case 조건값2 : 인자값과 조건값2이 같을 때 수행할 문장;
		// 			인자값과 조건값2이 같을 때 수행할 문장; break;
		// 			case 조건값3 : 인자값과 조건값3이 같을 때 수행할 문장; break;
		// 			default : 조건값 1,2,3 모두 같지 않을 때 수행할 문장;
		// 			}
		// ** 주의사항 : break가 없으면 break를 만날때까지 모든 실행문을 실행한다.
		// break문의 역할은 현재 실행 중인 범위{(블록)}을 벗어나는 역할을 한다.
		// default는 생략 가능;
		
		// char는 char 형식 / String은 String 형식 / int는 int(정수) 형식
		// 	인자값과 조건값의 형식은 동일하게 해야한다.
				

		// int k1이 1이면 카페모카, 2이면 카페라떼, 3이면 아메리카노, 4이면 과일주스
		// 가장 보편적인 방법
		
		// int k1=3;
		// String res="";
		// if (k1==1) {
		// res="카페모카";
		// } else if (k1==2) {
		// res="카페라떼";
		// } else if (k1==3) {
		// res="아메리카노";
		// } else if (k1==4){
		// res="과일주스";
		// }
		// System.out.println(res);

		// 그닥 안좋은방법인데 switch문과 비교를 위해서
		int k1 = 3;
		String result = "";
		if (k1 == 1) {
			System.out.println("카페모카");
		} else if (k1 == 2) {
			System.out.println("카페라떼");
		} else if (k1 == 3) {
			System.out.println("아메리카노");
		} else if (k1 == 4) {
			System.out.println("과일주스");
		}
		System.out.println(result);

		// if문과 다르게 위에서 순차적으로 내려오면서 필터링하는 방법이 아니라
		// 		모든 case에서 동일한 인자값을 찾아내는 방법
		// 현재 k1=3이기에 아메리카노 도출
		// 	그러나 break가 없으면 아메리카노와 과일주스(블록 안의 마지막 case)까지 함께 도출됨
		switch (k1) { 											// k1이
		case 1:
			System.out.println("카페모카");
			break; 												// k1이 1인 경우 실행
		case 2:
			System.out.println("카페라떼");
			break; 												// k1이 2인 경우 실행
		case 3:
			System.out.println("아메리카노");
			break; 												// k1이 3인 경우 실행
		case 4:
			System.out.println("과일주스");
			break; 												// k1이 4인 경우 실행
		}

		// char k2가 A이면 아프리카, B이면 브라질, C이면 캐나다, 나머지 한국
		char k2 = 'G';
		String result2 = "";
		switch (k2) {
		case 'A':
			result2 = "아프리카";
			break;
		case 'B':
			result2 = "브라질";
			break;
		case 'C':
			result2 = "캐나다";
			break;
		default:
			result2 = "한국";
			break;
		}
		System.out.println("결과 : " + result2);

		// 범위나 비교연산자가 들어가는 계산식은 if문으로 사용
		// char k3가 A, a이면 아프리카, B, b이면 브라질, C, c이면 캐나다, 나머지 한국
		char k3 = 'b';
		String result3 = "";
		switch (k3) {
		case 'A':
			result3 = "아프리카";
			break;
		case 'a':
			result3 = "아프리카";
			break;
		case 'B':
			result3 = "브라질";
			break;
		case 'b':
			result3 = "브라질";
			break;
		case 'C':
			result3 = "캐나다";
			break;
		case 'c':
			result3 = "캐나다";
			break;
		default:
			result3 = "한국";
			break;
		}
		System.out.println("결과 : " + result3);
		System.out.println();

		// char k4가 A, a이면 아프리카, B, b이면 브라질, C, c이면 캐나다, 나머지 한국
		char k4 = 'b';
		String result4 = "";
		switch (k4) {
		case 'A':
			
		case 'a':
			result4 = "아프리카";
			break;
		case 'B':
			
		case 'b':
			result4 = "브라질";
			break;
		case 'C':
			
		case 'c':
			result4 = "캐나다";
			break;
		default:
			result4 = "한국";
			break;
		}
		System.out.println("결과 : " + result4);
		// switch문을 이용한 범위 계산 방법;
		// A or a는 아프리카 도출인데 A는 조건값이 없고 break가 없음
		// A 이거나 a일때 같은 값을 도출하기 때문에 A,a는 범위 지정에 대한 도출이 가능하다.
		
		
		// String k5가 한국이면 서울, 중국이면 베이징, 일본이면 도쿄, 미국이면 워시턴 도출
		String k5="미국";
		String result5="";
		switch (k5) {
		case "한국":
			result5="서울";
			break;
		case "중국":
			result5="베이징";
			break;
		case "일본":
			result5="도쿄";
			break;
		case "미국":
			result5="워싱턴";
			break;
		}
		System.out.println(k5+"의 수도는 "+result5);
		// switch문은 범위가 넓어지면 사용하지말자(if문 사용)
		System.out.println();
		
		// int k6의 점수가 90 이상이면 A, 80 이상이면 B, 70 이상이면 C, 나머지 F
		int k6=83;
		String result6="";
		// switch (k6) {
		// case 100 : break;
		// case 99 : break;
		// case 98 : break;
		// default : 
		//	break;
		// }
		
		switch ((int)k6/10) {
		case 10 :
			
		case 9 :
			result6="A";
			break;
		case 8 :
			result6="B";
			break;
		case 7 :
			result6="C";
			break;
		default:
			result6="F";
			break;
		}
		System.out.println("결과 : "+result6+" 학점");
		
	}
}
