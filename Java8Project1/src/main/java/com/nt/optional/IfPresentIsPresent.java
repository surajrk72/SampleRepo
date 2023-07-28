//IfPresentIsPresent
package com.nt.optional;

import java.util.Optional;

public class IfPresentIsPresent {

	
	public static void main(String[] args) {
		Optional<String> result = Optional.ofNullable(null);
		if(result.isPresent()) {
			System.out.println(result.get());  //using isPresent method
		}
		else {
			System.out.println("no input");
		}
		
		result.ifPresent(s->System.out.println(s));  //using ifPresent method
		
		result.ifPresentOrElse(s->System.out.println(s),()->System.out.println("no data found currently"));// using ifPresentOrElse
	}//main
	
}//class
