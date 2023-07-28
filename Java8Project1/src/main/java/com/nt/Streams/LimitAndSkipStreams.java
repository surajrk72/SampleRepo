//LimitAndSkipStreams
package com.nt.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class LimitAndSkipStreams {

	public static Optional<Integer> limitMethod(List<Integer> integers) {

		return integers.stream().limit(3).reduce((a, b) -> a * b);

	}// limitMethod

	public static Optional<Integer> skipMethod(List<Integer> integers) {

		return integers.stream().skip(2).reduce((a, b) -> a * b);

	}// skipMethod

	public static void main(String[] args) {

		List<Integer> integers = Arrays.asList(2, 3, 6, 7);
		Optional<Integer> result = limitMethod(integers);
		Optional<Integer> result2 = skipMethod(integers);
		if (result.isPresent()) {
			System.out.println("multiplication of numbers using limit  :"+result.get());
		} else {
			System.out.println("input is empty");
		}
		
		if (result2.isPresent()) {
			System.out.println("multiplication of numbers :"+result2.get());
		} else {
			System.out.println("input is empty");
		}

	}// main

}// class
