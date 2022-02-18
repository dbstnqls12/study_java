package com.urdomain.lecture.ch06;

public class CarProgram {

	public static void main(String[] args) {
	
		int a = 1;
		Car car = new Car();	//car객체에 함수를 실행하겠다
		
		Car car2;
		car2 = new Car();
		
//		객체접근연산자
//		car.Company;
		
		System.out.println("car.Company : "+car.Company);
		
		car.c = car.a + car.b;
		System.out.println("car.c : "+car.c);
		
		car.c = car.speedUp(10);
		
		System.out.println("car.c : "+car.c);
		
	}
}
