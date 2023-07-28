//CountingMethod
package com.nt.terminalOperations;

import java.util.stream.Collectors;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class CountingMethod {

	public static long count1() {
		return StudentDataBase.getAllStudents().stream()
		.collect(Collectors.counting());
	}
	
	public static long count2() {
		return StudentDataBase.getAllStudents().stream()
				.filter(s->s.getGpa()>=3.9)
		.collect(Collectors.counting());
	}
	
	public static void main(String[] args) {
		
		System.out.println(count1());
		
		System.out.println(count2());
		
	}//main
	
}//class
