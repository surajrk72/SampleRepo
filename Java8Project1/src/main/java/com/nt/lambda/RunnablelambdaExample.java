package com.nt.lambda;

public class RunnablelambdaExample {

	public static void main(String[] args) {
		Runnable runnable=new Runnable() {
			
			@Override
			public void run() {
				System.out.println("inside Runnable 1");
				
			}//run
		};//runnable
		
		
		Runnable runnable2=()->{
			System.out.println("inside Runnable 2");
		};//runnable2
		
		Runnable runnable3=()->System.out.println("inside Runnable 3");
		
		new Thread(runnable).start();
		new Thread(runnable2).start();
		new Thread(runnable3).start();
		
		new Thread(()->System.out.println("inside Runnbale 4")).start();
		
		
		
	}//main

}//class
