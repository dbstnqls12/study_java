package com.urdomain.lecture.ch03;

public class IncreaseDecreaseOperatorExample {
	
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		
//		System.out.println(x++);
//		System.out.println(x);
//		System.out.println(++x);
		
		System.out.println("---------------1");
		x++; //11  앞에 다른 연산이 없으니까 그냥 해도됨 ->증감연산자는 단독으로 쓰이면 결과에 차이가 없어
		++x; //12
		System.out.println("x= "+x); //x : 12

		System.out.println("---------------2");
		y--; //9
		--y; //8
		System.out.println("y = "+y); //y : 8

		System.out.println("---------------3"); /*************************/
		z = x++; //연산자가 두개니까 z는 X에 증감되기 전의 값 ->증감되기전에 대입을 한다!
		System.out.println("z = "+z); // 12
		System.out.println("x = "+x); // 13 -> 다른연산 수행후 1 증가
		
		System.out.println("---------------4");
		z = ++x; //14
		System.out.println("z = "+z); //14
		System.out.println("x = "+x); //14
		
		
		System.out.println("---------------");
		z = ++x + y++; //23
		System.out.println("z= "+z); //23
		System.out.println("x= "+x); //15
		System.out.println("y= "+y); //9
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	
}
