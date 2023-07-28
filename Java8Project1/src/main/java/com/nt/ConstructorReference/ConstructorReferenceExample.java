//ConstructorReferenceExample
package com.nt.ConstructorReference;

import java.util.function.Function;
import java.util.function.Supplier;

import com.nt.data.Student;

public class ConstructorReferenceExample {

	static Supplier<Student> supplier=Student::new;
	
	static Function<String, Student> function=Student::new ;
	
	public static void main(String[] args) {
		System.out.println(supplier.get());
		
		System.out.println(function.apply("suraj"));
	}//main
	
}//class
