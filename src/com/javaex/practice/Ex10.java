package com.javaex.practice;

import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i_num;
		
		System.out.println("사번(정수)를 입력해주세요.");
		System.out.print("사번 : ");
		i_num = sc.nextInt();
		
		if ( i_num < 1 ) {
			System.out.println("잘못 입력 하셨습니다.");
		}else if (i_num % 3 == 0) {
			System.out.println("A팀 입니다.");
		}else if (i_num % 3 == 1) {
			System.out.println("B팀 입니다.");
		}else {
			System.out.println("C팀 입니다.");
		}
		
		sc.close();

	}

}
