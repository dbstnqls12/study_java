package com.urdomain.lecture.ch06;

public class SixthCarExample {

	static String name = "윤수빈";
	
	public static void main(String[] args) {
		
		name = "전지현";
		
		SixthCar myCar = new SixthCar("포르쉐");
		SixthCar yourCar = new SixthCar("벤츠");
	
		myCar.run();
		yourCar.run();
		
		print("qwe");
	}
	public static void print(String msg) {
		System.out.println(msg);
	}
}
//static안에서는 1.static으로 선언된 함수나 필드 2.따로 선언해서 사용가능
