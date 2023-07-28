//BoxingAndUnboxing
package com.nt.numericStreams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class BoxingAndUnboxing {

	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 50).boxed() //boxing to wrapper class type
		.collect(Collectors.toList());
	}
	
	
	public static int  unboxing(List<Integer> integers) {
		int sum = integers.stream().mapToInt(Integer::intValue)
		.sum();
		return sum;
	}
	
	
	public static void main(String[] args) {
		System.out.println(boxing());
		
		List<Integer> integers=boxing();
		System.out.println(unboxing(integers));
	}//main
	
}//class
