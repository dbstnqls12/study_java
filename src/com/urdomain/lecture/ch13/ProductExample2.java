package com.urdomain.lecture.ch13;

public class ProductExample2 {

	public static void main(String[] args) {
		
		Product<Car, Integer> product = new Product<>();
		
		product.setKind(new Car());
		product.setModel(450);
		
	}
}
