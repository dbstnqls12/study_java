package com.urdomain.lecture.ch03;

public class LogicalOperatorExample {

	public static void main(String[] args) {
		
		int charCode = 'A'; //65
	
		System.out.println("charCode : "+charCode);
//		&& = & : and 연산 : 모두 참이어야 참
//		|| = | : or 연산	 : 하나만 참이어도 참	
		
		if((charCode>=65) & (charCode<=90)) { //t & t -> t
			System.out.println("대문자군요");
		}

		if((charCode>=97) && (charCode<=122)) { //f && t -> f
			System.out.println("소문자군요");
		}
		
		if((charCode>=48) && !(charCode<=57)) { //f->t &&t->f => f
			System.out.println("0~9 숫자군요");
		}
		
		System.out.println("-------------------------------------------");
		
		if((charCode>=65) | (charCode<=90)) { //t | t -> t
			System.out.println("대문자군요");
		}
		
		if((charCode>=97) || (charCode<=122)) { //f && t -> t
			System.out.println("소문자군요");
		}
		
		if((charCode>=48) || !(charCode<=57)) { //f->t &&t->f => t
			System.out.println("0~9 숫자군요");
		}
		
		
		System.out.println("-------------------------------------------");
		
		
		int value = 6;
		
		if((value%2==0) | (value%3==0)) { //t | t -> t
			System.out.println("2또는 3의 배수군요");
		}
		
		if((value%2==0) || (value%3==0)) { //t | t -> t
			System.out.println("2또는 3의 배수군요");
		}
		
		
	}
}
