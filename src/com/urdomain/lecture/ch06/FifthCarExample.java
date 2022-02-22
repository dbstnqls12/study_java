package com.urdomain.lecture.ch06;

public class FifthCarExample {

	public static void main(String[] args) {
		
		FifthCar fifthCar = new FifthCar();
		
		fifthCar.keyTurnOn();
		fifthCar.run();
		int speed = fifthCar.getSpeed();
		System.out.println("현재속도 : "+speed+"km/h");
		
	}
}
