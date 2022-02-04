package com.urdomain.lecture.ch02;

public class Variable {

	public static void main(String[] args) {
		
		//변수 명명밥
		//첫글자 소문자 그리고 다음 문자열부터는 대문자
		//모드 변수명은 붙여서 사용
		String fullName = "Subin Youn";
		String name = "Subin Youn";
		
		
		//대소문자 구분함
		int roomNumber = 1;
		int roomnumber = 2;
		
		System.out.println("roomnumber : "+roomnumber);
		System.out.println("roomNumber : "+roomNumber);
		
		//예약어는 사용할 수 없다.
		//int int = 2; ->error

//		---------------------------------------------		
		
		//변수 1.선언과 2.사용 (2.1.대입 2.2.읽기)
		//변수 선언
		//변수 초기화 (선언 후 처음으로 값 저장)
		int a;   // 선언만으로는 사용할 수 없다
		a = 1;   // 대입
		int b = 1; // 선언과 초기화
		
		int c = 0;
		
		c = a + b;
		//변수 초기화해야 메모리에 생성되고 연산에 이용될 수 있다.
		
//		---------------------------------------------	
		
		//그러니 변수선언시 초기화하는 습관을 들이자.
		
		//정수형은 0
		//실수형은 0,0
		//문자형은 ''또는 ""
		
		boolean defaultNy = false;

		byte aa = 0;
		short bb = 0;
		int cc = 0;
		long dd = 0;
		
		float ee = 0.0f;
		double ff = 0.0;
		
		char gg = ' ';
		
		String hh = "";
		
//		---------------------------------------------	
		
		//변수사용 (변수값 저장 & 변수값 읽음)
		
		//리터럴 = 데이터
		// ex) 정수형리터럴 = 정수형 데이터
		
		//이스케이프 문자
		System.out.println(c);
		System.out.println("Subin Youn");
		System.out.println("Subin Youn : " + c +" warm!");

		System.out.println("한칸들여쓰기");
		System.out.println("\t한칸들여쓰기");
		System.out.println("\t\t한칸들여쓰기");
		
		System.out.println("한줄바꿈1");
		System.out.println("\n한줄바꿈");
		
		System.out.println("한줄바꿈2");
		System.out.println("\r한줄바꿈");

		System.out.println("\'조금 졸리넴\'");
		System.out.println("수빈 왈 \"아주 조금 졸려.\"");
		System.out.println("\\");
		


		
		
		

	}

}
