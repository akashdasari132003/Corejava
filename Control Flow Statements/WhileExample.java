package com.version1;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		while(true) {
		 System.out.println("Enter your name to get wishes");
		 System.out.println("Enter exit to exit form wishes");
		 String name = obj.nextLine();
		 
		 if(name.equals("exit")) {
			 break;
		 }
		 else {
			 System.out.println("Hello"+name+" Good morning..........");
		 }

	}

}
}
