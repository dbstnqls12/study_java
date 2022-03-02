package com.urdomain.lecture.ch07;

public class SupersonicAirplaneExample {

	public static void main(String[] args) {
		
		SupersonicAirplane supersonicAirplane = new SupersonicAirplane();

//		supersonicAirplane.takeOff();
//		supersonicAirplane.fly();
//		supersonicAirplane.flyMode = SupersonicAirplane.SUPERSONIC;
//		supersonicAirplane.fly();
//		supersonicAirplane.flyMode = SupersonicAirplane.NORMAL;
//		supersonicAirplane.fly();
//		supersonicAirplane.land();
		
		
//		상수파일 생성 후 코드
		supersonicAirplane.takeOff();
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.SUPERSONIC;
		supersonicAirplane.fly();
		supersonicAirplane.flyMode = Constants.NORMAL;
		supersonicAirplane.fly();
		supersonicAirplane.land();
		
		
		
	}
}
