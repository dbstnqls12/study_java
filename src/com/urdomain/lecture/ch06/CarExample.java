package com.urdomain.lecture.ch06;

public class CarExample {

	public static void main(String[] args) {
		
		Car car = new Car();	//Car() 생성자 = 함수이다, new : 연산자

		Student student = new Student();
		
		System.out.println("student.no"+student.no );
		
//		객체접근연산자(.)를 사용하여 car객체변수의 값을 참조
		System.out.println("company : "+car.company);
		System.out.println("model : "+car.model);
		System.out.println("color : "+car.color);
		System.out.println("maxSpeed : "+car.maxSpeed);
		System.out.println("speed : "+car.speed);	//0
		
		car.speed = 100;
		
		System.out.println("speed : "+car.speed);	//100
		
//		speed가 maxSpeed보다 높은지 낮은지를 출력해주는 함수
		speedResult(car.maxSpeed, car.speed);
	}
	
	public static void speedResult(int maxSpeed, int speed) {
		if(maxSpeed > speed) {
			System.out.println("speed가 maxspeed보다 낮습니다");
		}else if(maxSpeed < speed) {
			System.out.println("speed가 maxspeed보다 높습니다");
		}else {
			System.out.println("speed와 maxspeed가 같습니다");
		}
	}
}
