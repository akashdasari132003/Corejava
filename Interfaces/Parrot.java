package com.version8;
public class Parrot implements Flyable, Walkable {

	@Override
	public void walk() {
		System.out.println("Parrot can Walk");
		
	}

	@Override
	public void fly() {
		System.out.println("Parrot Can Fly");
		
	}
	
	
}
