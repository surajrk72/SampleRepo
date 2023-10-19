//ComparatorLambdaExample
package com.nt.ComparatorInterface;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {
	Comparator<Integer> comparator=new Comparator<Integer>() {
		
		@Override
		public int compare(Integer o1, Integer o2) {
			
			return o1.compareTo(o2); // 0 if o1=o2
									// 1 if o1>o2
									// -1 if o1<o2
		}//compare
	};//comparator
	
	System.out.println("Result of the comparator is ::"+comparator.compare(3, 2));
	
	
	//in lambda 
	Comparator<Integer> comparator2=(Integer a,Integer b)-> a.compareTo(b);
	
	System.out.println("Result of the comparator usaing lambda is  ::"+comparator2.compare(3, 2));
	

	Comparator<Integer> comparator3=(a, b)-> a.compareTo(b);
	
	System.out.println("Result of the comparator usaing lambda is  ::"+comparator3.compare(3, 2));
	
	System.out.println("suraj");
		
	}//main

}//class
