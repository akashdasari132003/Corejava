package com.Practise;

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter range:");
		int range = obj.nextInt();
		
		int first = 0;
		int second = 1;
		
		System.out.print(first+" "+second+" ");
		
		for(int i = 3; i<= range; i++)
		{
			int next = first+second;
			System.out.print(next+" ");
			first = second;
			second = next;
		}

	}

}
