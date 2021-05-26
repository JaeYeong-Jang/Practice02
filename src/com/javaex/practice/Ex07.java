package com.javaex.practice;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int num_1;
		int num_2;
		
		int B_num;
		int S_num;
		
		System.out.print("첫번째 숫자 : ");
		num_1 = sc.nextInt();
		
		System.out.print("두번째 숫자 :");
		num_2 = sc.nextInt();
		
		if (num_1 > num_2) {
			B_num = num_1;
			S_num = num_2;
		}else if (num_1 < num_2) {
			B_num = num_2;
			S_num = num_1;
		}else {
			B_num = num_1;
			S_num = num_2;
		}
		
		int cal_quo = B_num / S_num;
		int cal_rem = B_num % S_num;
		
		System.out.println("몫 : " + cal_quo);
		System.out.println("나머지 : " + cal_rem);
		
		
		sc.close();

	}

}
