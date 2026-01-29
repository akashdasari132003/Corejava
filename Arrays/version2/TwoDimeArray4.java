package com.version2;


public class TwoDimeArray4 {

	public static void main(String[] args) {
		
		int arr[][] = new int[][]{{10,20,30}, {49,87,90}, {78,98,98}};
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
