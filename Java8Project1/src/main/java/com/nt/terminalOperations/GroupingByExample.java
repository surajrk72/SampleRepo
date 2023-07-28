//GroupingByExample
package com.nt.terminalOperations;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;

import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class GroupingByExample {

	public static void groupingBy01() {
		Map<String, List<Student>> result = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));
		System.out.println(result);
	}

	public static Map<String, List<Student>> CustomizedgroupingBy() {
		Map<String, List<Student>> result = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "Extrardinary" : "Average"));
		System.out.println(result);
		return result;
	}

	public static void twoLevelGrouping() {

		Map<Integer, Map<String, List<Student>>> studentMap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student -> student.getGpa() >= 3.8 ? "OUTSTANDING" : "AVERAGE")));

		System.out.println(studentMap);
		
		//Stream.of(studentMap).forEach(System.out::println);

	}
	
	public static void twoLevelGrouping2() {
		Map<String, Integer> studentmap = StudentDataBase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,
						Collectors.summingInt(Student::getNoteBooks)));
		Stream.of(studentmap).forEach(System.out::println);
	}
	
	public static void threeLevelGrouping() {
		Map<String, Set<Student>> result = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getName,LinkedHashMap::new,Collectors.toSet()));
		System.out.println(result);
	}
	
	public static void calculateTopGpa() {
		Map<Integer, Optional<Student>> result = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel
				,Collectors.maxBy(Comparator.comparing(Student::getGpa))));
		System.out.println(result);
	}
	
	public static void calculateTopGpa2() {
		Map<Integer, Student> result = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.groupingBy(Student::getGradeLevel
				,Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparing(Student::getGpa)),Optional::get)
				)); //to remove optional in output
		System.out.println(result);
	}

	public static void main(String[] args) {
		 //groupingBy01();
		//CustomizedgroupingBy();
		//twoLevelGrouping();
		//twoLevelGrouping2();
		//threeLevelGrouping();
		//calculateTopGpa2();
		calculateTopGpa();
	}// main

}// class
