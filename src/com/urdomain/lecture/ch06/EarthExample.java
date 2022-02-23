package com.urdomain.lecture.ch06;

import com.urdomain.lecture.ch05.PersonSecond;	//다른 패키지에 있는 클래스 사용 가능
//import com.urdomain.lecture.ch05.*;	//다른 패키지에 있는 모든 클래스 사용 가능 -> 같은 위치만 가능, 하위X

public class EarthExample {

	public static void main(String[] args) {
		
		System.out.println("지구의 반지름 : "+Earth.EARTH_RADIUS + "km");
		System.out.println("지구의 표면적 : "+Earth.EARTH_SURFACE_AREA + "km^2");
	
		Earth earth = new Earth();
		System.out.println("earth.EARTH_RADIUS : "+earth.EARTH_RADIUS);
		
		System.out.println("Math.PI : "+Math.PI);
		
		PersonSecond personSecond = new PersonSecond("123-123", "뫄뫄뫄");
	}
}
