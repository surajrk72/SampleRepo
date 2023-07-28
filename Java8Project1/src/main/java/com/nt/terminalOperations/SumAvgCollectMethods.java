//SumAvgCollectMethods
package com.nt.terminalOperations;

import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class SumAvgCollectMethods {

	public static int sum() {
		return StudentDataBase.getAllStudents().stream()
		.collect(Collectors.summingInt(Student::getNoteBooks));
	}
	
	public static Double avg() {
		return StudentDataBase.getAllStudents().stream()
		.collect(Collectors.averagingInt(Student::getNoteBooks));
	}
	
	public static void main(String[] args) {
		System.out.println("total number of notebooks :"+sum());
		
		System.out.println("total number of notebooks average :"+avg());
	}//main
	
}//class
