//SortingUsingComaparator
package com.nt.defaultMethods;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class SortingUsingComaparator {

	 static Consumer<Student> consumer=(s->System.out.println(s));
	static Comparator<Student> comparator2=Comparator.comparingDouble(Student::getGpa);
	static Comparator<Student> comparator=Comparator.comparing(Student::getName);
	
	public static void sortByName(List<Student> students) {
		
		
		
		students.sort(comparator);
		students.forEach(consumer);
	}
	
	public static void sortByGpa(List<Student> students) {
		students.sort(comparator2);
		students.forEach(consumer);
	}
	
	public static void sortByGpaAndName(List<Student> students) {
		//using nulls first ..it will show null values at first
		//using nullsLast ..it will show null values at last
		Comparator<Student> comparator3 = Comparator.nullsLast(comparator2.thenComparing(comparator)); 
		students.sort(comparator3);
		students.forEach(consumer);
	}
	
	
	
	public static void main(String[] args) {
		List<Student> students=StudentDataBase.getAllStudents();
		//sortByName(students);
		//sortByGpa(students);
		sortByGpaAndName(students);
	}//main
	
}//class
