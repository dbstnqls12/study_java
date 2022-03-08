package com.urdomain.lecture.test;

public class ComputerExample {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		int param = 7;
		
		System.out.println("원의 반지름 : "+param);
		System.out.println();
		computer.areaCircle(param);

	}
}
