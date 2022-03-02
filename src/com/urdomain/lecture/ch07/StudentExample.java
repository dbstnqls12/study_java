package com.urdomain.lecture.ch07;

public class StudentExample {
	
	public static void main(String[] args) {
		
		Student student = new Student("Subin", "1231-1231", 21);
		
		System.out.println(student.name);
		System.out.println(student.ssn);
		System.out.println(student.studentNo);

		Student student2 = new Student("Crystal", "1111-2222");
		
		System.out.println(student2.name);
		System.out.println(student2.ssn);
		System.out.println(student2.studentNo);

	}

}
