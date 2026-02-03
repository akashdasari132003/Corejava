package com.Practise;

import java.util.Scanner;

public class WhileFactorial {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		if(obj.hasNextInt()) {
			int number = obj.nextInt();
			if(number>=0) {
				
			int fact = 1;
			int i = 1;
			while(i<= number) {
				fact = fact*i;
				 i++;
			}
			System.out.println("factorial is "+ fact);
			} else {
				System.out.println("Enter positive integers only");
			}
			
		}else {
			System.out.println("only integers are allowed");
		}

	}

}
