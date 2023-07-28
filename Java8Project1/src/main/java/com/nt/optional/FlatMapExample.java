//FlatMapExample
package com.nt.optional;

import java.util.Optional;

import com.nt.data.Bike;
import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class FlatMapExample {

	public static void flatMapMethod() {
		Optional<Student> result = Optional.ofNullable(StudentDataBase.studentSupplier.get());
		Optional<String> name = result.filter(stud->stud.getGpa()>=3.5)
		.flatMap(Student::getBike)
		.map(Bike::getName);
		
		name.ifPresent(s->System.out.println("name :"+s));
	}
	
	public static void main(String[] args) {
		flatMapMethod();
	}//main
	
}//class
