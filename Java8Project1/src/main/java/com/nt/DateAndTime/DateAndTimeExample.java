//DateAndTimeExample
package com.nt.DateAndTime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.chrono.Chronology;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class DateAndTimeExample {

	public static void main(String[] args) {
		LocalDate localDate = LocalDate.now();
		LocalDate localDate2 = LocalDate.of(2023, 07, 14);
		System.out.println(localDate);
		LocalTime localTime = LocalTime.now();
		System.out.println(localTime);
		LocalDateTime localDateAndTime = LocalDateTime.now();
		System.out.println(localDateAndTime);
		System.out.println("get month :"+localDate.getMonth());
		System.out.println("get day of the week :"+localDate.getDayOfWeek());
		System.out.println("get month value :"+localDate.getMonthValue());
		System.out.println("day of the year:"+localDate.getDayOfYear());
		System.out.println("day of the month :"+localDate.get(ChronoField.DAY_OF_MONTH));
		System.out.println("day of the month :"+localDate.getDayOfMonth());
		
		
		System.out.println("day of the year plus 4 days :"+localDate.plusDays(4));
		System.out.println("day of the year plus 2 months :"+localDate.plusMonths(2));
		System.out.println("day of the year minus 2 days :"+localDate.minusDays(2));
		System.out.println("day of the year with year 2025 :"+localDate.withYear(2025));
		System.out.println("day of the year with chronofield :"+localDate.with(ChronoField.YEAR,2025));
		
		System.out.println("firstDayOfNextMonth:"+localDate.with(TemporalAdjusters.firstDayOfNextMonth()));
		System.out.println("chrounit minus years :"+localDate.minus(2,ChronoUnit.YEARS));
		
		
		System.out.println("is present year is  leap year ?:"+localDate.isLeapYear());
		System.out.println("is leap year ?:"+localDate.ofYearDay(2020, 1).isLeapYear());
		
		System.out.println("is equal ?:"+localDate.isEqual(localDate2));
		System.out.println(" is localdate is before localdate2 :"+localDate.isBefore(localDate2));
		
		
	}//main
	
}//class
