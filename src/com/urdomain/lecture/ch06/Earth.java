package com.urdomain.lecture.ch06;

public class Earth {

	static final double EARTH_RADIUS = 6400;	//객체선언 필요X, 데이터 바꿀 수 X
	static final double EARTH_SURFACE_AREA;

	static {
		EARTH_SURFACE_AREA = 4 * Math.PI * EARTH_RADIUS * EARTH_RADIUS;
								//상수
	}
	
	static final String Home_URK = "http://www.list.co.kr/main";
	
}
