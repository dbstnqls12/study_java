package com.urdomain.lecture.ch04;

public class SwitchExample {
	
	public static void main(String[] args) {
		//int num = 2;
		
	
//		double num = Math.random();
//		System.out.println(num);

		//Math.random() : 0.0 ~ 1.0에 가까운 double형태의 값 보내줌
			
		
		//ex.주사위
		// 첫번쨰 주사위는 몇번입니다
		// 두번째 주사위는 몇번입니다
		// 두수의 합은 얼마입니다.
		
		int num = (int) (Math.random() * (6 - 1 + 1) + 1);
		int num2 = (int) (Math.random() * (6 - 1 + 1) + 1);
		int sum = num + num2;

		
		switch(num) {
			case 1:
				System.out.println("첫번째 주사위는 1번입니다");
				break; 
			
			case 2:
				System.out.println("첫번째 주사위는 2번입니다");
				break;
			
			case 3:
				System.out.println("첫번째 주사위는 3번입니다");
				break;
			
			case 4:
				System.out.println("첫번째 주사위는 4번입니다");
				break;
			
			case 5:  
				System.out.println("첫번째 주사위는 5번입니다");
				break;
			
			default:
				System.out.println("첫번째 주사위는 6번입니다");
				break;
		}
		
		switch(num2) {
			case 1:
				System.out.println("두번째 주사위는 1번입니다");
				break; //까먹지 말아랏
				
			case 2:
				System.out.println("두번째 주사위는 2번입니다");
				break;
				
			case 3:
				System.out.println("두번째 주사위는 3번입니다");
				break;
				
			case 4:
				System.out.println("두번째 주사위는 4번입니다");
				break;
				
			case 5:  
				System.out.println("두번째 주사위는 5번입니다");
				break;
				
			default:
				System.out.println("두번째 주사위는 6번입니다");
				break;
		}
		/*		
		System.out.println("첫번째 주사위는 " + num + "입니다");
		System.out.println("두번째 주사위는 " + num2 + "입니다");*/
		System.out.println("두수의 합은 " + sum + "입니다");
		

		
		
		
	}	
		
	

}
