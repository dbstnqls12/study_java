package com.urdomain.lecture.ch04;

public class ContinueExample {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) { //홀수라면 i++
				continue;
			}
			System.out.println(i); //2 4 6 8 10
		}
	}
}
