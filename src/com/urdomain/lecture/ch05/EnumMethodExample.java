package com.urdomain.lecture.ch05;

public class EnumMethodExample {

	public static void main(String[] args) {
		
		//name() 메소드
        Week today = Week.SUNDAY;
        System.out.println(today);	//week의 Sunday
        
        String name = today.name();	//week타입을 String으로 바꿔줌
        System.out.println(name);	//String의 Sunday
        
        //ordinal() 메소드
        int ordinal = today.ordinal();	//인덱스를 보여줌
        System.out.println(ordinal);
        
        //compareTo() 메소드
        Week day1 = Week.MONDAY;	
        Week day2 = Week.WEDNESDAY;	
        int result1 = day1.compareTo(day2);	//day1을 기준으로 밑에 있으면 -, 위에 있으면 +
        int result2 = day2.compareTo(day1);	//day2를 기준으로 밑에 있으면 -, 위에 있으면 +
        System.out.println(result1);	//-2
        System.out.println(result2);	//+2
       
        //valueOf() 메소드
        Week weekDay = Week.valueOf("SUNDAY");
        if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
            System.out.println("주말 이군요");
        } else {
            System.out.println("평일 이군요");
        }
//        if(args.length == 1) {
//            String strDay = args[0];
//            Week weekDay = Week.valueOf(strDay);
//            if(weekDay == Week.SATURDAY || weekDay == Week.SUNDAY) {
//                System.out.println("주말 이군요");
//            } else {
//                System.out.println("평일 이군요");
//            }
//        }
        
        //values() 메소드
        Week[] days = Week.values();
        for(Week day : days) {
            System.out.println(day);
        }
	}
}
