package com.version1;

public class MinMax {

	public static void main(String[] args) {
		
		int arr[] = {23,47,-94,85,-0,7};
		
		int max = arr[0];
		int min = arr[0];
		
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
			if(arr[i]<min) {
				min = arr[i];
		}

	}
		System.out.println("Maximum elemenet is "+ max);
		System.out.println("Minimum elemenet is "+ min);
	}

}
