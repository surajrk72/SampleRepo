//SupplierExample
package com.nt.FunctionalInterface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class SupplierExample {

	static Supplier<Student> supplier=()->{
		return new Student("Adam",2,3.6,null, Arrays.asList("swimming", "basketball","volleyball"));
	};//supplier
	
	static Supplier<List<Student>> supplier2=()-> StudentDataBase.getAllStudents();
	
	public static void main(String[] args) {
		
		//System.out.println(supplier.get());
		System.out.println(supplier2.get());
		supplier2.get().forEach(System.out::println);
		
	}//main
	
}//class
