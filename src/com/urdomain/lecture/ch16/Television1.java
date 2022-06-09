package com.urdomain.lecture.ch16;

public class Television1 implements RemoteControl1{

//	필드 : 정수형 volume 로 초기값은 없음, setvloume 의 파라미터로 사용
	int volume;

	
	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

//	setvolume 은 파람으로 받은 값이 RemoteControl 의 max_volume 보다 크면 max_volume 으로 대입되며
//	min_volume 보다 작으면 min_volume으로 대입 되어 “현재 TV 볼륨: ” 그리고 대입된 값이 출력 되도록 함수
//	구성
	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		
		if(volume>RemoteControl1.max_volume) {
			this.volume = RemoteControl1.max_volume;
		}else if (volume>RemoteControl1.min_volume) {
			this.volume = RemoteControl1.min_volume;
		}else {
			this.volume = volume;
		}
		System.out.println("현재 TV볼륨 : "+this.volume);
		
	}
	
	
}
