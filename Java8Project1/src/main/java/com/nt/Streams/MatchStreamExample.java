//MatchStreamExample
package com.nt.Streams;

import com.nt.data.StudentDataBase;

public class MatchStreamExample {

	public static Boolean allMatchMethod() {
		return StudentDataBase.getAllStudents().stream()
		.allMatch(student->student.getGpa()>=3.9);
	}//allMatchMethod
	
	public static Boolean anyMatchMethod() {
		return StudentDataBase.getAllStudents().stream()
		.anyMatch(student->student.getGpa()>=3.9);
	}//anyMatchMethod
	
	public static Boolean noneMatchMethod() {
		return StudentDataBase.getAllStudents().stream()
		.noneMatch(student->student.getGpa()>=4.1);
	}//allMatchMethod
	
	public static void main(String[] args) {
		System.out.println(allMatchMethod());
		System.out.println(anyMatchMethod());
		System.out.println(noneMatchMethod());
	}//main
	
}//class
