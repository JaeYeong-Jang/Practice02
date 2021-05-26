package com.javaex.practice;

import java.util.Scanner;

public class Ex06 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int first_num;
		int second_num;
		
		System.out.println("숫자 2개를 입력해주세요.");
		
		System.out.print("숫자1 : ");
		first_num = sc.nextInt();
		
		System.out.print("숫자2 : ");
		second_num = sc.nextInt();
		
		int B_num;
		int S_num;
		
		if (first_num > second_num) {
			B_num = first_num;
			S_num = second_num;
			System.out.print("큰수 : " + B_num);
			System.out.println("작은 수 : " + S_num);
		}
		else if(second_num > first_num){
			B_num = first_num;
			S_num = second_num;
			System.out.print("큰수 : " + B_num);
			System.out.println("작은 수 : " + S_num);
		}
		else {
			System.out.println("두 수가 같습니다.");
		}
		
		
		
		sc.close();

	}

}
