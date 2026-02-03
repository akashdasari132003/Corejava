package com.version8;
public class Human implements Walkable, Swimmable, Jumpable{

	@Override
	public void jump() {
		System.out.println("Human Can Jump");
		
	}

	@Override
	public void swim() {
		System.out.println("Human Can Swim");
		
	}

	@Override
	public void walk() {
		System.out.println("Human Can Walk");
		
	}
	
}
