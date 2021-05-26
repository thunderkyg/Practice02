package com.javaex.practice2;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("출력되는 내용을 입력하세요");
		System.out.print("기호: ");
		String symbol = sc.next();
		System.out.print("숫자1: ");
		int num1 = sc.nextInt();
		System.out.print("숫자2: ");
		int num2 = sc.nextInt();
		
		switch(symbol) {
		case "+":
			System.out.println("결과는: " + (double)(num1+num2));
			break;
		case "-":
			System.out.println("결과는: " + (double)(num1-num2));
			break;
		case "*":
			System.out.println("결과는: " + (double)(num1*num2));
			break;
		case "/":
			if (num1 == 0 || num2 ==0) {
				System.out.println("계산할 수 없습니다.");
			} else {System.out.println("결과는: " + ((double)num1/(double)num2));
			}
			break;
		default:
			System.out.println("계산할 수 없는 기호입니다.");
		}
		sc.close();
	}
}
