//ParallelStreamExample
package com.nt.parallelStream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static long checkPerformanceTest(Supplier<Integer> supplier, int numberOfTimes) {
		long startTime = System.currentTimeMillis();
		for (int i = 0; i < numberOfTimes; i++) {

			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime - startTime;
	}

	public static int sumSquentionalStream() {
		return IntStream.rangeClosed(1, 100000).sum();
	}

	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100000).parallel().sum();
	}

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(
				"Sequentional result ::" + checkPerformanceTest(ParallelStreamExample::sumSquentionalStream, 200));
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(
				"Parallel result ::" + checkPerformanceTest(ParallelStreamExample::sumParallelStream, 200));
		System.out.println(Runtime.getRuntime().availableProcessors());
	}// main

}// class
