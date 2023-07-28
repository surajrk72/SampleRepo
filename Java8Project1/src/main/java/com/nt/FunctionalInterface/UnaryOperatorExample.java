//UnaryOperatorExample
package com.nt.FunctionalInterface;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

	static UnaryOperator<String> operator=(name)-> name.concat("kurer");
	
	public static void main(String[] args) {
		System.out.println( operator.apply("Suraj"));
	}//main
	
}//class
