//MinByAndMaxBY
package com.nt.terminalOperations;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class MinByAndMaxBY {

	public static Optional<Student> minbyOptional(){
		return StudentDataBase.getAllStudents().stream()
		.collect(Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}
	

	public static Optional<Student> maxbyOptional(){
		return StudentDataBase.getAllStudents().stream()
		.collect(Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}
	
	
	public static void main(String[] args) {
		System.out.println(minbyOptional());
		System.out.println(maxbyOptional());
	}//class
}//class
