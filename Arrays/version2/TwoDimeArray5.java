package com.version2;


public class TwoDimeArray5 {

	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		
		arr[0] = new int[] {10,20,30};
		arr[1] = new int[] {11,12,13};
		arr[2] = new int[] {22,33,44};
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
