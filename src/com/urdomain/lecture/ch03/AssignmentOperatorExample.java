package com.urdomain.lecture.ch03;

public class AssignmentOperatorExample {

	public static void main(String[] args) {
//		대입연산자()
//		단순대입 (=) *****
//		복합대입연산자(+=, -=, *=, %= 등등) **
		
		int result = 0;
		
		result += 10; //result = result + 10;
		System.out.println("result : "+result); //10
		
		result -= 5; //result = result - 5;
		System.out.println("result : "+result); //5 
		
		result *= 3; //result = result * 3;
		System.out.println("result : "+result); //15 
		
		result /= 5; //result = result / 5;
		System.out.println("result : "+result); //3 
		
		result %= 3; //result = result % 3;
		System.out.println("result : "+result); //0 
	}
}
