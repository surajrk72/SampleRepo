//BiFunctionExample
package com.nt.FunctionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class BiFunctionExample {

	static BiFunction<List<Student>, Predicate<Student>,Map<String, Double>> biFunction=((students,studentPredicate)->{
		Map<String, Double> map=new HashMap<String, Double>();
		students.forEach(student->{
			if(studentPredicate.test(student))
				map.put(student.getName(), student.getGpa());
		});
		return map;
	});
	
	public static void main(String[] args) {
		
		System.out.println( biFunction.apply(StudentDataBase.getAllStudents(),PredicateStudentExample.p2));
		
	}//main
}//class
