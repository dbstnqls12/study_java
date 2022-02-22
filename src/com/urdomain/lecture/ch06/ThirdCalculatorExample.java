package com.urdomain.lecture.ch06;

public class ThirdCalculatorExample {

	public static void main(String[] args) {
		
		ThirdCalculator thirdCalculator = new ThirdCalculator();
		
		double result1 = thirdCalculator.areaRectangle(2);	//정사각형

		double result2 = thirdCalculator.areaRectangle(2,4);	//직사각형
		
		System.out.println("사각형의 넓이 : "+result1);
		System.out.println("사각형의 넓이 : "+result2);
	}
}
