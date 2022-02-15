package com.urdomain.lecture.ch05;

public class ArrayCreateByNewExample {

	public static void main(String[] args) {
		
//		int[] score = {83,90,87,99};
		
		int[] arr1 = new int[3]; //데이터개수를 선언
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] = 1;
		arr1[1] = 2;
		arr1[2] = 3;
		
		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
	
		arr1[0] = 11;
		arr1[1] = 22;
		arr1[2] = 33;

		for(int i=0; i<3; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		System.out.println("-------------------------------------");
		
//		double[] arr2 = new double[3];
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr2[i]);
//		}
//
//		arr2[0] = 1.0;
//		arr2[1] = 2.0;
//		arr2[2] = 3.0;
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr2[i]);
//		}
//		
//		System.out.println("-------------------------------------");
//		
//		String[] arr3 = new String[3];
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr3[i]);
//		}
//
//		arr3[0] = "윤수빈";
//		arr3[1] = "송중기";
//		arr3[2] = "전지현";
//		
//		for(int i=0; i<3; i++) {
//			System.out.println("arr1[" + i + "] : " + arr3[i]);
//		}
		
		
		
	}
}
