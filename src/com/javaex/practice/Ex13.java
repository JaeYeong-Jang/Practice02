package com.javaex.practice;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.println("숫자를 입력해 주세요.");
		System.out.print("숫자 : ");
		int i_num = sc.nextInt();
		
		double negative_result = (double)((i_num*i_num*i_num)-(9*i_num)+2);
		double positive_result = (double)(7*i_num +2);
		
		if (i_num <= 0) {
			System.out.println("계산결과는 " + negative_result + " 입니다.");
		}else {
			System.out.println("계산결과는 " + positive_result + " 입니다.");
		}
			
		sc.close();
		

	}

}
