package com.nt.FunctionalInterface;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p1 = a -> a % 2 == 0;
	
	static Predicate<Integer> p2 = b -> b % 5 == 0;
	
	public static void predicateAnd() {
		System.out.println("predicate and rsult is :"+p1.and(p2).test(10));
	}//predicateAnd
	
	public static void predicateOr() {
		System.out.println("predicate or result is :"+p1.or(p2).test(5));
	}//predicateOr
	
	public static void predicateNegate() { //it will reverse the result
		System.out.println("predicate negate result is :"+p1.or(p2).negate().test(2));
	}//predicateOr

	public static void main(String[] args) {
		
		//System.out.println(p1.test(4));
		
		predicateAnd();
		predicateOr();
		predicateNegate();
		
		
	}//main

}//class
