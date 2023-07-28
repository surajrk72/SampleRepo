//ParallelStreamExample2
package com.nt.parallelStream;

import java.sql.Time;
import java.util.List;
import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class ParallelStreamExample2 {

	public static List<String> printStudentActivitiesSequentional() {
		long startTime=System.currentTimeMillis();
		List<String> list = StudentDataBase.getAllStudents().stream().map(Student::getActivities)// List<List<String>>
				.flatMap(List::stream) // LIst<String>
				.distinct() // it removes duplicates
				.sorted()
				.collect(Collectors.toList());
		long endTime=System.currentTimeMillis();
		System.out.println("time taken for Sequentional method is :"+(endTime-startTime));
		return list;
	}// printStudentActivities
	
	public static List<String> printStudentActivitiesParallel() {
		long startTime=System.currentTimeMillis();
		List<String> list = StudentDataBase.getAllStudents().parallelStream().map(Student::getActivities)// List<List<String>>
				.flatMap(List::stream) // LIst<String>
				.distinct() // it removes duplicates
				.sorted()
				.collect(Collectors.toList());
		long endTime=System.currentTimeMillis();
		System.out.println("time taken for Parallel method is :"+(endTime-startTime));
		return list;
	}// printStudentActivities
	
	public static void main(String[] args) {
		
		printStudentActivitiesSequentional();
		printStudentActivitiesParallel();
	}//main
	
}//class
