package com.version1;

public class Test {

	public static void main(String[] args) {
		User Akash = new User();
		Akash.getFood(new Zomato());
		
		User gayathri = new User();
		gayathri.getFood(new Swiggy());
		
		
		User Teja = new User();
		Teja.getFood(new Kfc());

	}

}
