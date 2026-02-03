package com.Practise;

import java.util.Scanner;

public class CalculatorV1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first number");
		double a = obj.nextDouble();
		
		System.out.println("Enter Second number");
		double b = obj.nextDouble();
		
		System.out.println("Enter operation + - * % /");
		char operation = obj.next().charAt(0);
		
		if(operation == '+') {
			double result = Arthmetic.add(a,b);
			System.out.println("Addition is "+result);
		}else {
			if(operation == '-') {
				double result = Arthmetic.sub(a,b);
				System.out.println("Substraction is "+result);
			}else {
				if(operation == '*') {
					double result = Arthmetic.mul(a,b);
					System.out.println("Multiplication is "+result);
				}else {
					if(operation == '/') {
						double result = Arthmetic.div(a,b);
						System.out.println("Division is "+result);
					}else {
						if(operation == '%') {
							double result = Arthmetic.mod(a,b);
							System.out.println("Remider is "+result);
					}else {
						System.out.println("Invalid operation........"); 
					}
				}
			}
		}
	}

	}
}
