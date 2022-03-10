package com.urdomain.lecture.ch10;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
	
//		사전 조치가 더 중요함
		
		String data1 = null;
		String data2 = null;
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		data1 = args[0];
		data1 = args[1];

		int value1 = Integer.parseInt(data1);
		int value2 = Integer.parseInt(data2);
		int result = value1 + value2;
		
		System.out.println(data1 + "+" + data2 +"="+result);

	}
}
