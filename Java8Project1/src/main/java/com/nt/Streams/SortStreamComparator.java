//SortStreamComparator
package com.nt.Streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class SortStreamComparator {

	
	public static List<Student> getStudentByNames(){
	return	StudentDataBase.getAllStudents().stream()
		.sorted(Comparator.comparing(Student::getName))
		.collect(Collectors.toList());
	}//getStudentNames
	
	public static List<Student> getStudentByGpa(){
		return	StudentDataBase.getAllStudents().stream()
			.sorted(Comparator.comparing(Student::getGpa).reversed()) //reversed give opposite result asc to dsc or dsc to asc
			.collect(Collectors.toList());
		}//getStudentNames
	
	public static void main(String[] args) {
		System.out.println("Sorted by names-----------");
		getStudentByNames().forEach(System.out::println);
		System.out.println("sorted by Gpa--------------");
		getStudentByGpa().forEach(System.out::println);
	}//main
	
}//class
