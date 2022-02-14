	package com.urdomain.lecture.ch04;
	
	public class Test2 {
	
		public static void main(String[] args) {
			
			int Lotto[] = new int[6];
					
			for(int i=0; i<6; i++) {
				
				Lotto[i] = (int) (Math.random()*(45)+1);  //로또번호받기
			
				//중복제거
				
				System.out.println("로또의 "+(i+1)+"번째 숫자는 : "+Lotto[i]+"입니담"); //번호출력
			
			}
		}
	}
