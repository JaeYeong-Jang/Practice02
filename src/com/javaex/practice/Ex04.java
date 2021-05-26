package com.javaex.practice;

import java.util.Scanner;

public class Ex04 {

	public static void main(String[]args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나이를 입력하세요.");
		System.out.print("나이 : ");
		int age = sc.nextInt();
		
		if (age <= 0 ) {
			System.out.println("잘못된 입력입니다.");
		}else if ( age >= 19 && age < 65 ) {
			System.out.println("1번그룹");
		}else {
			System.out.println("2번그룹");
		}
		
		sc.close();
		
	}
}
