package com.urdomain.lecture.ch13;

public class BoxingMethodExample {
	
	public static void main(String[] args) {
		
		Box<Integer> box = Util.<Integer>boxing(100);
		int rtInt = box.get();
		
		System.out.println("rtInt : "+rtInt);
		
		Box<String> box2 = Util.<String>boxing("Subin");
		String rtString = box2.get();
		
		System.out.println("rtString : "+rtString);
		
		
	}
}
