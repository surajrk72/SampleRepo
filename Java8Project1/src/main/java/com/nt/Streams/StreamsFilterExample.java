//StreamsFilterExample
package com.nt.Streams;

import java.util.List;
import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class StreamsFilterExample {

	public static List<Student> filterStudents(){
		return StudentDataBase.getAllStudents().stream()
		.filter(student->student.getGender().equalsIgnoreCase("female"))
		.collect(Collectors.toList());
	}//filterStudents
	
	public static void main(String[] args) {
		filterStudents().forEach(System.out::println);
	}//main
	
}//class
