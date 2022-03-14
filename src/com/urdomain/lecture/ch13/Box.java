package com.urdomain.lecture.ch13;

public class Box<T> {	
	
	private T t;	//지금 데이터타입 정하지 않고 나중에(Box객체 만들 때) 사용할 떄 정하겠다.

	public T get() {
		return t;
	}

	public void set(T t) {
		this.t = t;
	}
	
}
