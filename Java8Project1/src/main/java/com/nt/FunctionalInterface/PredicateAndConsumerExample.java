//PredicateAndConsumerExample
package com.nt.FunctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.jar.Attributes.Name;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class PredicateAndConsumerExample {

	Predicate<Student> p1=(student)-> student.getGradeLevel()>=3;
	Predicate<Student> p2=(student)->student.getGpa()>=3.9;
	
	BiPredicate<Integer,Double> biPredicate=(grade,gpa)->grade>=3 && gpa>=3.9;
	
	BiConsumer<String,List<String>> studenBiConsumer=(name,activities)->System.out.println(name+" : "+activities);
	
	Consumer<Student> studentConsumer=( student->{
		/*if(p1.and(p2).test(student))
			studenBiConsumer.accept(student.getName(), student.getActivities());*/
		
		if(biPredicate.test(student.getGradeLevel(), student.getGpa()))
			studenBiConsumer.accept(student.getName(), student.getActivities());
		
		
	});
	
	public void printNameAndActivities(List<Student> students) {
		students.forEach(studentConsumer);
	}//printNameAndActivities
	
	
	public static void main(String[] args) {
		List<Student> students = StudentDataBase.getAllStudents();
		new PredicateAndConsumerExample().printNameAndActivities(students);
		
		
	}//main
	
}//class
