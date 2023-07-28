package com.nt.FunctionalInterface;

import java.util.List;
import java.util.function.Consumer;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class ConsumerExample {

	static Consumer<Student> consumer1 = student -> System.out.print(student);
	static Consumer<Student> consumer2 = student -> System.err.print(student.getName());
	static Consumer<Student> consumer3 = student -> System.out.println(student.getActivities());

	public static void printStudents() {

		List<Student> students = StudentDataBase.getAllStudents();

		students.forEach(consumer1);

	}// prinStudents

	public static void printNameAndActivities() {

		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(consumer2.andThen(consumer3)); // consumer chaining
	}// printNameAndActivities

	public static void printNameAndActivitiesUsingCondition() {
		
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach((student->{
			if(student.getGradeLevel()>=3 && student.getGpa()>=3.9) {
				consumer2.andThen(consumer3).accept(student);
				//System.out.println(student.getName()+"---"+student.getActivities());
			}
		}));
		
	}// printNameAndActivitiesUsingCondition

}// class
