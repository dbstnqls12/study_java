package com.urdomain.lecture.ch16;

import com.urdomain.lecture.test.RemoteControl;
import com.urdomain.lecture.test.Television;

public class RemoteControlExample1 {

	public static void main(String[] args) {
		
		Television television = new Television();
		RemoteControl remoteControl = new Television();
		
		int volume=100;
//		int volume=-10;
	
		television.turnOn();
		remoteControl.setMute(true);
		remoteControl.setMute(false);
		television.setVolume(volume);
		RemoteControl.changeBattery();
		television.turnOff();

		System.out.println();
	}
}

