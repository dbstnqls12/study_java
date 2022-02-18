package com.urdomain.lecture.ch06.exc;

public class Car {

//	field
	String Company = "현대자동차";
	String Model = "그렌다이저";
	String color= "white";

	int maxSpeed = 240;
	int Speed = 0;
	
	int a =2;
	int b =1;
	int c =0;
	
//	method : 함수 : function
	
	//엑셀밟기
	public int aaa(int a) {
		return 1;
	}
	
	//속도올리기
	public int speedUp(int a) {
		
		int finalSpeed = a;
		return finalSpeed;
	}
	
	//기어변경하기
	public String Gear(String a) {
		
		//여기에 기어가 변경되는 알고리즘
		String finalGear="";
		return finalGear;
	}
}
