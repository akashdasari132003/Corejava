package com.version1;

import java.util.Scanner;

public class SwitchExample1 {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("=======================");
		System.out.println("=======================");
		System.out.println("=====WELCOME TO CODEGNAN=======");
		System.out.println("=====Courses Offered=======");
		System.out.println("=====1.JAVA=======");
		System.out.println("=====2.PYTHON=====");
		System.out.println("=====3.DSA========");
		System.out.println("===================");
		System.out.println("===================");
		System.out.println("Enyte your prefered course");
		
		String course = obj.next().toUpperCase();
		switch(course) {
		case "JAVA":
			System.out.println("Duration 100 days");
			System.out.println("Fee 50000.00");
			break;
		case "PYTHON":
			System.out.println("Duration 90 days");
			System.out.println("Fee 40000.00");
			break;
		case "DSA":
			System.out.println("Duration 50 days");
			System.out.println("Fee 30000.00");
			break;
		default:
			System.out.println("Sorry we are not offering this course");
		}
		
		
	}

}
