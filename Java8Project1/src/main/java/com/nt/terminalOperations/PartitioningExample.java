//PartitioningExample
package com.nt.terminalOperations;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class PartitioningExample {

	public static void partitioning1() {
		Map<Boolean, List<Student>> result = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.partitioningBy(s->s.getGpa()>=3.8));  //input is predicate
		System.out.println(result);
	}
	
	public static void partitioning2() {
		Map<Boolean, List<Student>> result = StudentDataBase.getAllStudents().stream()
		.collect(Collectors.partitioningBy(s->s.getGpa()>=3.8,Collectors.toList())); //here we can override the out put as tolist
		System.out.println(result);
	}
	
	
	
	public static void main(String[] args) {
		//partitioning1();
		partitioning2();
	}//main
	
}//class
