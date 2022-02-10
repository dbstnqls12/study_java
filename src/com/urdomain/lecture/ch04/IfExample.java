package com.urdomain.lecture.ch04;

public class IfExample {

	public static void main(String[] args) {
		
		int score = 89;
		
		if(score > 90) { //f
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A입니다.");
		}
		
//		블럭을 구성하지 않으면 바로 다음줄까지만 문장으로 이해하고 실행시킴
		
		if(score < 90)  //t  
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");			

		
	}
}
