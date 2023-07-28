//ConsumerMethodReferenceExample
package com.nt.methodReference;

import java.util.function.Consumer;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class ConsumerMethodReferenceExample {

	static Consumer<Student> consumer=(n)->System.out.println(n);
	
	static Consumer<Student> consumer2=Student::printActivities;
	
	public static void main(String[] args) {
		//StudentDataBase.getAllStudents().forEach(consumer);  //using lambda
		//StudentDataBase.getAllStudents().forEach(System.out::println);  //using method reference
		StudentDataBase.getAllStudents().forEach(consumer2);
	}//main
	
}//class
