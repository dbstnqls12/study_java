package com.urdomain.lecture.ch16;

//Computer 라는 설계 클래스를 만듭니다.
//Calculator를 상속 받습니다.
public class Computer2 extends Calculator2{

	@Override
	public double areaCircle(double r) {
		
		System.out.println("Computer 객체의 원면적 구하는 프로그램 실행");
		return Constants2.PAI_2 * r * r;
	
	}


//필드는 없으며
//함수는 PAI_2 을 이용하여 param 으로 원의 반지름을 받으며
//리턴은 원의 면적을 계산하여 리터 합니다. 
	
	
//(단 Calculator에서 생성한 함수를 override 하여 구현)
}
