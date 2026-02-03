package com.Practise;

import java.util.Scanner;

public class StrongNaumber {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		Factorial factorial = new Factorial();
		System.out.println("Enter a number");
		if(obj.hasNextInt()) {
			int number = obj.nextInt();
			int original_number = number;
			int sum = 0;
			while(number>0) {
				int digit = number%10;
				sum = sum+factorial.fact(digit);
				number = number/10;
			}
			if(sum==original_number) {
				System.out.println("given number is strong number");
			}else {
				System.out.println("Given number is not a strong number");
			}
		}

	}

}
