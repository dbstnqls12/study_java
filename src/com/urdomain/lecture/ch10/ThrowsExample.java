package com.urdomain.lecture.ch10;

public class ThrowsExample {

	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	public static void main(String[] args) {

		try {
			findClass();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
//		  try { 
//			  findClass(); 
//		  }catch(ClassNotFoundException e) {
//			  System.out.println("클래스가 존재하지 않습니다."); 
//		  }
		 
	}
}
