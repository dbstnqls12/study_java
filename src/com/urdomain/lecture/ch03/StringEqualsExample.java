package com.urdomain.lecture.ch03;

public class StringEqualsExample {

	public static void main(String[] args) {
		
		//데이터가 같으면 같은 주소에 넣는다 
		String str1 = "윤수빈"; 
		String str2 = "윤수빈"; 
		//새로 선언하고 초기화 (=변수 새로 선언)
		String str3 = new String("윤수빈"); //-> 메모리 차지
		
		boolean result1 = (str1 == str2); //저장하고 있는 주소가 같기때문에
		System.out.println("result1 = "+result1);	//true
		
		boolean result2 = (str1 == str3); //저장하고 있는 주소가 다르기때문에
		System.out.println("result2 = "+result2);	//false

		//equals는 주소값 비교가 아니라 들어간 값을 비교
		System.out.println("str1.equals(str2) : "+str1.equals(str2)); //참조형 객체는 ==(x), equals사용
		System.out.println("str1.equals(str3) : "+str1.equals(str3)); //주소값은 다르지만 주소에 들어간 값은 같아서
		
		
//		  boolean result2 = (num1 != num2); 
//		  boolean result3 = (num1 <= num2);
//		  System.out.println("result2 = "+result2); //false
//		  System.out.println("result3 = "+result3); //true
		 
	
	}
}
