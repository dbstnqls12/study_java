package com.urdomain.lecture.ch06;

public class KoreanExample {

	public static void main(String[] args) {
		
		Korean korean = new Korean();
		
		System.out.println("korean.nation : " + korean.nation);
		System.out.println("korean.name : " + korean.name);
		System.out.println("korean.ssn : " + korean.ssn);
		
		korean.name = "윤수빙";
		korean.ssn = "123123";
		
		System.out.println("------------------------------");
		System.out.println("korean.nation : " + korean.nation);
		System.out.println("korean.name : " + korean.name);
		System.out.println("korean.ssn : " + korean.ssn);
		
		Korean korean2 = new Korean("전지현","234234");
		
		System.out.println("------------------------------");
		System.out.println("korean.nation : " + korean2.nation);
		System.out.println("korean.name : " + korean2.name);
		System.out.println("korean.ssn : " + korean2.ssn);
		
		Korean korean3 = new Korean("송중기","345345");
		
		System.out.println("------------------------------");
		System.out.println("korean.nation : " + korean3.nation);
		System.out.println("korean.name : " + korean3.name);
		System.out.println("korean.ssn : " + korean3.ssn);
	}
}
