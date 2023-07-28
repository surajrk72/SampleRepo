//StreamExample1
package com.nt.Streams;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.nt.FunctionalInterface.PredicateStudentExample;
import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class StreamExample1 {

	public static void main(String[] args) {

		Map<String, List<String>> students = StudentDataBase.getAllStudents().stream()
				.peek(student->{
					System.out.println("StreamExample1.main()----------------->");
					System.out.println(student);
				})
				.filter(PredicateStudentExample.p1)
				.peek(student->{
					System.out.println("StreamExample1.main()----------------->");
					System.out.println(student);
				})
				.filter(PredicateStudentExample.p2)
				.peek(student->{
					System.out.println("StreamExample1.main()----------------->");
					System.out.println(student);
				})
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
		System.out.println(students);
		
	}// main

}// class
