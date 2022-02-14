package com.urdomain.lecture.ch04;

public class BreakExample {

	public static void main(String[] args) {
		
		while(true) { 
			int num = (int)(Math.random()*6) +1;
			System.out.println(num);
			if(num == 6) {
				break; //6이면 무한루프 탈출
			}
		}
		System.out.println("process ended!");
	}
}
