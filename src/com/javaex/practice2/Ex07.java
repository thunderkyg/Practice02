package com.javaex.practice2;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("첫번째 숫자: ");
		int num1 = sc.nextInt();
		System.out.print("두번째 숫자: ");
		int num2 = sc.nextInt();

		if (num1>num2) {
			int factor = (int)(num1/num2);
			int remaining = num1%num2;
			System.out.println("몫: " + factor);
			System.out.println("나머지: " + remaining);
		} else {
			int factor = (int)(num2/num1);
			int remaining = num2%num1;
			System.out.println("몫: " + factor);
			System.out.println("나머지: " + remaining);
		}
		sc.close();
	}
}
