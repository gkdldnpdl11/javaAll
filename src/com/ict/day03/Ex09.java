package com.ict.day03;

public class Ex09 {
	public static void main(String[] args) {
		// 카페모카 6500원
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가? (단, 부가세 10% 포함)
		
		// 예시(내가)
		// int c1=6500;
		// int c2=15000;
		// int c3=1; // ???
		// c1*=++c3;
		// double v1=0.1;
		// c1+=(c1*=v1);
		// c2-=c1;
		// System.out.println(c2+"원");
		
		
		// 카페모카 6500원
		// 친구와 둘이서 15000원을 내고 주문했다.
		// 잔돈은 얼마인가? (단, 부가세 10% 포함)
				
		// 입력 정보
		// String coff = "카페모카";
		int input = 15000;
		int dan = 6500;
		int su = 2;
		int total = dan*su;
		int vat = total/10;
		int vat1=(int) (total*0.1);
		System.out.println(vat);
		System.out.println(vat1);

		int sum=total+vat;
		System.out.println(sum);
		
		// 다른 방법
		int sum2=(int)(total*1.1);
		System.out.println(sum2);
		
		int output= input-sum;
		System.out.println("잔돈 : "+output);
				
	}
}
