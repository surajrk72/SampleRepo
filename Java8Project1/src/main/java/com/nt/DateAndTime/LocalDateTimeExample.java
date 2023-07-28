//LocalDateTimeExample
package com.nt.DateAndTime;

import java.time.LocalDateTime;

public class LocalDateTimeExample {

	public static void main(String[] args) {
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println(localDateTime);
		
		System.out.println("local date time of :"+LocalDateTime.of(2023,07,12,12,12,12,1241874));
	}//main
	
}//class
