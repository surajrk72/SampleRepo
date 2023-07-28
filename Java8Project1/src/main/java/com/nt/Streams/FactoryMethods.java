//FactoryMethods
package com.nt.Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class FactoryMethods {

	public static void main(String[] args) {
		
		Stream<String> stream=Stream.of("suraj","ramkrishna","kurer");//of method
		stream.forEach(System.out::println);
		
		System.out.println("-------------------------------------------------------------");
		
		Stream<Integer> stream2=Stream.iterate(1,x->x*2).limit(20); //iterate method
		stream2.forEach(System.out::println);
	
		System.out.println("-------------------------------------------------------------");
		
		Supplier<Integer> supplier=new Random()::nextInt;
		Stream.generate(supplier).limit(10).forEach(System.out::println);
	}//main
	
}//class
