package com.urdomain.lecture.fuction;

public class Function {

	public static void main(String[] args) {
		
//		함수의 사용
//		int sum = add(3, 4);
//		System.out.println(sum);

		add(3, 4);
		System.out.println(add(3,4));
		
		int minus = minus(5,4);
		System.out.println(minus);
		
		int multiply = multiply(1,4);
		System.out.println(multiply);

		int division= division(10,2);
		System.out.println(division);
		
		int remainder = remainder(6,4);
		System.out.println(remainder);


				
	}
	
//	public 리턴자료형 메소드명 (입력자료형1 입력변수1, 입력자료형2 입력변수2, ...) {
//		...
//		return 리턴값; 리턴자료형이 void인 경우에는 return문이 필요없다.
//	}
	
//	함수 선언
	public static int add(int a, int b) {
		
		int result1 = a + b;
		return result1;
	}
	
	public static int minus(int a, int b) {
		return a-b;
	}
	
	public static int multiply(int a, int b) {
		int result3 = a * b;
		return result3;
	}
	public static int division(int a, int b) {
		
		int result4 = a / b;
		return result4;
	}
	public static int remainder(int a, int b) {
		
		int result5 = a % b;
		return result5;
	} 	
	

	


	
	
	
	



}
