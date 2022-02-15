package com.urdomain.lecture.ch05;

public class Exc {

	public static void main(String[] args) {
		
//		2부터 9까지 정수형 배열 변수만들고 for문을 사용하여 구구단 출력
		
		int[] gugu1 = {2,3,4,5,6,7,8,9};
		int[] gugu2 = {1,2,3,4,5,6,7,8,9};
	
		for(int i=0; i<gugu1.length; i++) {
			System.out.println("---- "+gugu1[i]+"단 ----");
			for(int j=0; j<gugu2.length; j++) {
				int result = (gugu1[i]*gugu2[j]);
				System.out.println(gugu1[i]+" X "+gugu2[j]+" = "+result);
			}
		}
	}
}
