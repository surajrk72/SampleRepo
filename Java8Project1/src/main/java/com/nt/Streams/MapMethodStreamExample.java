//MapMethodStreamExample
package com.nt.Streams;

import java.util.List;
import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class MapMethodStreamExample {

	public static List<String> printNames(){
		
		List<String> list = StudentDataBase.getAllStudents().stream()
		.map(Student::getName)
		.map(String::toUpperCase)
		.collect(Collectors.toList());
		return list;
	}//printNames
	
	public static void main(String[] args) {
		System.out.println( printNames());
	}//main
	
}//class
