package com.urdomain.lecture.ch07;

public class Dog extends Animal{

	public Dog() {
		this.kind = "로유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍");
	}
	
	
	
}
