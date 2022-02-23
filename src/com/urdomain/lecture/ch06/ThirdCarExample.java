package com.urdomain.lecture.ch06;

public class ThirdCarExample {
	
	public static void main(String[] args) {
		
		ThirdCar Thirdcar1 = new ThirdCar();
		System.out.println("Third1.company : "+Thirdcar1.company); 
		System.out.println();					//인스턴스 필드
		
		
		ThirdCar Thirdcar2 = new ThirdCar("자가용");
		System.out.println("Third2.company : "+Thirdcar2.company);
		System.out.println("Third2.model : "+Thirdcar2.model);
		System.out.println();
		
		ThirdCar Thirdcar3 = new ThirdCar("자가용", "빨강");
		System.out.println("Third3.company : "+Thirdcar3.company);
		System.out.println("Third3.model: "+Thirdcar3.model);
		System.out.println("Third3.coclor : "+Thirdcar3.color);
		System.out.println();
		
		ThirdCar Thirdcar4 = new ThirdCar("택시", "검정", 100);
		System.out.println("Third4.company : "+Thirdcar4.company);
		System.out.println("Third4.company : "+Thirdcar4.model);
		System.out.println("Third4.company : "+Thirdcar4.color);
		System.out.println("Third4.company : "+Thirdcar4.maxSpeed);
		System.out.println();
		
		double result1 = 10 * 10 * FourthCalculator.pi;
		int result2 = FourthCalculator.plus(10,5);
		int result3 = FourthCalculator.minus(10,5);
		
		System.out.println("result1 : "+result1);
		System.out.println("result2 : "+result2);
		System.out.println("result3 : "+result3);
	
	}

}
