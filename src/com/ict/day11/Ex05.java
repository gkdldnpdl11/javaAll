package com.ict.day11;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		
		// set을 이용해서 멤버필드의 값을 변경한 것을
		// 생성자를 이용해서 변경
		
		Ex06 coff = new Ex06("커피 음료",1500);
		//		coff.sName("커피 음료");		
		//		coff.sPrice(1500);				
		
		Ex06 ion = new Ex06("이온 음료",2300);
		//		ion.sName("이온 음료");		
		//		ion.sPrice(2300);			
		
		Ex06 cola = new Ex06("탄산 음료",2000);
		//		cola.sName("탄산 음료");		
		//		cola.sPrice(2000);			
		
		Ex06 juice = new Ex06("과일 음료",1800);
		//		juice.sName("과일 음료");		
		//		juice.sPrice(1800);			
		
		Ex06 arr[]= {coff, ion, cola, juice};
		Scanner scan= new Scanner(System.in);
		System.out.print("금액을 투입하세요   >>");
		int input = scan.nextInt();
		int output = 0;
		
		// 1. 1500을 직접 입력하지말고 비교해서 찾자
		// 2. X 표시가 된 제품을 구매하면 마이너스 금액이 나온다 (살수없다고 표시하고 다시 메뉴가 나와야한다)
		esc : while (true) {
			System.out.println("남은 돈 : "+input);
			if (input<coff.gPrice()) {
				System.out.println("금액이 부족합니다");
				// * 잔돈을 물건을 살 수 있는 input으로 전환시킴
				output=input;
				break esc;
			} else {
				System.out.println("커피\t이온\t탄산\t과일\t반환");
				for (int i = 0; i < arr.length; i++) {
					if (arr[i].gPrice() <= input) {
						System.out.print("O\t");
					} else {
						System.out.print("X\t");
					}	
				}
				System.out.println();
				System.out.print("선택하세요  >>");
				String drink=scan.next();
				switch (drink) {
				case "커피": output=input-arr[0].gPrice();	break;
				case "이온": output=input-arr[1].gPrice();	break;
				case "탄산": output=input-arr[2].gPrice();	break;
				case "과일":	output=input-arr[3].gPrice();	break;
				case "반환":	output=input; break esc;
				}
			}
			// * 잔돈을 물건을 살 수 있는 input으로 전환시킴
			input=output;
		}
		System.out.println("잔돈 : " + output);
		
	}
}
