package com.Practise;

import java.util.Scanner;

public class DoWhileFactorial {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a number");
		if(obj.hasNextInt()) {
			int number = obj.nextInt();
			if(number>=0) {
				
			int fact = 1;
			int i = 1;
			do {
				fact = fact*i;
				 i++;
			}while(i<= number);
			System.out.println("factorial is "+ fact);
			} else {
				System.out.println("Enter positive integers only");
			}
			
		}else {
			System.out.println("only integers are allowed");
		}

	}

}
