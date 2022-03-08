package com.urdomain.lecture.ch08;

public class RemoteControlExample2 {	//익명 구현 객체 = 익명클래스

	public static void main(String[] args) {
		RemoteControl rc = new RemoteControl(){

			@Override
			public void turnOn() {
				System.out.println("asdasd");
			}

			@Override
			public void turnOff() {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void setVolume(int volume) {
				// TODO Auto-generated method stub
				
			}
		};
		rc.turnOn();
	}
}
