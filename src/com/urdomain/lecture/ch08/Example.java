package com.urdomain.lecture.ch08;

public class Example {
	
	public static void main(String[] args) {
		InterfaceA interfaceA = new ImplementationC();
		InterfaceB interfaceB = new ImplementationC();
		InterfaceC interfaceC = new ImplementationC();
		
		interfaceA.methodA();	//본인 인터페이스에 있는것만 사용가능
		interfaceB.methodB();
		interfaceC.methodC();
		
		
	}
}
