package com.urdomain.lecture.ch16;

public interface RemoteControl1 {

//	상수 : max_volume, min_volume, 초기값 10, 0
	int max_volume = 10;
	int min_volume = 0;
	
//	추상메서드 : turnon, furnoff, setvolume(파라미터는 정수형 volume 사용)
	void turnOn();
	void turnOff();
	void setVolume(int volume);

//	디폴트메서드 : setmute(파라미터는 불리언 mute 사용)
//	mute 값에 따라 트루면 “무음처리합니다.” 반대면 “무음해제합니다.” 처리
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음처리합니다.");
		}else {
			System.out.println("무음해제합니다.");
		}
	}
	
//	정적메서드 : changeBattery(반환, 파라미터 없음)
//	“건전지를 교체합니다.” 출력만 수행
	static void changeBattery() {
		System.out.println("건전지를 교체합니다.");
	}
}
