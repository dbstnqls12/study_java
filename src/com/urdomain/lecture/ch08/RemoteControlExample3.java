package com.urdomain.lecture.ch08;

public class RemoteControlExample3 {

	public static void main(String[] args) {
		
		RemoteControl remoteControl = new SmartTelevision();
		Searchable searchable = new SmartTelevision();
		
		remoteControl.turnOff();
		remoteControl.turnOn();
//		remoteControl.search();		//error
//
//		searchable.turnOff();
//		searchable.turnOn();
		searchable.search("아이즈원 장원영");
		
		
	}
}
