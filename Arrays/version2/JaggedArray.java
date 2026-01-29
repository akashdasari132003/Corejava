package com.version2;

public class JaggedArray {

	public static void main(String[] args) {
		
int arr[][] = new int[3][];
		
		arr[0] = new int[] {10};
		arr[1] = new int[] {11,13};
		arr[2] = new int[] {22,3456};
		
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}


}
