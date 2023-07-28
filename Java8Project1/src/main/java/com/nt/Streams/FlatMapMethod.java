//FlatMapMethod
package com.nt.Streams;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class FlatMapMethod {

	public static List<String> printStudentActivities() {
		List<String> list = StudentDataBase.getAllStudents().stream().map(Student::getActivities)// List<List<String>>
				.flatMap(List::stream) // LIst<String>
				.distinct() // it removes duplicates
				.sorted()
				.collect(Collectors.toList());
		return list;
	}// printStudentActivities

	public static long printStudentActivitiesCount() {
		long count = StudentDataBase.getAllStudents().stream().map(Student::getActivities)// List<List<String>>
				.flatMap(List::stream) // LIst<String>
				.distinct() // it removes duplicates
				.count();
		return count;
	}// printStudentActivitiesCount

	public static void main(String[] args) {
		System.out.println(printStudentActivities());
		System.out.println(printStudentActivitiesCount());
	}// main

}// class
