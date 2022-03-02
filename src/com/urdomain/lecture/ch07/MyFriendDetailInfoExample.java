package com.urdomain.lecture.ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {
		
		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();	//자식생성자
		
		myFriendDetailInfo.setName("윤수빈");
		myFriendDetailInfo.setAge(20);
		myFriendDetailInfo.setAddress("서울");
		myFriendDetailInfo.setPhone("010-1231-1231");
	
		System.out.println("이름 : "+myFriendDetailInfo.getName());
		System.out.println("나이 : "+myFriendDetailInfo.getAge());
		System.out.println("주소 : "+myFriendDetailInfo.getAddress());
		System.out.println("번호 : "+myFriendDetailInfo.getPhone());
		
	}
}

//상속 관계에서의 생성자
// 부모생성자가 기본생성자 : 자식생성자에서 부모생성자 호출하지 않아도 됨(자동처리)
// 부모생성자가 존재 : 자식생성자 블록 최상단에 부모 생성자 호출 (super 사용)