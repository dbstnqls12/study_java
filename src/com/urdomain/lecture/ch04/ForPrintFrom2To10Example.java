package com.urdomain.lecture.ch04;

public class ForPrintFrom2To10Example {

	public static void main(String[] args) {
		
//		초기화식
//		조건식
//		증감식
		
		for(int i=1; i<=10; i++) { //2 3 ....11
			System.out.println(i);
		}
		
		System.out.println("-------------------------");
		
		int sum = 0;
		for(int i=1; i<=10; i++) { 
			sum += i;
			//sum = sum + i
		}
		System.out.println(sum);
		
		System.out.println("-------------------------");
		
		for(int i=2; i<=9; i++) {
			System.out.println("---- "+i+"단"+" ----");
			for(int j=1; j<=9; j++) {
				System.out.println(i+" X "+j+" = "+(i*j));
			}
		}
		
		
		
		
		
		System.out.println("-------------------------");

//		int sum1 = 0;
//		int sum2 = 0;
//			
//		for(int i=2; i<=10; i++) {
//			if((i % 2)==0){
//				sum1 += i;
//			}
//		}
		
	}
}
