package com.version8;
public class Frog implements Swimmable, Jumpable {

	@Override
	public void jump() {
		System.out.println("Frog Can Jump");
		
	}

	@Override
	public void swim() {
		System.out.println("Frog Can Swim");
		
	}
	

}
