package com.urdomain.lecture.ch16;

public class Test {

	public static void main(String[] args) {
		
		int myAge = 30;				
		String myGender = "male";	
		int yourAge = 25;		
		String yourGender = "male";
		
		if(myAge == yourAge) {
			System.out.println("동무");
		} else if (myGender == "male") {
			if (yourGender == "male") {
				if (myAge > yourAge) {
					System.out.println("남동생");
				} else {
					System.out.println("형");
				}
			} else {
				if (myAge > yourAge) {
					System.out.println("여동생");
				} else {
					System.out.println("누나");
				}
			}
			
		} else if (myGender == "female") {
			if (yourGender == "male") {
				if (myAge > yourAge) {
					System.out.println("남동생");
				} else {
					System.out.println("오빠");
				}				
			} else {
				if (myAge > yourAge) {
					System.out.println("여동생");
				} else {
					System.out.println("언니");
				}				
			}
		} else {
			
		}

	}
}
