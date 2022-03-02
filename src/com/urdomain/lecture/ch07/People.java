package com.urdomain.lecture.ch07;

public class People {

	public String name;
	public String ssn;
	
	//부모에 생성자가 존재 -> 자식도 생성자 있어야 됨
	public People(String name, String ssn) {
		this.name = name;
		this.ssn = ssn;
	}
	
}

//상속 관계에서의 생성자
//부모생성자가 기본생성자 : 자식생성자에서 부모생성자 호출하지 않아도 됨(자동처리)
//부모생성자가 존재 : 자식생성자 블록 최상단에 부모 생성자 호출 (super 사용)