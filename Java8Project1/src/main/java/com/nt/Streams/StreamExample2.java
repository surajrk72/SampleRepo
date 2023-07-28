//StreamExample2
package com.nt.Streams;

import java.util.ArrayList;
import java.util.Arrays;

public class StreamExample2 {

	public static void main(String[] args) {
		
		 ArrayList<String> arrayList=new ArrayList<String>();
		 arrayList.add("suraj");
		 arrayList.add("swati");
		 arrayList.add("seetha");
		 System.out.println(arrayList);
		 arrayList.stream();
		 arrayList.remove(0);
		 System.out.println(arrayList);
	}//main
	
}//class
