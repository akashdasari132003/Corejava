package com.version2;
public class TwoDimeArray2 {
	public static void main(String[] args) {
		
		int arr[][] = new int[3][3];
		
		arr[0][0] = 20;
		arr[0][1] = 30;
		arr[0][2] = 40;

		arr[1][0] = 25;
		arr[1][1] = 35;
		arr[1][2] = 55;
		
		arr[2][0] = 34;
		arr[2][1] = 54;
		arr[2][2] = 94;
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.println(arr[i][j]);
			}
		}
	}

}
