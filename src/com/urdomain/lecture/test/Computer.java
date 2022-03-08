package com.urdomain.lecture.test;

public class Computer extends Calculator {

	@Override
	public void areaCircle(int param) {
		super.areaCircle(param);
		
		System.out.println("Computer객체의 원면적 구하는 프로그램 실행");
		
		System.out.println("원면적 : "+Constants.PAI_2 * param * param);
	}
}
