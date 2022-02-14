package com.urdomain.lecture.ch04;

public class BreakOutrerExample {

	public static void main(String[] args) {
		
		Outter: 
		for(char upper='A'; upper<='Z'; upper++) { //유니코드라서 int로 변환됨
			for(char lower ='a';lower<='z';lower++) {
				System.out.println(upper + " - "+lower);
				if(lower=='g') {
					break Outter; //for문보다 더 상위에 있는  outter에서 빠져나오기
				}
			}
		}
		System.out.println("프로그램 실행 종료");
	}
}
