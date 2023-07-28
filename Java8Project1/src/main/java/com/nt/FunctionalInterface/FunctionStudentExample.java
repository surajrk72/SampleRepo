//FunctionStudentExample
package com.nt.FunctionalInterface;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class FunctionStudentExample {

	static Function<List<Student>,Map<String, Double>> function=(student->{
		Map<String,Double> map=new HashMap<String, Double>();
		student.forEach(stud->{
			if(PredicateStudentExample.p1.test(stud))
				map.put(stud.getName(), stud.getGpa());
		});
		return map;
	});

	
	public static void main(String[] args) {
		System.out.println(function.apply(StudentDataBase.getAllStudents()));
		
	}//main
	
}//class
