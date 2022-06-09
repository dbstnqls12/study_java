package com.urdomain.lecture.ch16;

public class ComputerExample2 {

	public static void main(String[] args) {
		
		int r =7;
		
		System.out.println("원의 반지름: " + r);
		System.out.println();
		
		Calculator2 calculator = new Calculator2();
		System.out.println("원면적: " + calculator.areaCircle(r));
		
		System.out.println();
		
		Computer2 computer = new Computer2();
		System.out.println("원면적: "+ computer.areaCircle(r));
	}
}
