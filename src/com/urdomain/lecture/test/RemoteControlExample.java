package com.urdomain.lecture.test;

public class RemoteControlExample {

	public static void main(String[] args) {
		
		Television television = new Television();
		RemoteControl remoteControl = new Television();
		
//		int volume=100;
		int volume=-10;
	
		television.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		television.setVolume(volume);
		RemoteControl.changeBattery();
		television.turnOff();

		System.out.println();

	}
}
