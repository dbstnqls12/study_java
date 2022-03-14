package com.urdomain.lecture.ch13;

import java.security.Provider.Service;

public class BoxExample {

	public static void main(String[] args) {
		
		Box<String> box = new Box<String>();
		//Box 객체 중에서 한개 죽, 지네릭타입은 String 으로 된 것!
		//String t;
		box.set("윤수빈");
		String str = box.get();
		System.out.println("str : "+str);
		
		Box<Integer> box2 = new Box<Integer>();
		//t : Integer t;
		box2.set(11);
		int number = box2.get();
		System.out.println("number : "+number);

		Box<Double> box3 = new Box<Double>();
		//t : Double t;
		box3.set(0.3);
		double number2  = box3.get();
		System.out.println("number : "+number);
		
		
	}
}
