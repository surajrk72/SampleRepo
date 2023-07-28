//OrElseOrElseGetOrelseThrow
package com.nt.optional;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class OrElseOrElseGetOrelseThrow {

	public static String optionalOrElse() {
		Optional<Student> result = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		return result.map(Student::getName).orElse("Default");
	}
	
	public static String optionalOrElseGet() {
		Optional<Student> result = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		return result.map(Student::getName).orElseGet(()->"Default");
	}
	
	public static String optionalOrElseThrough() {
		Optional<Student> result = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		return result.map(Student::getName).orElseThrow(()->new RuntimeException("No data Found"));
	}
	
	
	public static void main(String[] args) {
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		System.out.println(optionalOrElseThrough());
	}//main
	
}//class
