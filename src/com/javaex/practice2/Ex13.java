package com.javaex.practice2;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요");
		System.out.print("숫자: ");
		int x = sc.nextInt();
		
		if (x<=0) {
			double sum = (x*x*x) - (x*9) + 2;
			System.out.println("계산결과는 " + sum + " 입니다.");
		} else { 
			double sum = (x*7) + 2;
			System.out.println("계산결과는 " + sum + " 입니다.");
		}
		System.out.println();
		
		sc.close();
	}

}
