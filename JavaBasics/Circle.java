package com.practise;

import java.util.Scanner;

public class Circle {
	
	public static void printArea(double radius) {
		final double PI = 3.1459;
		double area = PI*radius*radius;
		System.out.println("Area of circle is" + area);
		
	}
	public static void printPerimeter(double radius) {
		final double PI = 3.1459;
		double periMeter = 2 *PI*radius;
		System.out.println("Perimeter of circle is" + periMeter);
		
		
		
	}

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter radius");
		double radius = obj.nextDouble();
		
		printArea(radius);
		printPerimeter(radius);



	}

}
