package com.javaex.practice;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 숫자 : ");
		int i_num1 = sc.nextInt();
		
		System.out.print("두번째 숫자 : ");
		int i_num2 = sc.nextInt();
		
		int B_num;
		int S_num;
		
		if (i_num1 == i_num2) {
			System.out.println("두 수가 같습니다.");
		}
		else if ( i_num1 > i_num2 ) {
			B_num = i_num1;
			S_num = i_num2;
			if ( B_num % S_num == 0) {
				System.out.println(S_num + " 는(은) " + B_num + " 의 약수입니다.");
			}else {
				System.out.println(S_num + " 는(은) " + B_num + " 의 약수가 아닙니다.");
			}
		}else {
			B_num = i_num2;
			S_num = i_num1;
			if ( B_num % S_num == 0) {
				System.out.println(S_num + " 는(은) " + B_num + " 의 약수입니다.");
			}else {
				System.out.println(S_num + " 는(은) " + B_num + " 의 약수가 아닙니다.");
			}
		}
		
		
		
		
		sc.close();

	}

}
