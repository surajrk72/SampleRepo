//FindyAnyAndFindFirst
package com.nt.Streams;

import java.util.Optional;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class FindyAnyAndFindFirst {

	public static Optional<Student> findAnyMethod() {
		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() > 3.8).findAny();
	}
	
	public static Optional<Student> findFirstMethod() {
		return StudentDataBase.getAllStudents().stream().filter(student -> student.getGpa() > 3.8).findFirst();
	}

	public static void main(String[] args) {

		System.out.println("result of findany :"+findAnyMethod());
		
		System.out.println("result of findfirst :"+findFirstMethod());
	}// main

}// class
