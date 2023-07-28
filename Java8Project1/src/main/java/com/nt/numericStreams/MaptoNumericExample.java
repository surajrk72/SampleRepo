//MaptoNumericExample
package com.nt.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MaptoNumericExample {

	public static List<Integer> maptoObject(){
		return IntStream.rangeClosed(1,50)
		.mapToObj(value -> new Integer(value))
		.collect(Collectors.toList());
	}
	
	public static long maptoLong() {
		return IntStream.rangeClosed(1, 5)
		.mapToLong(i->i)
		.sum();
	}
	
	public static double mapToDouble() {
		return IntStream.rangeClosed(1,5)
				.mapToDouble(s->s)
				.sum();
	}
	
	public static void main(String[] args) {
		System.out.println(maptoObject());
		
		System.out.println(maptoLong());
		
		System.out.println(mapToDouble());
	}//main
	
}//class
