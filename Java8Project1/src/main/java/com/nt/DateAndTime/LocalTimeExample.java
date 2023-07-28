//LocalTimeExample
package com.nt.DateAndTime;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		
		LocalTime localTime = LocalTime.now();
		System.out.println("Present time is :"+localTime);
		LocalTime localTime1 = LocalTime.of(2, 14);
		System.out.println("localTime1 : "+localTime1);
		LocalTime localTime2 = LocalTime.of(2,14,59);
		System.out.println("localTime1 : "+localTime2);
		LocalTime localTime3 = LocalTime.of(2,14,59,354563416);
		System.out.println("localTime1 : "+localTime3);
		
		System.out.println("getHour :"+localTime.getHour());
		System.out.println("getMinute :"+localTime.getMinute());
		System.out.println("getSecond :"+localTime.getSecond());
		
		System.out.println("getHour ChronoField CLOCK_HOUR_OF_DAY :"+localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		
		System.out.println("toSecondOfDay :"+localTime.toSecondOfDay());
		
		System.out.println("getHour in minus 2 hrs :"+localTime.minusHours(2));
		System.out.println("getHour in minus 2 hrs ChronoUnit.HOURS :"+localTime.minus(2,ChronoUnit.HOURS));
		
		System.out.println("Noon  :"+localTime.with(LocalTime.NOON));
		
		System.out.println("Midnight  :"+localTime.with(LocalTime.MIDNIGHT));
		
		System.out.println("with hour time  :"+localTime.withHour(9));
		System.out.println("plus hour  :"+localTime.plusHours(2));



		
	}//main
	
}//class
