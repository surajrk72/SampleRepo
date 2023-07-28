//FunctionMethodReference
package com.nt.methodReference;

import java.util.function.Function;

public class FunctionMethodReference {

	static Function<String,String> function=(name)->name.toUpperCase(); //using lambda 
	static Function<String,String> function2=String::toUpperCase; //using method reference
	
	
	public static void main(String[] args) {
		System.out.println( function.apply("suraj"));
		
		System.out.println(function2.apply("jsakhfijkh"));
	}//main 
	
}//class
