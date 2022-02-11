package com.urdomain.lecture.ch04;

public class IfNestExample {

	public static void main(String[] args) {
		
		int score = 98;
		String grade = "";
		
		if(score >= 90) {
			if(score >=95) {
				grade = "A+";
			}else {
				grade = "A";
			}
		}else if(score >= 80) {
			if(score >=85) {
				grade = "B+";
			}else {
				grade="B";
			}
		}else if(score >= 70) {
			if(score >=75) {
				grade = "C+";
			}else {
				grade="C";
			}
		}else if(score >= 60) {
			if(score >=65) {
				grade = "D+";
			}else {
				grade="D";
			}
		}else {
			grade="F";
		}
		System.out.println("학점 : "+grade);
	
		System.out.println("--------------------------------");
		
		int x = 2;
		int y = -2;
		
		if (x>0) {
			if(y>0) {
				System.out.println("제1사분면");
				
			}else if(y<0) {
				System.out.println("제4사분면");
				
			}else {
				System.out.println("범위 외");
				
			}
		}else if(x<0){
			if(y>0) {
				System.out.println("제2사분면");
			
			}else if(y<0){
				System.out.println("제3사분면");
			
			}else {
				System.out.println("범위 외");
			}
		}else {
			System.out.println("범위 외");
		}
			
		System.out.println("--------------------");
			
		if(x>0 && y>0) {
			System.out.println("제1사분면");
		
		}else if(x<0 && y>0) {
			System.out.println("제2사분면");
		
		}else if(x<0 && y<0) {
		System.out.println("제3사분면");
		
		}else if(x>0 && y<0) {
		System.out.println("제4사분면");
		
		}else {
			System.out.println("범위 외");
		}

		
		
	}
	
	
}
