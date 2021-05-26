package com.javaex.practice;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		double weight;
		double tall;
		
		System.out.println("키와 몸무게를 입력해주세요.");
		
		System.out.print("키 :");
		tall = sc.nextDouble();
		
		System.out.print("몸무게 : ");
		weight = sc.nextDouble();
		
		double N_cal = (tall - 100) * 0.9;
		
		if (N_cal < weight) {
			System.out.println("과체중 입니다.");
		}else if (N_cal == weight){
			System.out.println("표준체중 입니다.");
		}else {
			System.out.println("저체중 입니다.");
		}
		
		System.out.println("표준체중 : " + N_cal);
		
		sc.close();
		

	}

}
