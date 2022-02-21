package com.urdomain.lecture.ch06;

public class SecondCarExample {

	public static void main(String[] args) {
		
		SecondCar secondcar = new SecondCar();
		
		secondcar.model = "소나타";
		
		System.out.println("company : "+secondcar.company);
		System.out.println("model : "+secondcar.model);
		System.out.println("color : "+secondcar.color);
		System.out.println("maxSpeed : "+secondcar.maxSpeed);

		SecondCar secondcar4 = new SecondCar("싼타페");
		
		System.out.println("-----------------");
		System.out.println("company : "+secondcar4.company);
		System.out.println("model : "+secondcar4.model);
		System.out.println("color : "+secondcar4.color);
		System.out.println("maxSpeed : "+secondcar4.maxSpeed);
		
		SecondCar secondcar2 = new SecondCar("그랜저","블랙");
		
		System.out.println("-----------------");
		System.out.println("company : "+secondcar2.company);
		System.out.println("model : "+secondcar2.model);
		System.out.println("color : "+secondcar2.color);
		System.out.println("maxSpeed : "+secondcar2.maxSpeed);
		
		SecondCar secondcar3 = new SecondCar("아반떼","실버",400);
		
		System.out.println("-----------------");
		System.out.println("company : "+secondcar3.company);
		System.out.println("model : "+secondcar3.model);
		System.out.println("color : "+secondcar3.color);
		System.out.println("maxSpeed : "+secondcar3.maxSpeed);
		
	}
}
