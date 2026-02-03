package com.practise;

import java.util.Scanner;

public class Practise1 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter first name");
		String fname = obj.nextLine();
		System.out.println("Enter last name");
		String lname = obj.nextLine();
		
		System.out.println("Hello, "+fname+" "+lname+"! Welcome to java Programming !");
		

	}

}
