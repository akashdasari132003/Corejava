package com.version1;

import java.util.Scanner;

public class EligibilityChecker {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter your age");
		if(obj.hasNext()) {
			int age = obj.nextInt();
			if(age >=0 && age <= 100);{
				if(age>=18){
					System.out.println("you are eligible for vote");
				}else {
					System.out.println("you are not eligible for vote");

				}
				
			}
		}
	}
}
		
		




