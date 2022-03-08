package com.urdomain.lecture.ch08;

public class Example {
	
	public static void main(String[] args) {
		InterfaceA interfaceA = new ImplementationC();
		InterfaceB interfaceB = new ImplementationC();
		InterfaceC interfaceC = new ImplementationC();
		
		interfaceA.methodA();
		interfaceB.methodB();
		interfaceC.methodC();
		
		
	}
}
