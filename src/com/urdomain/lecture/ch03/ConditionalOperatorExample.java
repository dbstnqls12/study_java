package com.urdomain.lecture.ch03;

public class ConditionalOperatorExample {

	public static void main(String[] args) {
		
		int score = 85;
		
//		char grade = (score > 90 ? 'A' : 'B');  //참이면 A, 거짓이면 B
		char grade = (score > 90 ? 'A' : (score > 80 ? 'B' : 'C'));  
		
		System.out.println("grade : "+grade);	//B
		

	}
}
