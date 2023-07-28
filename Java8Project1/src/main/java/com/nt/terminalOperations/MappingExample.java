//MappingExample
package com.nt.terminalOperations;

import java.util.List;
import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class MappingExample {

	
	
	public static void main(String[] args) {
		
		List<String> list= StudentDataBase.getAllStudents().stream()
		.collect(Collectors.mapping(Student::getName,Collectors.toList()));
		
		System.out.println(list);
		
	}//main
	
}//class
