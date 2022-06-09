package com.urdomain.lecture.ch16;

public class Calculator2 {

//	Calculator 라는 설계 클래스를 만듭니다.
//	필드는 없으며
//	함수는 PAI_1 을 이용하여 param 으로 원의 반지름을 받으며
	
	public double areaCircle(double r) {
		
		System.out.println("Calculator 객체의 원면적 구하는 프로그램 실행");
		return Constants2.PAI_1 * r * r;

	}
//	리턴은 원의 면적을 계산하여 리터 합니다.
}