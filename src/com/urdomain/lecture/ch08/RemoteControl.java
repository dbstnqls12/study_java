package com.urdomain.lecture.ch08;

public interface RemoteControl {
	
	public String name = "Subin";
	
	//상수 
	int MAX_VOLUME = 10;	// public static final 생략
	int MIN_VOLUME = 0;
	
	//추상메소드 : 구현 클래스에서 무조건 오버라이드 해야 된다.
	void turnOn();			// public abstract  
	void turnOff();
	void setVolume(int volume);
	
	//디폴트메소드 : public 생략가능
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다");
		}else {
			System.out.println("무음해제합니다");
		}
	}
	
	//정적메소드 : public 생략가능
	static void changeBattery() {
		System.out.println("건전지를 교체합니다");
	}
}
