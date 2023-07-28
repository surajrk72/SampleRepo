//IntStreamExample
package com.nt.numericStreams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class IntStreamExample {

	public static int sumOfNnumbers(List<Integer> integers) {
		return integers.stream().reduce(0,(x,y)->x+y);
	}
	
	public static int sumOfNnumbersByNumericStreams() {
		return IntStream.rangeClosed(1, 7).sum();
	}
	
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(1,2,3,4,5,6,7);
		System.out.println(sumOfNnumbers(integers));
		
		System.out.println(sumOfNnumbersByNumericStreams());
	}//main
	
}//class
