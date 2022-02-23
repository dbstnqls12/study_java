package com.urdomain.lecture.ch06;

public class ThirdCalculator {

	double areaRectangle(double x) {	//정사각형
		double result1 = x*x;
		return result1;
	}
	double areaRectangle(double x, double y) {	//직사각형
		double result2 = x*y;
		return result2;
	}
	
	
	//다형성 : 생성자 이름이 같아도 변수가 틀리거나 변수의 위치가 다르면 다른 함수처럼 사용가능(?)
}
