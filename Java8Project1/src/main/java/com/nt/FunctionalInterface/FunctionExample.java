//FunctionExample
package com.nt.FunctionalInterface;

import java.util.function.Function;

public class FunctionExample {

	static Function<String,String> function=(name)->name.toUpperCase();
	static Function<String,String> addSomeStringThen=(string)->string.concat(" kurer");
	
	public static void main(String[] args) {
		System.out.println("the result of function is :"+function.apply("suraj"));
		
		System.out.println("the result of function andThen is :"+function.andThen(addSomeStringThen).apply("suRaj"));
		
		System.out.println("the result of function compose is :"+function.compose(addSomeStringThen).apply("suRaj"));
		
		
	}//main
}//class
