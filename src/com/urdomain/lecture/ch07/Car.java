package com.urdomain.lecture.ch07;

public class Car {

	public int speed;
	
	public void speedUp() {
		speed += 1;
	}
	
	public final void stop() {
		System.out.println("자동 멈춤");
		speed = 0;
	}
	
}
