package com.urdomain.lecture.ch05;

public class AdvancedForExample {

	public static void main(String[] args) {
		
		int[] scores = {95, 71, 84, 93, 87, 88, 55};

		int a = 0;
		for(int score : scores) { //배열안에 데이터 있는만큼 다 뽑아줌
		//	int score = scores[a];
			System.out.println(a + " : score : "+score);
			a++;
		}
		
//		for(int i=0; i<scores.length; i++) {
//			System.out.println(scores[i]);
//		}
		
		
		
	}
}
