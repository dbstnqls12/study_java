package com.urdomain.lecture.ch06;

public class FianlCarExample {

	public static void main(String[] args) {
		
		FinalCar finalCar = new FinalCar();
		
		//잘못된 속도 변경
//		finalCar.speed;	//private라서 다른 클래스에서 사용 불가
		finalCar.setSpeed(-50);	
		
		System.out.println("현재 속도 : "+finalCar.getSpeed());
		
		//올바른 속도 변경
		finalCar.setSpeed(60);
		
		//멈춤
		if(!finalCar.isStop()) {
			finalCar.setStop(true);
		}
		System.out.println("현재 속도 : "+finalCar.getSpeed());
	}
}
