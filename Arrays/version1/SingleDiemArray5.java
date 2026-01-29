package com.version1;

import java.util.Scanner;

public class SingleDiemArray5 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		int marks [] = new int[6];
		
		
		
		for(int index = 0; index < marks.length; index++) {
			System.out.println("Enetr value of index "+index);
			
			marks[index] = obj.nextInt();
			
		}
		System.out.println(" ");
		
		for(int index = 0; index < marks.length; index++) {
			System.out.print(marks[index]+" ");
			
		}
		
		//System.out.println(marks[5]);
	}

}
