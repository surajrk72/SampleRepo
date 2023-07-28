//OptionalExample
package com.nt.optional;

import java.util.Optional;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class OptionalExample {

	public static Optional<String> getStudentName(){
		Optional<Student> result =//Optional.ofNullable( null);
									Optional.ofNullable( StudentDataBase.studentSupplier.get()); 
		if(result.isPresent())
			return(result.map(Student::getName));
		return Optional.empty();
	}
	
	public static void main(String[] args) {
		Optional<String> name=getStudentName();
		if(name.isPresent())
			System.out.println(name.get().length());
		else
			System.out.println("name not found");
	}//main
	
}//class
