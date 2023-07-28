//ReduceMethodStream
package com.nt.Streams;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Optional;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class ReduceMethodStream {

	public static int performMultiplication(List<Integer> number) {
		return number.stream().reduce(1,(a,b)->a*b);
	}//performMultiplication
	
	public static Optional<Integer> performMultiplicationWithoutIdentity(List<Integer> number) {
		return number.stream().reduce((a,b)->a*b);
	}//performMultiplicationWithoutIdentity
	
	public static Optional<Student> highestGpa(){
	return	 StudentDataBase.getAllStudents().stream()
		.reduce((s1,s2)->(s1.getGpa()>s2.getGpa())?s1:s2);
	}
	
	public static void main(String[] args) {
		List<Integer> integers=Arrays.asList(2,3,6,7);
		List<Integer> integers2=new ArrayList<Integer>();
		System.out.println("with identity--------------->");
		System.out.println(performMultiplication(integers));
		System.out.println("without identity--------------->");
       Optional<Integer> result = performMultiplicationWithoutIdentity(integers2);
		System.out.println(result.isPresent());
		//System.out.println(result.get()); //we will get error if we pass empty list as argument
		
		
		if(result.isPresent()==true) {
			System.out.println(result.get());
		}
		
		
		//to print highest GPA of the student
		System.out.println(highestGpa().get());
		
		
	}//main
	
}//class
