//RefrectorMethodReference
package com.nt.methodReference;

import java.util.function.Predicate;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class RefrectorMethodReference {

	//static Predicate<Student> p1=(student)->student.getGpa()>=3.9;
	static Predicate<Student> p1=RefrectorMethodReference::greaterThanGradeLevel;
	
	public static Boolean greaterThanGradeLevel(Student student) {
		return student.getGpa()>=3.9;
	}
	
	public static void main(String[] args) {
		System.out.println(p1.test(StudentDataBase.studentSupplier.get()));
		
		
	}//main
	
}//class
