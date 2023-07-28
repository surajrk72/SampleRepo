//NumericAgregateFunctions
package com.nt.numericStreams;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericAgregateFunctions {

	public static void main(String[] args) {
		int sum1 = IntStream.rangeClosed(1, 50).sum();
		System.out.println(sum1);
		
		int sum2 = IntStream.range(1, 50).sum();
		System.out.println(sum2);
		
		OptionalInt max1 = IntStream.rangeClosed(1, 50).max();
		System.out.println(max1.isPresent()?max1.getAsInt():0);
		
		OptionalInt max2 = IntStream.range(1, 50).max();
		System.out.println(max2.isPresent()?max2.getAsInt():0);
		
		OptionalInt min1 = IntStream.rangeClosed(1, 50).min();
		System.out.println(min1.isPresent()?min1.getAsInt():0);
		
		OptionalInt min2 = IntStream.range(1, 50).min();
		System.out.println(min2.isPresent()?min2.getAsInt():0);
		
		OptionalDouble avg1 = IntStream.rangeClosed(1, 50).average();
		System.out.println(avg1.isPresent()?avg1.getAsDouble():0);
		
		OptionalDouble avg2 = IntStream.range(1, 50).average();
		System.out.println(avg2.isPresent()?avg2.getAsDouble():0);
		
	}//class
	
}//class
