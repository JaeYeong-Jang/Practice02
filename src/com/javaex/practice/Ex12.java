package com.javaex.practice;

import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("출력되는 내용을 입력하세요.");
		System.out.print("기호 : ");
		char sign = sc.next().charAt(0);
		
		System.out.print("숫자1 : ");
		int num_1 = sc.nextInt();
		
		System.out.print("숫자2 : ");
		int num_2 = sc.nextInt();
		
		if (sign == '+') {
			System.out.println("결과는 : " + (((double)num_1) + ((double)num_2)));
		}else if (sign == '-') {
			System.out.println("결과는 : " + (((double)num_1) - ((double)num_2)));
		}else if (sign == '*') {
			System.out.println("결과는 : " + (((double)num_1) * ((double)num_2)));
		}else if (sign == '/' && num_2 == 0) {
			System.out.println("계산할 수 없습니다.");
		}else if (sign == '/') {
			System.out.println("결과는 : " + (((double)num_1) / ((double)num_2)));
		}else {
			System.out.println("계산할 수 없는 기호입니다.");
		}
		
		sc.close();
		
		
	}

}
