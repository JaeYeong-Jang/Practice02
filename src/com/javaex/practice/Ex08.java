package com.javaex.practice;

import java.util.Scanner;

public class Ex08 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int i_num1;
		int i_num2;
		int i_num3;
		int MS_num;
		
		System.out.println("숫자 3개를 입력해주세요.");
		
		System.out.print("숫자 1 : ");
		i_num1 = sc.nextInt();
		
		System.out.print("숫자 2 : ");
		i_num2 = sc.nextInt();
		
		System.out.print("숫자 3 : ");
		i_num3 = sc.nextInt();
		
		if (i_num1 < i_num2 && i_num1 < i_num3) {
			MS_num = i_num1;
			System.out.println("가장 작은 수는 " + MS_num + " 입니다.");
		}else if (i_num2 < i_num1 && i_num2 < i_num3) {
			MS_num = i_num2;
			System.out.println("가장 작은 수는 " + MS_num + " 입니다.");
		}else if (i_num1 == i_num2 && i_num1 == i_num3) {
			System.out.println("세 수가 서로 같습니다.");
		}
		
		
		sc.close();
		

	}

}
