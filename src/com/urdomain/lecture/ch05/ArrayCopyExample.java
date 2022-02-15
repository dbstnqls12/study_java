package com.urdomain.lecture.ch05;

public class ArrayCopyExample {
	
	public static void main(String[] args) {
		
		int[] arr1 = {1,2,3};
		int[] arr2 = new int[5];

		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
		System.out.println();
		
		System.arraycopy(arr1, 0, arr2, 0, arr1.length); //(원본, 읽어올위치, 복사대상, 어느부분부터, 얼만큼)
		
		for(int i=0; i<arr2.length; i++) {
			System.out.println(arr2[i]);
		}
		
//		arr2[3] = 4;
//		arr2[4] = 5;
//		
//		for(int i=0; i<arr2.length; i++) {
//			System.out.println(arr2[i]);
	}

}
