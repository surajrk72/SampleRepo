//StreamMapReduce
package com.nt.Streams;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class StreamMapReduceFilter {

	public static int noOfNoteBooks() {
		return StudentDataBase.getAllStudents().stream()
				.filter(s -> s.getGradeLevel() >= 3)
				.filter(s -> s.getGender().equalsIgnoreCase("female"))
				.map(Student::getNoteBooks)
				// .reduce(0,(a,b)->a+b);
				.reduce(0,Integer::sum);

	}// noOfNoteBooks

	public static void main(String[] args) {

		System.out.println("Total Number of Books Students have ");
		System.out.println(noOfNoteBooks());

	}// main

}// class
