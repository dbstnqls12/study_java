package com.urdomain.lecture.ch03;

public class DenyLogicOperatorExample {

	public static void main(String[] args) {
		
		boolean play = true;
		boolean play1 = false;
		
//		boolean useNy = true;  	//1
//		boolean delNy = false; 	//0
		
		System.out.println(play); //true
	
		play = !play; // ! (논리부정연산자) : true면 false, false면 true
		System.out.println(play); //false
		
		play = !play; 
		System.out.println(play); //true
		
	
	}
}
