//BinaryoperatorExample
package com.nt.FunctionalInterface;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class BinaryoperatorExample {

	static BinaryOperator<Integer> binaryOperator=(a,b)->a*b;
	
	
	static Comparator<Integer> comparator=(a,b)->a.compareTo(b);
	public static void main(String[] args) {
		System.out.println(binaryOperator.apply(4,5));
		//BinaryOperator<Integer> maxBy=BinaryOperator.maxBy(comparator);
		//System.out.println("maxBy :"+maxBy.apply(4,5));
		System.out.println("maxBy :"+ BinaryOperator.maxBy(comparator).apply(4,5));
	}//main
	
}//class
