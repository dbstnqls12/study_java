package com.urdomain.lecture.ch06;

public class ModifierFirst {	//class : public, (default)만 가능

	public String name = "";	//field : public, protected, (default), private 전체 가능
	public String ssn = "";
	
	public ModifierFirst(String ssn) {	//constructor : public, protected, (default), private 전체 가능
		this.ssn = ssn;
	}
	
	public int add(int x, int y) {	//method : public, protected, (default), private 전체 가능
		return x + y;
	}

}
