package com.urdomain.lecture.ch06;

public class Television {

	public static String company = "Samsung";
	public static String model = "OLED";
	public static String info;
	public String version = "1.0";
	
//	public static String desc = company + model;
	
	static {
		info = company + "-" + model;	
//		info = company + " " + model + version;	//static으로 선언되지 않은 필드는 들어갈 수 없다 (ex.a 

	
	
	}
}
