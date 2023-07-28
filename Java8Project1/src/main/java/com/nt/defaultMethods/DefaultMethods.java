//DefaultMethods
package com.nt.defaultMethods;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class DefaultMethods {

	
	
	public static void main(String[] args) {
	
		List<String> list=Arrays.asList("apple","zibra","cat","donkey","horse");
		//Collections.sort(list);
		//System.out.println(list);
		
		list.sort(Comparator.naturalOrder());  //list default methods
		System.out.println(list);
		
		
		
	}//main
	
}//class
