package com.urdomain.lecture.ch06;

public class ThirdCar {
	
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	public ThirdCar() {
		
	}

	public ThirdCar(String model){
		this(model, null, 0);
	}

	public ThirdCar(String model, String color) {
		this(model, color, 0);
	}

	public ThirdCar(String model, String color, int maxSpeed) {
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
//	public SecondCar() {
//		
//	}
//
//	public SecondCar(String model){
//		this.model = model;
//
//	}
//
//	public SecondCar(String model, String color) {
//		this.model = model;
//		this.color = color;
//	}
//
//	public SecondCar(String model, int maxSpeed) {
//		this.model = model;
//		this.maxSpeed = maxSpeed;
//	}
//	
//	public SecondCar(String model, String color, int maxSpeed) {
//		this.model = model;
//		this.color = color;
//		this.maxSpeed= maxSpeed;
//		
//	}
}
