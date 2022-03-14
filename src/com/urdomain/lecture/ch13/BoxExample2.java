package com.urdomain.lecture.ch13;

public class BoxExample2 {

	public static void main(String[] args) {
		Box<Boolean> box = new Box<Boolean>();
		
		box.set(false);
		box.set(true);
		
		Boolean boolean1 = box.get();
		
		System.out.println("boolean1 : "+boolean1);
	}
}
