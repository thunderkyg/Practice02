package com.javaex.practice2;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("수익을 입력해 주세요");
		System.out.print("금익: ");
		double income = sc.nextInt();
		
		
		if (income<0) {
			System.out.println("잘못 입력했습니다.");
		} else if(0<=income && income<=1000) {
			double tax = (income*0.09);
			System.out.println("소득세는 " + tax + " 입니다.");
		} else if(income<=4000){
			double tax1 = 90.0 + (income-1000)*0.18;
			System.out.println("소득세는 " + tax1 + " 입니다.");
		} else if (income<8000) {
			double tax2 = 90.0 + 540.0 + (income-4000)*0.27;
			System.out.println("소득세는 " + tax2 + " 입니다.");
		} else {
			double tax3 = 90.0 + 540.0 + 1080.0 + (income-8000)*0.36;
			System.out.println("소득세는 " + tax3 + " 입니다.");
		}
		sc.close();
	}

}
