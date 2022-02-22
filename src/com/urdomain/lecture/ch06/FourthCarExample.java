package com.urdomain.lecture.ch06;

public class FourthCarExample {
	
	public static void main(String[] args) {
		
		FourthCar fourthCar = new FourthCar();
		
		fourthCar.setGas(3);	//Car의 setGas() 메소드 호출
			
		boolean gasState = fourthCar.isLeftGas();	//Car의 isLeftGas() 메소드 호출
		if(gasState) {
			System.out.println("출발합니다");
			fourthCar.run();	//Car의 run()메소드 호출
		}
		
		if(fourthCar.isLeftGas()) {	//Car의 isLeftGas()메소드 호출
			System.out.println("gas를 주입할 필요가 없습니다");
		}else {
			System.out.println("gas를 주입하세요");
		}
		
	}

}
