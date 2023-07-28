//PredicateStudentExample
package com.nt.FunctionalInterface;

import java.util.List;
import java.util.function.Predicate;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class PredicateStudentExample {

	public static Predicate<Student> p1 = (s) -> s.getGradeLevel() >= 3;
	public static Predicate<Student> p2 = (s) -> s.getGpa() >= 3.9;

	public static void filterStudentByGradeLevel() {

		List<Student> student = StudentDataBase.getAllStudents();
		student.forEach((stud -> {
			if (p1.test(stud))
				System.out.println(stud);
		}));

	}// filterStudentByGradeLevel

	public static void filterStudentByGpaLevel() {

		List<Student> student = StudentDataBase.getAllStudents();
		student.forEach((stud -> {
			if (p2.test(stud))
				System.out.println(stud);
		}));

	}//filterStudentByGpaLevel
	
	public static void filterStudents() {
		
		List<Student> students=StudentDataBase.getAllStudents();
		students.forEach((stud -> {
			//if(p1.and(p2).test(stud))
			//if(p1.or(p2).test(stud))
			if(p1.or(p2).negate().test(stud)) //if it returns flase then else part will execute
				System.out.println(stud);
			else {
				System.out.println(stud);
			}
				
		}));
		
	}//filterStudents

	public static void main(String[] args) {

		//filterStudentByGradeLevel();
		//filterStudentByGpaLevel();
		filterStudents();

	}// main
}// class
