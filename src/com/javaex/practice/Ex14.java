package com.javaex.practice;

import java.util.Scanner;

public class Ex14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int rev;
		
		System.out.println("수익을 입력해 주세요.");
		System.out.println("금익 : ");
		rev = sc.nextInt();
		
		double tax_0to10M = (0.09 * rev);
		double tax_10Mto40M = 1000 * 0.09 + 0.18 *(rev-1000);
		double tax_40Mto80M = 1000 * 0.09 + 3000 * 0.18 + 0.27 * (rev - 4000);
		double tax_mt80M = 1000 * 0.09 + 3000 * 0.18 + 4000 * 0.27 + 0.36 * (rev - 8000);
		
		if ( rev < 0 ) {
			System.out.println("잘못 입력했습니다.");
		}else if ( rev >= 0 && rev <= 1000 ) {
			System.out.println("소득세는 " + tax_0to10M + " 입니다.");
		}else if ( rev > 1000 && rev <= 4000 ) {
			System.out.println("소득세는 " + tax_10Mto40M + " 입니다.");
		}else if ( rev > 4000 && rev < 8000 ) {
			System.out.println("소득세는 " + tax_40Mto80M + " 입니다.");
		}else {
			System.out.println("소득세는 " + tax_mt80M + " 입니다.");
		}
		
		sc.close();
		
	}

}
