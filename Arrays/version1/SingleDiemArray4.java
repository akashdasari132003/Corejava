package com.version1;

public class SingleDiemArray4 {

	public static void main(String[] args) {
		int marks [] = new int[]{46, 76, 80, 98, 85, 10};
		
		
		
		for(int index = 0; index < marks.length; index++) {
			System.out.print(marks[index]+" ");
			
		}
		System.out.println(" ");
		
		for(int index = marks.length-1; index >= 0; index--) {
			System.out.print(marks[index]+" ");
			
		}
		
		//System.out.println(marks[5]);
	}

}
