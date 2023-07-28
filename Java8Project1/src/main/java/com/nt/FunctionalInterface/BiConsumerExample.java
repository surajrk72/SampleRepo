package com.nt.FunctionalInterface;

import java.util.List;
import java.util.function.BiConsumer;

import com.nt.data.Student;
import com.nt.data.StudentDataBase;

public class BiConsumerExample {

	public static void main(String[] args) {
		BiConsumer<Integer, Integer> biConsumer2 = (a, b) -> {
			System.out.println("multiplication :" + a * b);
		};

		BiConsumer<Integer, Integer> biConsumer3 = (a, b) -> {
			System.out.println("division :" + a / b);
		};

		biConsumer2.andThen(biConsumer3).accept(10, 5);
		nameAndActivities();

	}

	public static void nameAndActivities() {
		BiConsumer<String, List<String>> biConsumer = (name, activity) -> System.out.println(name + " : " + activity);
		List<Student> students = StudentDataBase.getAllStudents();
		students.forEach(std -> biConsumer.accept(std.getName(), std.getActivities()));
	}

}
