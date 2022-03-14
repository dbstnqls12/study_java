package com.urdomain.lecture.ch13;

public class ProductExample {

	public static void main(String[] args) {
		
		Product<String, Integer> product = new Product<>();
		
		product.setKind("벤츠");
		product.setModel(400);
		
		System.out.println("내가 선물받은 차 : "+product.getKind()+" : "+product.getModel()+"입니다.");
		
//		Tv--------------------------------------------------------
		
		Product<Tv, String> product2 = new Product<>();
//		product2.setKind(new Tv());

		Tv tv = new Tv();
		product2.setKind(tv);
		product2.setModel("OLED TV");
		
		Tv rtTv = product2.getKind();
		String rtString = product2.getModel();
		
		System.out.println(rtTv + " : "+ rtString);
		//product2 -> setKind -> field 로 대입
	
//		Car--------------------------------------------------------
		Product<Car, String> product3 = new Product<>();
//		product3.setKind(new Car());
		
		Car car = new Car();
		product3.setKind(car);
		product3.setModel("소나타");
		
		Car rtcar = product3.getKind();
		String rtString2 = product3.getModel();
		System.out.println(rtcar + " : "+rtString2);
	}
}
