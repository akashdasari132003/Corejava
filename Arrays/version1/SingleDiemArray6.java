package com.version1;

import java.util.Scanner;

public class SingleDiemArray6 {

	public static void main(String[] args) {
		
		Scanner obj = new Scanner(System.in);
		double marks [] = new double[6];
		
		
		
		for(int index = 0; index < marks.length; index++) {
			System.out.println("Enetr value of index "+index);
			
			marks[index] = obj.nextDouble();
			
		}
		
		double total_marks = 0.0;
		double average = 0.0;
		
		
		for(int index = 0; index < marks.length; index++) {
			total_marks = total_marks + marks[index];
			
		}
		
		average = total_marks / marks.length;
		
		System.out.println("Total Marks "+total_marks);
		System.out.println("Average "+average);
		
		//System.out.println(marks[5]);
	}

}
