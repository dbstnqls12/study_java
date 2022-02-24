package com.urdomain.lecture.ch07;

public class MyFriendDetailInfoExample {

	public static void main(String[] args) {
		
		MyFriendDetailInfo myFriendDetailInfo = new MyFriendDetailInfo();
		
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
