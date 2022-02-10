package com.urdomain.lecture.ch04;

public class IfElseIfElseExample {

	public static void main(String[] args) {
	
		int score = 75;
		
		if(score >= 90) {
			System.out.println("점수가 100~90사이 입니다");
			System.out.println("등급은 A입니다");
			
		}else if(score >= 80){
			System.out.println("점수가 89~80사이 입니다");
			System.out.println("등급은 B입니다");
			
		}else if(score >= 70){
			System.out.println("점수가 79~70사이 입니다");
			System.out.println("등급은 C입니다");
		
		}else if(score >= 60) {
			System.out.println("점수가 69~60사이 입니다");
			System.out.println("등급은 D입니다");
		
		}else {
			System.out.println("점수가 60미만 입니다");
			System.out.println("등급은 E입니다");
		
		}
		
		System.out.println("------------------------------------");
		
		double score1 = 4.5;
		
		if(score1 >= 4.0) {
			System.out.println("등급은 A입니다");
			
		}else if(score1 >= 3.5){
			System.out.println("등급은 B입니다");
			
		}else if(score1 >= 3.0){
			System.out.println("등급은 C입니다");
		
		}else if(score1 >= 3.5) {
			System.out.println("등급은 D입니다");
		
		}else {
			System.out.println("등급은 F입니다");
		
		}	
		
		System.out.println("------------------------------------");
		
		int a = 10;
		int b = 10;
		
		if(a>b) {
			System.out.println(">");
		
		}else if(a<b){
			System.out.println("<");
		
		}else {
			System.out.println("==");
		} //==출력
		
		
				
		
	}
}
