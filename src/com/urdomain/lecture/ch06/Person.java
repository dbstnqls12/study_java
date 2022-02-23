package com.urdomain.lecture.ch06;

public class Person {
	
//	final : 최종 , 초기화
	
	final String nation = "Korea";	//초기화 필수 : 1.선언과 동시에 초기화
	final String ssn;
	String name;
	
	public Person(String ssn, String name) {	//2. 생성자 만들어서 초기화
//		this.nation = nation;	//final은 프로그램 진행되는 동안에 바뀔수 없어 -> final을 지우던가 구문을 지우던가
		this.ssn = ssn;
		this.name = name;
	}
	
//	public void init(String ssn) {	//일반함수에서는 초기화 할 수 없어
//		this.ssn = ssn;
//	}
	
}
