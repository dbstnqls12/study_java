package com.urdomain.lecture.ch04;

public class SwitchExample {
	
	public static void main(String[] args) {

		int num = 5;

		switch(num) {
		case 1:
			System.out.println("1번");
			break; //빠져나와랏
		
		case 2:
			System.out.println("2번");
			break;
		
		case 3:
			System.out.println("3번");
			break;
		
		case 4:
			System.out.println("4번");
			break;
		
		case 5:  //num이 5면 실행
			System.out.println("5번");
			break;
		
		default:
			System.out.println("0");
			break;
		}
	
	
	}

}
