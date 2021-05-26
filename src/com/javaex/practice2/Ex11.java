package com.javaex.practice2;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("알파벳 1글자(소문자)를 입력하세요");
		System.out.print("알파벳: ");
		String alphabet = sc.next();
		
		switch (alphabet) {
		
		case "a":
		case "e":
		case "i":
		case "o":
		case "u": 
		case "A":
		case "E":
		case "I":
		case "O":
		case "U": 
			System.out.println("모음입니다.");
			break;
		default:
			System.out.println("자음입니다.");
		}
		sc.close();
		}
	}

