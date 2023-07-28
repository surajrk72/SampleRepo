//StreamsMinMaxExample
package com.nt.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamsMinMaxExample {

	public static Integer findMaxValue(List<Integer> integer) {
	return	integer.stream()
		.reduce(0,Integer::max);
	}
	
	public static Optional<Integer> findMaxValueOptional(List<Integer> integer) {
		return	integer.stream()
			.reduce(Integer::max);
		}
	
	public static Optional<Integer> findMinValueOptional(List<Integer> integer) {
		return	integer.stream()
				.reduce((a,b)->a<b ?a:b);
			//.reduce(Integer::min);
		}
	
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(2,3,4,5);
		
		List<Integer> integers2=new ArrayList<Integer>();
		System.out.println("maximum value is :"+ findMaxValue(integers));
		Optional<Integer> result = findMaxValueOptional(integers);
		if(result.isPresent())
			System.out.println("maximum value using Optional :"+result.get());
		else
			System.out.println("Input List is Empty");
		
		
		 Optional<Integer> result2 = findMinValueOptional(integers);
		 if(result2.isPresent())
			 System.out.println("minimum value using Optional :"+result2.get());
		 else
			 System.out.println("Input List is Empty");
	}//main
	
}//class
