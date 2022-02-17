package com.urdomain.lecture.fuction;

import java.util.Scanner;

public class MenuExample {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("오늘의 메뉴는?");
		System.out.println("한식,중식,양식,일식 중 선택 : ");
		String menu = scan.next();
		
		food(menu);
	}
	
	public static void food(String menu) {
		String Kor[] = {"김치찌개","된장찌개","순두부찌개","비빔밥","불고기"};
		String Ch[] = {"짜장면","짬뽕","탕수육","볶음밥","간짜장"};
		String Western[] = {"피자","파스타","햄버거","리조또","스테이크"};
		String Jp[] = {"초밥","우동","돈까스","나베","규동"};
		String food[] = null;
		
		if( menu=="한식") {
			food = Kor;
		}else if(menu=="중식"){
			food = Ch;
		}else if(menu=="양식"){
			food = Western;
		}else if(menu=="일식"){
			food = Jp;
		}	
		int order =(int) Math.random()*5+1;
		System.out.println("오늘의 추천메뉴는 : "+food[order]+"입니다");
	}
	
}
