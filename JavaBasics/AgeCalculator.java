package com.practise;

import java.util.Scanner;

public class AgeCalculator {

	public static void main(String[] args) {
		final int CURRENT_YEAR = 2026;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter Your Birth Year");
		int birth_year = obj.nextInt();
		
		int age = CURRENT_YEAR - birth_year;
		
		System.out.println("You age is approximately "+age+"years old in"+CURRENT_YEAR);
		

	}
	

}
