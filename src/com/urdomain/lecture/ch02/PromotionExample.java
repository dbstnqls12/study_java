package com.urdomain.lecture.ch02;

public class PromotionExample {

	public static void main(String[] args) {
		
		//작은 형 -> 큰 형 변환은 문제발생X
		//큰 형 -> 작은 형 변환은 문제발생 (비정상적으로 실행)
		
		//byte < short < int < long
		//float < double
		
		byte byteValue = 10;
		System.out.println("byteValue : "+byteValue);
		
		int intValue = byteValue;
		System.out.println("intValue : " +intValue);
		
		char charValue = '가';
		System.out.println("charValue : "+charValue);
		
		intValue = charValue;
		System.out.println("가의 유니코드 : "+intValue);
		
		intValue =500;
		long longValue = intValue;
		System.out.println("longValue : " +longValue);
		
		intValue =200;		
		float floatValue = intValue;
		System.out.println("floatValue : "+floatValue);
		
		intValue =200;
		float doubleValue = intValue;
		System.out.println("doubleValue : " +doubleValue );
		
		
	
	}

}
